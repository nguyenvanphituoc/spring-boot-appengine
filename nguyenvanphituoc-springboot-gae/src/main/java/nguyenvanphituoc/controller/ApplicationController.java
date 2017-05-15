package nguyenvanphituoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import nguyenvanphituoc.model.FileBucket;
import nguyenvanphituoc.model.WebDocument;
import nguyenvanphituoc.model.WebInfo;
import nguyenvanphituoc.service.WebDocumentServiceIF;
import nguyenvanphituoc.service.WebInfoServiceIF;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class ApplicationController {

	@Autowired
	WebInfoServiceIF webInfoService;
	
	@Autowired
	WebDocumentServiceIF webDocumentService;

	private void initialSidebar(Model model){
		WebInfo home=webInfoService.findById(1001);
		WebInfo deadlines=webInfoService.findById(1002);
		WebInfo special=webInfoService.findById(1003);
		WebInfo key=webInfoService.findById(1004);
		model.addAttribute("news",home);
		model.addAttribute("deadlines",deadlines);
		model.addAttribute("special",special);
		model.addAttribute("key",key);
	}
	
	@RequestMapping("/")
	public String listUploadedFiles(Model model) throws IOException
	{
		initialSidebar(model);
		return "jsp/home";
	}
	
	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model) throws IOException
	{
		model.addAttribute("webpages","completed");
		return "thymeleaf/mytest";
	}
	
	@RequestMapping("/admin")
	public String admin(Model model) throws IOException
	{
		List<WebInfo> webpages=webInfoService.findAllWebPages();
		model.addAttribute("webpages",webpages);
		initialSidebar(model);
		return "jsp/example";
	}

	@RequestMapping(value = { "/{id}" }, method = RequestMethod.GET)
	public String callpaper(Model model, @PathVariable int id){
		WebInfo callpaper=webInfoService.findById(id);
		model.addAttribute("page",callpaper);
		List<WebDocument> documents = webDocumentService.findAllByUserId(id);
		model.addAttribute("documents", documents);
		initialSidebar(model);
		return "jsp/page";
	}

	@RequestMapping(value = { "/latestnewsFirst" }, method = RequestMethod.GET)
	public String latestnewsFirst(Model model){
		WebInfo webInfo=webInfoService.findById(24);
		model.addAttribute("firstnews",webInfo);
		return "jsp/latestnewsFirst";	
	}

	@RequestMapping(value = { "/latestnewsSecond" }, method = RequestMethod.GET)
	public String latestnewsSecond(Model model){
		WebInfo webInfo=webInfoService.findById(25);
		model.addAttribute("secondnews",webInfo);
		return "jsp/latestnewsSecond";	
	}

	@RequestMapping(value = { "/latestnewsThird" }, method = RequestMethod.GET)
	public String latestnewsThird(Model model){
		WebInfo webInfo=webInfoService.findById(26);
		model.addAttribute("thirdnews",webInfo);
		return "jsp/latestnewsThird";	
	}

	@RequestMapping(value = { "/download-document/{docId}/{pageId}" }, method = RequestMethod.GET)
	public String downloadDocument(@PathVariable int docId, @PathVariable("pageId") int pageId, HttpServletResponse response) throws IOException {
		WebDocument document = webDocumentService.findById(docId);
		response.setContentType(document.getType());
        response.setContentLength(document.getContent().length);
        response.setHeader("Content-Disposition","attachment; filename=\"" + document.getName() +"\"");
 
        FileCopyUtils.copy(document.getContent(), response.getOutputStream());
        return "redirect:/" + pageId;
	}
	
	@RequestMapping(value = { "/delete-document/{docId}/{pageId}" }, method = RequestMethod.GET)
	public String deleteDocument(@PathVariable("docId") int docId, @PathVariable("pageId") int pageId) {
		webDocumentService.deleteById(docId);
		return "redirect:/" + pageId;
	}
	
	@RequestMapping(value = { "/edit-webpage-{pageID}" }, method = RequestMethod.GET)
	public String updatePage(@PathVariable String pageID, ModelMap model ) {
		int id=Integer.parseInt(pageID);
		WebInfo webInfo = webInfoService.findById(id);
		model.addAttribute("webInfo", webInfo);
		return "jsp/edit";
	}

	@RequestMapping(value = { "/edit-webpage-{pageID}" }, method = RequestMethod.POST)
	public String savePage(@Valid WebInfo webInfo, @PathVariable int pageID) {
		webInfoService.updateWebpage(webInfo);
		return "redirect:/" + pageID;
	}

	@RequestMapping(value = { "/add-document-{pageId}" }, method = RequestMethod.GET)
	public String addDocuments(@PathVariable int pageId, ModelMap model) {
		WebInfo web = webInfoService.findById(pageId);
		model.addAttribute("web", web);

		FileBucket fileModel = new FileBucket();
		model.addAttribute("fileBucket", fileModel);

		List<WebDocument> documents = webDocumentService.findAllByUserId(pageId);
		model.addAttribute("documents", documents);
		return "jsp/managedocuments";
	}
	
	@RequestMapping(value = { "/add-document-{pageId}" }, method = RequestMethod.POST)
	public String uploadDocument(@Valid FileBucket fileBucket, BindingResult result, 
			ModelMap model, @PathVariable int pageId) throws IOException{
		
		if (result.hasErrors()) {
			System.out.println("validation errors");
			WebInfo web = webInfoService.findById(pageId);
			model.addAttribute("web", web);

			List<WebDocument> documents = webDocumentService.findAllByUserId(pageId);
			model.addAttribute("documents", documents);
			
			return "jsp/managedocuments";
		} else {
			
			System.out.println("Fetching file");
			
			WebInfo web = webInfoService.findById(pageId);
			model.addAttribute("user", web);

			saveDocument(fileBucket, web);

			return "redirect:/add-document-"+pageId;
		}
	}
	
	@RequestMapping(value = { "/delete-page-{pageID}" }, method = RequestMethod.GET)
	public String deletePage(@PathVariable String pageID) {
		int id=Integer.parseInt(pageID);
		webInfoService.deleteUserById(id);

		return "redirect:/admin";
	}

	@RequestMapping(value = { "/new-webpage" }, method = RequestMethod.GET)
	public String newPage(ModelMap model) {
		WebInfo webInfo = new WebInfo();
		model.addAttribute("webInfo", webInfo);
		return "jsp/registation";
	}

	@RequestMapping(value = { "/new-webpage" }, method = RequestMethod.POST)
	public String savePage(@Valid WebInfo webInfo, BindingResult result,
			ModelMap model) 
	{
		webInfoService.saveWebpage(webInfo);
		return "redirect:/admin";
	}
	
	private void saveDocument(FileBucket fileBucket, WebInfo user) throws IOException{
		
		WebDocument document = new WebDocument();
		
		MultipartFile multipartFile = fileBucket.getFile();
		
		document.setName(multipartFile.getOriginalFilename());
		document.setDescription(fileBucket.getDescription());
		document.setType(multipartFile.getContentType());
		document.setContent(multipartFile.getBytes());
		document.setWebInfo(user);
		webDocumentService.saveDocument(document);
	}
}
