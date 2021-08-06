package com;

import java.util.*;
//import java.lang.*;

public class TestPatients2{
	
	public static void main(String[] args)
    {
		Patients p1=new Patients(1,"Saniya",12);
		Patients p2=new Patients(39,"Aqsa Shaikh ",4);
		Patients p3=new Patients(202,"Iqra",0);
		Patients p4=new Patients(1,"Saniya",12);
		
		/*List<Patients> patient = new ArrayList<>();
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		
        //Collections.sort(patient, new PatientsNameCompartaor());
		Collections.sort(patient, new PatientsAgeCompartaor());
		Iterator< Patients> iterator = patient.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		 LinkedHashSet<Patients>  patient = new LinkedHashSet<>();  
		 patient.add(p1);
		 patient.add(p2);
		 patient.add(p3);		
		 patient.add(p4);
		 
		 System.out.println("Size of LinkedHashMAp: "+patient.size());
		 
		 Iterator< Patients> iterator = patient.iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
              }


	
      }
}
