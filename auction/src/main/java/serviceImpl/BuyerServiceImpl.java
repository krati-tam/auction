package serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception.UserException;
import model.Buyer;
import model.Product;
import repository.BuyerRepository;
import repository.ProductRepository;
import service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService{

	@Autowired
	private BuyerRepository buyerRepo;
	
	@SuppressWarnings("unused")
	@Autowired          
	private ProductRepository ProductRepository;
	
	@Override
	public Buyer addBuyer(Buyer buyer1) {
		// TODO Auto-generated method stub
		
		return this.buyerRepo.save(buyer1);
	}

	@Override
	public Buyer updateBuyer(int id, String email, int amount) {
		// TODO Auto-generated method stub
		Buyer b=this.buyerRepo.findByEmail(email);
		if(id==b.getProduct().getId()){
			b.setBidAmount(amount);
			this.buyerRepo.save(b);
		}
		else 
			{ throw new UserException("Product id is wrong");
			}
		return b;
	}
	

}
