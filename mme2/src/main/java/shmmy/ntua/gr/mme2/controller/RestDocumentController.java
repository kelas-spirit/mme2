package shmmy.ntua.gr.mme2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import shmmy.ntua.gr.mme2.controller.Dto.MetadataDto;
import shmmy.ntua.gr.mme2.controller.Helpers.DocumentHelper;
import shmmy.ntua.gr.mme2.model.Category;
import shmmy.ntua.gr.mme2.model.METADATA;
import shmmy.ntua.gr.mme2.service.CategoryService;
import shmmy.ntua.gr.mme2.service.DocumentService;

@RestController
public class RestDocumentController {

	@Autowired
	private CategoryService categoryService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@Autowired
	private DocumentService documentService;
	

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}
	
	
	
	
	@RequestMapping(value="/category",method = RequestMethod.GET)
    public ResponseEntity<List<Category>> index(){
		
		List<Category> category = categoryService.getCategoryList();    	
    	return new ResponseEntity<List<Category>>(category, HttpStatus.OK);
    }
	
	@RequestMapping(value="/indexadmin",method = RequestMethod.GET, produces = "application/json")	
	public @ResponseBody List<METADATA> getMetadataList(){
		
		DocumentHelper doc = new DocumentHelper();
	    List<METADATA> metadataList=documentService.getMetadataCategoryList();	
		return metadataList;
	}
	
	@RequestMapping(value="/deletemetadata/{id}",method = RequestMethod.POST)	
	public @ResponseBody void deleteMetadata(@PathVariable("id") Long id){
		
		documentService.deleteMetadataById(id);
	}
	
	@RequestMapping(value="/deletecategory/{id}",method = RequestMethod.POST)	
	public @ResponseBody void deleteCategory(@PathVariable("id") Long id){
		
		System.out.println("cntrl");
		categoryService.deleteCategoryById(id);
	}
 
	
	
}
