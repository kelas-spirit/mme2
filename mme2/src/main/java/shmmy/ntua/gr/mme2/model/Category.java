package shmmy.ntua.gr.mme2.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class Category {
	
	private int categoryId;	
	private String categoryName;
	
	
	public Category(){
		
	}
	/*public Category(int categoryId, String categoryName) {
			super();
			CategoryId = categoryId;
			CategoryName = categoryName;
		}*/
	
	

	@Id
	@GeneratedValue
	//@OneToMany(cascade = CascadeType.ALL)
	@Column(name="CategoryId")
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@Column(name="CategoryName")
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
