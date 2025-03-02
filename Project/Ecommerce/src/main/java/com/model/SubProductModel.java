package com.model;

public class SubProductModel 
{
	private int subproductid,productid;
	private String subproductname,features,price,image;
	public int getSubproductid() {
		return subproductid;
	}
	public void setSubproductid(int subproductid) {
		this.subproductid = subproductid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getSubproductname() {
		return subproductname;
	}
	public void setSubproductname(String subproductname) {
		this.subproductname = subproductname;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
