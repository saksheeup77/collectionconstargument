package com.sakshi.collectionwithconsargument;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String empName;
	private List<String> empPhones;
	private Set<String> empAddresses;
	private Map<String,String> empDepartment;
	public Employee(String empName, List<String> empPhones, Set<String> empAddresses,
			Map<String, String> empDepartment) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddresses = empAddresses;
		this.empDepartment = empDepartment;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empPhones=" + empPhones + ", empAddresses=" + empAddresses
				+ ", empDepartment=" + empDepartment + "]";
	}

}
