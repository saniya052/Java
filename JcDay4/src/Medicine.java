
public abstract class Medicine {
int price;
int date;

 void getDetails(int price,int date) {
	 System.out.println(this.price+this.date);
 }
 
 void DisplayLable() {
}
 
}

class Tablet extends Medicine{
	 void DisplayLable() {
		 System.out.println("Tablet");
	 }
	 void getDetails(int price,int date) {
		 System.out.println(this.price+this.date);
	 }
}

class Syrup extends Medicine{
	 void DisplayLable() {
		 System.out.println("Syrup");
	 }
	 void getDetails(int price,int date) {
		 System.out.println(price+" "+date);
	 }
}

class Oinmnet extends Medicine{
	 void DisplayLable() {
		 System.out.println("Oinmnet");
	 }
	 
	 void getDetails(int price,int date) {
		 System.out.println(this.price+this.date);
	 }
	 
}