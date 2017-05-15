package nguyenvanphituoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nguyenvanphituoc.dao.WebInfoDAOIF;
import nguyenvanphituoc.model.WebInfo;
@Service("webpageService")
@Transactional
public class WebInfoServiceImpl implements WebInfoServiceIF {
	@Autowired
	WebInfoDAOIF dao;
	@Override
	public WebInfo findById(int id) {
	
		return dao.findByid(id);
	}

	@Override
	public void saveWebpage(WebInfo webInfo) {
		dao.save(webInfo);
		
	}

	@Override
	public void updateWebpage(WebInfo webInfo) {
		System.out.println(webInfo.getPage_id());
		String s=webInfo.getPage_id().toString();
		int id=Integer.parseInt(s);
		WebInfo entity=dao.findByid(id);
		if(entity!=null){
			entity.setDescription(webInfo.getDescription());
			entity.setContent(webInfo.getContent());
		}
	}

	@Override
	public void deleteUserById(int id) {
		dao.deleteById(id);
	}

	@Override
	public List<WebInfo> findAllWebPages() {
		return dao.findAllWebpages();
	}

}
