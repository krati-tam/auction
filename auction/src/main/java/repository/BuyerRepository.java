package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Buyer;
import model.Product;

public interface BuyerRepository extends JpaRepository<Buyer,Integer>

{
 public Buyer findByEmail (String Email);
 public Buyer findByProduct(Product product);
}
