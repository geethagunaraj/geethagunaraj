package org.emp;

public class Employee {
public void empid(float empid) {
	System.out.println("empid is:" + empid);
}
private void empName(String empName) {
	System.out.println("empName is:" + empName);
}

private void empPhone(long empPhone) {
System.out.println("empPhone is:"+empPhone);
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empid(15988);
}
	
}

