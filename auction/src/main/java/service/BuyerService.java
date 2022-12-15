package service;

import model.Buyer;

public interface BuyerService {

	public Buyer addBuyer(Buyer buyer1);
	
	public Buyer updateBuyer (int id,String email,int amount);
}
