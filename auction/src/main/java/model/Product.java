package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	
	private int ProductID;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDetailedDescription() {
		return detailedDescription;
	}
	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(float startingPrice) {
		this.startingPrice = startingPrice;
	}
	public int getBidenddate() {
		return bidenddate;
	}
	public void setBidenddate(int bidenddate) {
		this.bidenddate = bidenddate;
	}
	@Column(name="Product_Name", nullable=false, length=30)
	private String productName;
	private String shortDescription;
	private String detailedDescription;
	private String category;
	private float startingPrice;
	private int  bidenddate;

	
}