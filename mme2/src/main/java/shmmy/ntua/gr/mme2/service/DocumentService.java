package shmmy.ntua.gr.mme2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import shmmy.ntua.gr.mme2.dao.DocumentDao;
import shmmy.ntua.gr.mme2.model.METADATA;

@Service
public class DocumentService {

	@Autowired
	private DocumentDao documentDao;

	public void setDocumentDao(DocumentDao documentDao) {
		this.documentDao = documentDao;
	}


	public void saveDomain(METADATA metadata) {
		documentDao.saveDomain(metadata);
	}
	
	public List<METADATA> getMetadataCategoryList(){
		return documentDao.getMetadataCategoryList();
	}
	
	public void deleteMetadataById(Long id){
		documentDao.deleteMetadataById(id);
	}
	
}
