import java.util.Comparator;


public class BudgetCompare implements Comparator<Movies> {


	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getBudget()-o1.getBudget());
		
	}

}
