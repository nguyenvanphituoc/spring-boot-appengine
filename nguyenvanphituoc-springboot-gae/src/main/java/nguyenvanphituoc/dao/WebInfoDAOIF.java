package nguyenvanphituoc.dao;
import java.util.List;
import nguyenvanphituoc.model.WebInfo;
public interface WebInfoDAOIF {
	WebInfo findByid(int id);
	List<WebInfo> findAllWebpages();
	void save(WebInfo webInfo);
	void deleteById(int id);
}
