package com.pms.deloitte.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDao;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
		
		@Autowired
		ProductService productService ;
		/*@RequestMapping("/getAllProducts")
		public List<Product> getAllProducts() {
			return productService.getAllProducts();
			 
		}*/
		
		@RequestMapping(value= "/products", method= RequestMethod.GET)
		public String getAllProducts(Model model) {
			model.addAttribute("product", new Product());
			model.addAttribute("listProducts", this.productService.getAllProducts());
			return "Product";
			 
		}
		
		@RequestMapping(value = "/product/add", method = RequestMethod.POST)
		public String addProduct(@ModelAttribute("product") Product p) {
			System.out.println("#####product :"+p);
			this.productService.addProduct(p);
			return "redirect:/products";
		}
		
		@RequestMapping(value = "/edit/add/update", method = RequestMethod.POST)
		public String updateProduct(@ModelAttribute("product") Product p) {
			System.out.println("#####product updating:"+p);
			this.productService.updateProduct(p);
			return "redirect:/products";
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteProduct(@PathVariable("id")Integer productId)
		{
			productService.deleteProduct(productId);
			return "redirect:/products";
		}
		
		@RequestMapping("/edit/{id}")
		public String editPerson(@PathVariable("id") Integer id, Model model){
	        model.addAttribute("product", this.productService.getProductById(id));
	        model.addAttribute("listProducts", this.productService.getAllProducts());
			return "Product";
	    }
		
		@RequestMapping("/saveProduct")
	    public String saveProduct(Model model)
	    { 
	      model.addAttribute("product",new Product());
	      return "Product";
	   
	    }
		
		@RequestMapping("/saveProductRecord")
	    public String saveProduct(Model model,Product product)
	    { 
	      productService.addProduct(product);
	      model.addAttribute("product",new Product());
	      model.addAttribute("message", product.getProductName()+ " Product saved successfully");

	      return "Product";
	   
	    }
		
	
		
}
