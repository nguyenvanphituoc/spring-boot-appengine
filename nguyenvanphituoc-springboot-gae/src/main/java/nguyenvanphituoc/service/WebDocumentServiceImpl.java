package nguyenvanphituoc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nguyenvanphituoc.dao.WebDocumentDaoIF;
import nguyenvanphituoc.model.WebDocument;;

@Service("userDocumentService")
@Transactional
public class WebDocumentServiceImpl implements WebDocumentServiceIF{

   @Autowired
   WebDocumentDaoIF dao;

   public WebDocument findById(int id) {
       return dao.findById(id);
   }

   public List<WebDocument> findAll() {
       return dao.findAll();
   }

   public List<WebDocument> findAllByUserId(int userId) {
       return dao.findAllByUserId(userId);
   }
    
   public void saveDocument(WebDocument document){
       dao.save(document);
   }

   public void deleteById(int id){
       dao.deleteById(id);
   }
    
}