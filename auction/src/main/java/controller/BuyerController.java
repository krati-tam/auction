package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Buyer;
import model.Product;
import serviceImpl.BuyerServiceImpl;
import serviceImpl.ProductServiceImpl;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/Buyer")
public class BuyerController {
	@Autowired
private BuyerServiceImpl bs;
	@Autowired
	private ProductServiceImpl productService;
	
	@PostMapping("/place-bid")
	public  ResponseEntity<?>  addBuyer(@RequestBody Buyer buyer) {
		Buyer b=this.bs.addBuyer(buyer);
		return ResponseEntity.ok(b);
	}
	
	@PutMapping("/update-bid/{productId}/{buyerEmailld}/{newBidAmount}")
	private Buyer updateBuyer(@PathVariable("product-id")int id, @PathVariable("email")String Email,@PathVariable("newbidAmount")int newbidAmount){
	
		return this.bs.updateBuyer(id,Email,newbidAmount);

}
}
