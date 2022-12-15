package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Product;
import model.Seller;
import serviceImpl.ProductServiceImpl;
import serviceImpl.SellerServiceImpl;

@RestController
@RequestMapping("/Seller")

public class SellerController{
	
@Autowired
private SellerServiceImpl SellerService;
@Autowired
private ProductServiceImpl ProductService;	
	
	@PostMapping("/add-product")
	 public  ResponseEntity<?> addProduct(@RequestBody Product product) {
		ResponseEntity <String> p = this.ProductService.addProduct(product);
		return ResponseEntity.ok(p);
		 
	 }
	
	

	
	@PostMapping("/")
	 public  ResponseEntity<?> addSeller(@RequestBody Seller seller) {
		Seller s=this.SellerService.addSeller(seller);
		return ResponseEntity.ok(s);
	 }
	
	@DeleteMapping("/delete/{Id}")
	public void deleteProduct(@PathVariable("id")int pid) {
		this.ProductService.deleteProduct(pid);
	}
	
	@GetMapping("/show-bids/{Id}")
	public void getProduct(@PathVariable ("id")int pid) {
		this.ProductService.getProduct(pid);
}
}


