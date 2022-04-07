package oopspart1;

public class Encapsulation {
	
	//we declare instance variables as private
	//here we bind data and code together
	//we can hide the data
	private int empAge;
	private String empName;
	
	public static void main(String[] args) {
		
		Encapsulation empData = new Encapsulation();
		empData.setEmpAge(25);
		empData.setEmpName("rocky");
		
		System.out.println("employee name is "+empData.getEmpName());
		System.out.println("employee age is "+empData.getEmpAge());
		

	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
