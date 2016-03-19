package shmmy.ntua.gr.mme2.dao;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.rowset.serial.SerialBlob;

import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import shmmy.ntua.gr.mme2.model.Category;
import shmmy.ntua.gr.mme2.model.METADATA;


@Repository
public class DocumentDaoImpl  implements DocumentDao{

	@PersistenceContext
	private EntityManager em;
	

	
@Transactional
public void saveDomain(METADATA metadata) {
	
		em.persist(metadata);
		em.flush();
}

@Override
public List<METADATA> getMetadataCategoryList(){
	// TODO Auto-generated method stub
	JinqJPAStreamProvider streams =
		      new JinqJPAStreamProvider(em.getMetamodel());
	return 
			streams.streamAll(em, METADATA.class)
				      .toList();
}
@Transactional
public void deleteMetadataById(Long id){
	METADATA metadata = em.find(METADATA.class, id);
	em.remove(metadata);
}



public Blob getBlobData(MultipartFile file) throws IOException, SQLException {
    byte[] bytes = file.getBytes();
    return new SerialBlob(bytes);
}


}
