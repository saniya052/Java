import java.util.*;

import java.util.Collections;

interface comp{
	public  int compare( Employee e1,Employee e2) ;
}

public class ComparatorEmployee {
	
	public  int compare( Employee e1,Employee e2) {
		return  (int) (e1.getSalary() -e2.getSalary());
	}
	
	public static void main(String[] args) {
		List<Employee> employee=new ArrayList<>();
		
		Employee emp1 = new Employee(111, "Ram", 34567.00);
		Employee emp2 = new Employee(99, "Rama", 66567.00);
		Employee emp3 = new Employee(103, "Ramaya", 44567.00);

		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		
		for(Employee employe : employee) {
			System.out.println(employe);
		}
		/*
		Collections.sort(employee,(Employee e1,Employee e2 )->{return Double.valueOf(e1.getSalary()).compareTo(e2.getSalary());});
		System.out.println("After sorting.......");
		for(Employee employe : employee) {
			System.out.println(employe);
		}
		
			*/
		
		comp c=(Employee e1,Employee e2)->{
			return (int) (e1.getSalary()-e2.getSalary());
		};
		
		c.compare(emp2, emp3);
		
		System.out.println("After sorting.......");
		for(Employee employe : employee) {
			System.out.println(employe);
		}
		}
	}

