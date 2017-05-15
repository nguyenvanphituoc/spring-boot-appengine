package nguyenvanphituoc.service;

import nguyenvanphituoc.model.WebInfo;

import java.util.List;

public interface WebInfoServiceIF {
	WebInfo findById(int id);
	void saveWebpage(WebInfo webInfo);
	void updateWebpage(WebInfo webInfo);
	void deleteUserById(int id);
	List<WebInfo> findAllWebPages();
}
