package com;

public class customer {
 private String custNo;
 private String custName;
 private String Categories;
 
 customer(String custNo,String custName,String Categories){
	 custName= this.custName;
	 custNo= this.custNo;
	 Categories=this.Categories;
   
 }

public String getCustNo() {
	return custNo;
}

public String getCustName() {
	return custName;
}

public String getCategories() {
	return Categories;
}



public String toString() {
	return (custNo+custName+Categories);
}

}
