package serviceImpl;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import model.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {

	

	private ProductRepository ProductRepository;

	//@SuppressWarnings("unchecked")
	public ResponseEntity<String> addProduct(Product product1) {
		// TODO Auto-generated method stub
		String s=product1.getCategory();
		String s2="sculpture";
		String s3="painting";
		String s4="ornaments";
		Product s1=this.ProductRepository.findByProductName(product1.getProductName());
		System.out.println(s);
		System.out.println(s1);
		if(this.ProductRepository.findByProductName(product1.getProductName())==null) {
			if(s.equals(s2)||s.equals(s3) ||s.equals(s4)) {
				this.ProductRepository.save(product1);
				return new ResponseEntity<String>("product saved successfully",HttpStatus.OK);
			}
			return new ResponseEntity<String>("product category is not from above",HttpStatus.OK);
		  }
		else
			{return new ResponseEntity<String>("product already present",HttpStatus.BAD_REQUEST);
			}
	}
	

	
	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public Optional<Product> getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}
	

}
