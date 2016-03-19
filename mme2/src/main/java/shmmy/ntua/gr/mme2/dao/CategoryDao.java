package shmmy.ntua.gr.mme2.dao;

import java.util.List;

import shmmy.ntua.gr.mme2.model.Category;

public interface CategoryDao {

	public void saveCategory(Category category);
	public List<Category> getCategoryList();
	public void deleteCategoryById(Long id);
	
	
}
