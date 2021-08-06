package com;

import java.util.Comparator;

public class PatientsNameCompartaor implements Comparator<Patients>{
	@Override
	public int compare(Patients o1, Patients o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
