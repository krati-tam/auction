package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import model.Seller;
import repository.SellerRepository;
import service.SellerService;

public class SellerServiceImpl implements SellerService{

	@Autowired
private SellerRepository sellerRepository;


@Override
	public Seller addSeller(Seller seller1) {
		// TODO Auto-generated method stub
		return this.sellerRepository .save(seller1);
	}

	}


