package EmployeePayrollService;

public class EmployeePayrollData 
{

	public int id;
	public String name;
	public double salary;
	
	public EmployeePayrollData(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public EmployeePayrollData() 
	{
		super();
	}
	@Override
	public String toString() 
	{
		return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
}
