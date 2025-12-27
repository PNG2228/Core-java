package com.stream;
import java.util.*;
public class EmployeeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getExp()>o2.getExp()) {
		   return 1;
		}
		else if(o1.getExp()>o2.getExp()) {
		   return -1;
		}else {
		   return 0;
		}
	}
}
