package OOPs.polymorphism;

// parent class
class EmployeeX{
	
	long empId,empPhno;
	String empName,empAdd;
	double basSalary,salary;
	double spcAllow=250.80 , hra=1000.50;  // static value
	
	// using constructor
	public EmployeeX(long empId, long empPhno, String empName, String empAdd, double salary, double basSalary)
	{
		
		this.empId = empId;
		this.empPhno = empPhno;
		this.empName = empName;
		this.empAdd = empAdd;
		this.salary=salary;
		this.basSalary=basSalary;
		
	}
	
	// method
	public void transportAllowance()
	{
		
	double ta;
	ta=(0.1*basSalary);  //calculating transport allowance value
	System.out.println("Transport Allowance of Employee " + ta);

	}
	  // method
	public void calculateSalary()
	{
		
		salary = basSalary + ( basSalary * spcAllow/100) + (basSalary + hra/100);
		System.out.println("Salary is "+salary);
		
	}
}
// child / sub class // overriding
class Manager extends EmployeeX
{
	// method
public Manager(long empId, long empPhno, String empName, String empAdd,double salary,double basSalary) 

{
		super(empId, empPhno, empName, empAdd,salary,basSalary);
		
	
}
  // method
public void transportAllowance()
{
	
double ta;
ta=(0.15*basSalary);  //getting transport allowance value
System.out.println("Transport Allowance of Manager " + ta);

}
}

class Trainee extends EmployeeX
{
	
public Trainee(long empId, long empPhno, String empName, String empAdd,double salary,double basSalary) 

{
		super(empId, empPhno, empName, empAdd,salary,basSalary);
}


}


public class InheritanceActivity {

	public static void main(String[] args) 
	
	{
		       // creating object and setting value
		Manager mng = new Manager(102, 1234567899, "Maxwell", "Australia", 50000,1500);
				System.out.println("Employee Id           :" + mng.empId);
				System.out.println("Employee phone    :" + mng.empPhno);
				System.out.println("Employee name      :" + mng.empName);
				System.out.println("Employee Address  :" + mng.empAdd);
				System.out.println("Employee Salary     :" + mng.salary);
	 
				System.out.println("-------------------------------------------------");
				
	           // creating object and setting value
	 Trainee tn=new Trainee(101, 736490, "AB Develleirs", "South Africa", 50000, 1000);
	 
	 		 //printing value
	            System.out.println("Employee Id              : " + tn.empId);
	            System.out.println("Employee phone       : " + tn.empPhno);
	            System.out.println("Employee name        :  " + tn.empName);
	            System.out.println("Employee Address    : " + tn.empAdd);
	            System.out.println("Employee Salary      : " + tn.salary);
	            
	            System.out.println("-------------------------------------------------");
	 
	      // creating object
	 EmployeeX emp= new EmployeeX(0, 0, null, null, 0, 100);
	 emp.transportAllowance();
	 
	 // calling method
	 mng.transportAllowance();
	 System.out.println("-------------------------------------------------");
	 mng.calculateSalary();
	 tn.calculateSalary();
	 
	}

}
