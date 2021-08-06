import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieMain2 {
	public static Movies Searchs(int No,Set<Movies>movie) {
		Scanner sc=new Scanner(System.in);
		for(Movies m:movie) {
			if(m.getMovieId()==No) {
				System.out.println("Enter the title to update: ");
				m.setMovieNAme(sc.nextLine());
				return m;
			}
		}
		return  null;
		
	}
	
	public static void delete(int no,Set<Movies>movie) {
		for(Movies m:movie) {
			if(m.getMovieId()==no) {
				 movie.remove(m);
				 System.out.print("ds");
			}
		}
		
		
		 
	}
	
	
	public static void main(String[] args)
    {	
		Set<Movies> movie=new TreeSet<>(new BudgetCompare());
		Movies[] movie1=new Movies[100] ;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of object you want:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("MovieID");
			int id=sc.nextInt();
			//movie1[i].setMovieId(id);
			
			System.out.println("Name");
			String s1=sc.next();
		//	movie1[i].setMovieNAme(s1);
			
			System.out.println("LeadActor");
			String s2=sc.next();
		//	movie1[i].setLeadActor(s2);
			
			System.out.println("Budgest");
			double b=sc.nextDouble();
		//	movie1[i].setBudget(b);
					
			movie1[i]= new Movies(id,s1,s2,b);
			movie.add(movie1[i]);
		}
	
		
		
        Iterator<Movies> iterator =movie.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		
         }
		
		System.out.println("Enter the Movie ID: ");
		int Movieids=sc.nextInt();
	
		
		
		Movies m=Searchs(Movieids,movie);
	    System.out.println(m);
	    
	    System.out.print("Enter id to delete:");
 		int n1=sc.nextInt();
    	delete(n1,movie);
	   
	
    }
	
}
