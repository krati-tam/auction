package service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import model.Product;



public interface ProductService {

	public ResponseEntity <String>addProduct(Product product1)throws Exception;

 public void deleteProduct(int productId);
 
 public Optional <Product> getProduct(int id);

Optional<Product> getId(int id);

}