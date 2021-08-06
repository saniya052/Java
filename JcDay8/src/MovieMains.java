
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class MovieMains {
	

	public static void main(String[] args)
    {
		
	
		/*Movies m1=new Movies(1,"abcd","yefgh",12343209209.44);
		Movies m2=new Movies(67,"bcd","dfgh",234353209);
		Movies m3=new Movies(87,"cd","fg",576639.3903207);
		Movies m4=new Movies(90,"d","xefg",13232344.44);
*/
		
		Set<Movies> movie=new TreeSet<>(new BudgetCompare());
		/*movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);*/
		
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
		
		/*
		Set<Movies> movie=new HashSet<>();
		movie.add(m1);
		movie.add(m2);
		movie.add(m3);
		movie.add(m4);
		
		Set<String> movie=new TreeSet<String>();
		movie.add("Saniya");
		movie.add("Alia");
		movie.add("m.kaif");
		movie.add("naseem");
		
		*/
		
        Iterator<Movies> iterator =movie.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		
         }
		

    }
    
}
