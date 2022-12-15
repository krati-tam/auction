package serviceImpl;

import model.Product;

public interface ProductRepository {

	Product findByProductName(String productName);

	void save(Product product1);

	Object remove(int productId);

	

}
