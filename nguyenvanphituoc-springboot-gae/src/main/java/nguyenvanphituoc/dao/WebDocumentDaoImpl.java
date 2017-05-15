package nguyenvanphituoc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import nguyenvanphituoc.model.WebDocument;;

@Repository("userDocumentDao")
public class WebDocumentDaoImpl extends AbstractDao<Integer, WebDocument> implements WebDocumentDaoIF{
 
    @SuppressWarnings("unchecked")
    public List<WebDocument> findAll() {
        Criteria crit = createEntityCriteria();
        return (List<WebDocument>)crit.list();
    }
 
    public void save(WebDocument document) {
        persist(document);
    }
 
     
    public WebDocument findById(int id) {
        return getByKey(id);
    }
 
    @SuppressWarnings("unchecked")
    public List<WebDocument> findAllByUserId(int userId){
        Criteria crit = createEntityCriteria();
        Criteria userCriteria = crit.createCriteria("webInfo");
        userCriteria.add(Restrictions.eq("page_id", userId));
        return (List<WebDocument>)crit.list();
    }
 
     
    public void deleteById(int id) {
    	WebDocument document =  getByKey(id);
        delete(document);
    }
 
}
