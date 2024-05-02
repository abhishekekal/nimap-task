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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.Repository.ProductRepository;
import com.nimap.entity.Category;
import com.nimap.entity.Product;

//@RestController()
@RequestMapping("/api")
@Controller
public class ordercontrollerp {
	
	@Autowired
	SessionFactory fac;
	
@Autowired
private ProductRepository productRepository;

//find all

//@GetMapping("/Products")
//public List<Product>findallp()throws Exception{
//
//	   Session sc=fac.openSession();
//		Query q=sc.createQuery("from Product");
//		List<Product> list=q.list();
//		return list;
//
//		
//}


@GetMapping("/products")
public  String findallp(Model model)throws Exception{

	   Session sc=fac.openSession();
		Query q=sc.createQuery("from Product");
		List<Product> list=q.list();
		model.addAttribute("products",list);
		return "products";

		
}

//save the product

@PostMapping("/cproduct")
public String saveproduct(@ModelAttribute("product") Product product ) {
	System.out.println(product);
Session sce=fac.openSession();
Transaction tx=sce.beginTransaction();
sce.save(product);
tx.commit();
return"cproduct";
	
	
}


// get product by id

@GetMapping("/Products/{pid}")

public Product getbyid(@PathVariable int pid) {
Session sc=	fac.openSession();
Product pro =sc.get(Product.class, pid);
return pro;


}

//update by id

@PutMapping("/products/{pid}")
public  void updateemp(@PathVariable int pid,String pname ,@RequestBody Product product) {
Session sc=	fac.openSession();
Transaction tx=	sc.beginTransaction();
sc.update(pname, product);

tx.commit();

	
}



@DeleteMapping("/products/{pid}")
public String delete(@PathVariable int pid)throws Exception {
 Session sc=fac.openSession();
	Product pro=sc.get(Product.class, pid);
	Transaction tx=sc.beginTransaction();
	sc.delete(pro);
	tx.commit();
	System.out.println("record delete");
	return "Record delete";
}

    






}
