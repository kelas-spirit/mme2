package shmmy.ntua.gr.mme2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import shmmy.ntua.gr.mme2.dao.CategoryDao;
import shmmy.ntua.gr.mme2.model.Category;
import shmmy.ntua.gr.mme2.model.METADATA;

public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}


	public List<Category> getCategoryList(){
		return categoryDao.getCategoryList();
	}
	
	public void saveCategory(Category category) {
		categoryDao.saveCategory(category);
	}
	
	public void deleteCategoryById(Long id){
		System.out.println("service");

		categoryDao.deleteCategoryById(id);
	}
	
}
