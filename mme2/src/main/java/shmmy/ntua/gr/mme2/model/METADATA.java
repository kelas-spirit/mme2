package shmmy.ntua.gr.mme2.model;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="METADATA")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class METADATA {
	private Long metadataId;
	private String rssPath;
	private String name;
	private String logo;
	private int categoryId;
	private Category category;
	

	

	public METADATA(){
		
	}
	
	/*public METADATA(Long metadataId, String rssPath, String name, Blob logo, String title, int click, int categoryId) {
		super();
		MetadataId = metadataId;
		RssPath = rssPath;
		Name = name;
		Logo = logo;
		Title = title;
		Click = click;
		CategoryId = categoryId;
	}*/

	
	@Id
	@GeneratedValue
	@Column(name="MetadataId")
	public Long getMetadataId() {
		return metadataId;
	}

	public void setMetadataId(Long metadataId) {
		this.metadataId = metadataId;
	}
	@Column(name="RssPath")
	public String getRssPath() {
		return rssPath;
	}

	public void setRssPath(String rssPath) {
		this.rssPath = rssPath;
	}
	@Column(name="Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="Logo")
	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	
	@Column(name="CategoryId")
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@OneToOne()
	@JoinColumn(name="categoryId", insertable = false, updatable = false)
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
