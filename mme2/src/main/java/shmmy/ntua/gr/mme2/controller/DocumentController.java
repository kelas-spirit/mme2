package shmmy.ntua.gr.mme2.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import shmmy.ntua.gr.mme2.controller.Dto.MetadataDto;
import shmmy.ntua.gr.mme2.model.Category;
import shmmy.ntua.gr.mme2.model.METADATA;
import shmmy.ntua.gr.mme2.service.CategoryService;
import shmmy.ntua.gr.mme2.service.DocumentService;

@Controller
public class DocumentController {

	

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private DocumentService documentService;
	

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
    public ModelAndView index(){
    	ModelAndView mav = new ModelAndView();
    	
    	
		List<Category> category = categoryService.getCategoryList();
    	mav.addObject("categoryList", category);
    	mav.setViewName("index");
    	return mav;
    }
	
	@RequestMapping(value="/administrator/categoreis",method = RequestMethod.GET)
    public ModelAndView categories(){
    	ModelAndView mav = new ModelAndView();
    	
    	
		List<Category> category = categoryService.getCategoryList();
    	mav.addObject("categoryList", category);
    	mav.setViewName("category");
    	return mav;
    }
	
	@RequestMapping(value="/administrator/categorycreate",method = RequestMethod.GET)
    public ModelAndView categorycreate(){
    	ModelAndView mav = new ModelAndView();
    	
		mav.setViewName("categorycreate");
    	return mav;
    }
	
	@RequestMapping(value="/administrator/categorycreate",method = RequestMethod.POST)
    public ModelAndView categorycreate(@RequestParam("categoryName")String categoryName){
    	ModelAndView mav = new ModelAndView();
    	
    	Category cat  = new Category();
    	cat.setCategoryName(categoryName);
		categoryService.saveCategory(cat);
		mav.setViewName("redirect:/administrator/categoreis");
    	return mav;
    }
	
	@RequestMapping(value="/administrator/upload",method = RequestMethod.GET)
    public ModelAndView adminUpload(){
    	ModelAndView mav = new ModelAndView();	
		List<Category> category = categoryService.getCategoryList();
    	mav.addObject("categoryList", category);
    	mav.setViewName("upload");
    	return mav;
    }
	
	 @RequestMapping(value="/administrator/upload",method = RequestMethod.POST)
	public ModelAndView upload(Authentication auth,
			@RequestParam("name")String name,
			@RequestParam("rssPath")String rssPath,
			@RequestParam("selectedCategory")int selectedCategory,
			@RequestParam("logoPath") String logoPath
			){
		 
		
         
		 //this.getClass().getClassLoader().getResource("").getPath()
		ModelAndView mav = new ModelAndView();
		METADATA metadata = new METADATA();
		metadata.setCategoryId(selectedCategory);
		metadata.setName(name);
		metadata.setRssPath(rssPath);
		metadata.setLogo(logoPath);
		documentService.saveDomain(metadata);
		mav.setViewName("redirect:/administrator");
		return mav;
	}
	
	
	@RequestMapping(value="/administrator",method = RequestMethod.GET)
    public ModelAndView indexAdmin(){
    	ModelAndView mav = new ModelAndView();
    	List<MetadataDto> metadataDto = new ArrayList<MetadataDto>();
    List<METADATA> metadataList=documentService.getMetadataCategoryList();
    
    		
    		
    
    	mav.setViewName("admin");
    	
    	return mav;
    }
}
