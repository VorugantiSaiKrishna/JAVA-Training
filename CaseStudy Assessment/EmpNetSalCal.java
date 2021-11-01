package Assessment; 
import java.util.*;

class Employee {
	private int employeeid;
	private String employeename; 
	private float basicsalary;
	private float netsalary;
	private float SA;
	private float HRA;
	private float TA=0.2f;
	private int tax=2500;
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public float getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(int basicsalary) {
		this.basicsalary = basicsalary;
	}

	public void calculateNetSalary() {
		if(basicsalary>=0 && basicsalary<=10000)
		{
			HRA=0.2f;
		    SA=0.8f;
			netsalary=basicsalary+(HRA*basicsalary)+(SA*basicsalary)+((20/100)*basicsalary)-tax;
			System.out.println("Employee Name= "+employeename+" Employee ID = "+employeeid+" Employee NetSalary = "+netsalary);
	
         }
		else if(basicsalary>=10001 && basicsalary<=20000) {
			HRA=0.25f;
			SA=0.9f;
			netsalary=basicsalary+(HRA*basicsalary)+(SA*basicsalary)+((20/100)*basicsalary)-tax;
			System.out.println("Employee Name= "+employeename+" Employee ID = "+employeeid+" Employee NetSalary = "+netsalary);	
		}
		else if(basicsalary>20001){
			HRA=0.3f;
			SA=0.95f;
			netsalary=basicsalary+(HRA*basicsalary)+(SA*basicsalary)+((20/100)*basicsalary)-tax;
			System.out.println("Employee Name= "+employeename+" Employee ID = "+employeeid+" Employee NetSalary = "+netsalary);
			
		}
		else {
			System.out.println("Invalid");
		}

		}
	}

public class EmpNetSalCal{

	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		Scanner sc=new Scanner(System.in);
		
		e.setEmployeeid(1);
		e.setEmployeename("Sai Krishna");
		System.out.println("Enter employee Basic salary for Sai Krishna");
		int sal;
		sal=sc.nextInt();
		e.setBasicsalary(sal);
		e.calculateNetSalary();
		
		e1.setEmployeeid(2);
		e1.setEmployeename("Jaya Surya");
		System.out.println("Enter employee Basic salary for Jaya Surya");
		sal=sc.nextInt();
		e1.setBasicsalary(sal);
		e1.calculateNetSalary();
		
		
		e2.setEmployeeid(3);
		e2.setEmployeename("Karthik");
		System.out.println("Enter employee Basic salary for Karthik");
		sal=sc.nextInt();
		e2.setBasicsalary(sal);
		e2.calculateNetSalary();

	}

}