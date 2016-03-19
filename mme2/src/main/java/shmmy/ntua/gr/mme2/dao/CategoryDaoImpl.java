package shmmy.ntua.gr.mme2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jinq.jpa.JinqJPAStreamProvider;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shmmy.ntua.gr.mme2.model.Category;
import shmmy.ntua.gr.mme2.model.METADATA;



@Repository
public class CategoryDaoImpl implements CategoryDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		JinqJPAStreamProvider streams =
			      new JinqJPAStreamProvider(em.getMetamodel());
		return 
				streams.streamAll(em, Category.class)
					      .toList();
	}

	@Transactional
	public void saveCategory(Category category) {
		em.persist(category);
		em.flush();
		
	}

	@Transactional
	public void deleteCategoryById(Long id) {
		System.out.println("dao "+id);
		Category cat = em.find(Category.class, id);
		em.remove(cat);
	}



	

}
