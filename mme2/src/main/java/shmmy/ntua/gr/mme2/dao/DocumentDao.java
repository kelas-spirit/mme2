package shmmy.ntua.gr.mme2.dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import shmmy.ntua.gr.mme2.model.METADATA;

public interface DocumentDao {
	public void saveDomain(METADATA metadata);
	public List<METADATA> getMetadataCategoryList();
	public void deleteMetadataById(Long id);
}
