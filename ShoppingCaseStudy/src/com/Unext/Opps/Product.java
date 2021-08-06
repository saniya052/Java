package com.Unext.Opps;

public class Product  {
int productId;
String productName;
String productDescription;
int price;
int quantity;
String category;
public Product(int productId, String productName, String productDescription, int price, int quantity, String category) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
	this.price = price;
	this.quantity = quantity;
	this.category = category;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}


@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
			+ productDescription + ", price=" + price + ", quantity=" + quantity + ", category=" + category + "]";
}




}
