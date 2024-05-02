package com.nimap.controller;





import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.Repository.CategoryRepository;
import com.nimap.Repository.ProductRepository;
import com.nimap.entity.Category;
import com.nimap.entity.Product;




//@RestController()
@Controller
@RequestMapping("/api")
public class ordercontroller {
 
	@Autowired
	SessionFactory fac;
	
	@Autowired
	private CategoryRepository CatRepo;
//	

	//testing api
	
	@GetMapping("/dis")
	public String Display() {
		return "index";
		
	}
	
	
	  
	
	
	
	//find all
	
//		 @GetMapping("/categories")
//			 public  List<Category> findall(Model model)throws Exception{
//			
//				 Session sc=fac.openSession();
//					Query q=sc.createQuery("from Category");
//					List<Category> list=q.list();
//					
//					return list;
//			
//					
//		}
	

	
	 @GetMapping("/categories")
	 public  String findall(Model model)throws Exception{
	
		 Session sc=fac.openSession();
			Query q=sc.createQuery("from Category");
			List<Category> list=q.list();
			model.addAttribute("categories",list);
			return "categories";
	
			
}
	
	
	//new categories create
	
	   @PostMapping("/categories")
		public void savecategories(@RequestBody Category category) {
			System.out.println(category);
		Session sce=fac.openSession();
		Transaction tx=sce.beginTransaction();
		sce.save(category);
		tx.commit();
		System.out.println("done");
			
			
		}
	   
	   
	   // get by id categories
	   
	 @GetMapping("/categories/{cid}")

		public Category getbyid(@PathVariable int cid) {
		Session sc=	fac.openSession();
		Category cat =sc.get(Category.class, cid);
		return cat;
		
		
		}
	 
	 

	
	 
//update by id 
	 
	 @PutMapping("/categories/{cid}")
	 public  void updateemp(@PathVariable int cid,String cname ,String level,@RequestBody Category category) {
	 Session sc=	fac.openSession();
	 Transaction tx=sc.beginTransaction();
	 sc.update(cname, category);

	 tx.commit();

	 	
	 }
	 
	 // delete by id 
	 
	 @DeleteMapping("/categories/{cid}")
		public void delete(@PathVariable int cid) {
		 Session sc=fac.openSession();
			Category emp=sc.get(Category.class, cid);
			Transaction tx=sc.beginTransaction();
			sc.delete(emp);
			tx.commit();
			System.out.println("record delete");
		
		
		
		}
	 
//------------------------------------------------------------
	 //product
	 
	 
	
	 
	 
 
	 

	
	
}
