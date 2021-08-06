import java.util.Scanner;

interface Fib{
	int fibi(int n);
}

public class Assq3 {
	public static void main(String[] args) {
		Fib  fib=(n)->{
			int n1=0;
			int n2=1;
			int n3=0;
			System.out.print(n1+" ");
			for(int i=1;i<n;i++) {
				  n1=n2;
			      n2=n3;
				 n3 =n1+n2;
				System.out.print(n3+" ");
			}
			return n;
			
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no");
		int n=sc.nextInt();
		
		fib.fibi(n);
		
		
	}
}
