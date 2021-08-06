package com;

import java.util.Comparator;

public class PatientsAgeCompartaor implements Comparator<Patients> {

	@Override
	public int compare(Patients o1, Patients o2) {
		
		return o1.getAge()-o2.getAge();
	}

}
