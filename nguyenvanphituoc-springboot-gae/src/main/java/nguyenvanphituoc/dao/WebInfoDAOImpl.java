package nguyenvanphituoc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import nguyenvanphituoc.model.WebInfo;


@Repository("webInfoDAO")
public class WebInfoDAOImpl extends AbstractDao<Integer, WebInfo> implements WebInfoDAOIF{

	@Override
	public WebInfo findByid(int id) {
		WebInfo webInfo=getByKey(id);
		return webInfo;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<WebInfo> findAllWebpages() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("page_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<WebInfo> webInfos = (List<WebInfo>) criteria.list();
		return webInfos;
	}

	@Override
	public void save(WebInfo webInfo) {
		persist(webInfo);
	}
	@Override
	public void deleteById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("page_id", id));
		WebInfo webInfo = (WebInfo)crit.uniqueResult();
		delete(webInfo);
		
	}
	
}
