

interface sum{
	int no(int i,int j);
}

public class LamdaDemo1 {
	 public static void main(String[] args) {
		sum s1=(n1,n2) ->{ 
			int s=n1+n2;
			System.out.print("ans:"+ s);
			return n1+n2;
		   };
		   
		   s1.no(10,10);
	 }
     
}
