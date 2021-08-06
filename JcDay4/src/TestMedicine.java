
public class TestMedicine {

	public static void main(String[] args) {
		Medicine m[]=new Medicine[5];
		
		m[1]=new Tablet();
		m[2]=new Syrup() ;
		m[3]=new Oinmnet();
		
		m[1].DisplayLable();
		m[2].DisplayLable();
		m[3].DisplayLable();
		
	}

}
