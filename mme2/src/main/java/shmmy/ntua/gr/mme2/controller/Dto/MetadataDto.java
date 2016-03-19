package shmmy.ntua.gr.mme2.controller.Dto;



import shmmy.ntua.gr.mme2.model.Category;

public class MetadataDto {
	private Long metadataId;
	private String rssPath;
	private String name;
	private String logo;
	private int categoryId;
	private Category category;
	
	
	public Long getMetadataId() {
		return metadataId;
	}
	
	
	public MetadataDto(Long metadataId, String rssPath, String name, String logo, int categoryId, Category category) {
		super();
		this.metadataId = metadataId;
		this.rssPath = rssPath;
		this.name = name;
		this.logo = logo;
		this.categoryId = categoryId;
		this.category = category;
	}


	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}
	public String getRssPath() {
		return rssPath;
	}
	public void setRssPath(String rssPath) {
		this.rssPath = rssPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
