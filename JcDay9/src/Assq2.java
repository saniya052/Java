
interface prints{
	void p();
}

public class Assq2 {

	public static void main(String[] args) {
		prints p1=()->{
			for(int i=1;i<=10;i++) {
				System.out.print(i+" ");
			}
			
		};
		
		p1.p();

	}

}
