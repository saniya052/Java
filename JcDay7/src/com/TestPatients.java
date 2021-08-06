package com;

import java.util.*;
//import java.lang.*;

public class TestPatients {
	public static Patients getAges(String name,Set<Patients>patient) {
		for(Patients p:patient) {
			if(p.getName()==name) {		
				return p;
			}
		
		}
		return null;
		
	}
	
	
	public static void main(String[] args)
    {
		Patients p1=new Patients(1,"Saniya",12);
		Patients p2=new Patients(39,"Aqsa Shaikh ",4);
		Patients p3=new Patients(202,"Iqra",0);
		
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
		
		Set<Patients> patient=new TreeSet<>();
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		
	    Patients p4= getAges("Saniya",patient);
        
        if(p4!=null) {
			System.out.println("age: "+p4.getAge());
			System.out.println("Patient is  available");
		}else {
			System.out.println("Patient is not available");
		}
		
		
    }


	
}
