package EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;
	static Scanner consoleInputReader = new Scanner(System.in);

	public enum IOService
	{
		CONSOLE_IO,FILE_IO,DB_IO,REST_IO;
	}
	private EmployeePayrollService() {}
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {}
	
	
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		employeePayrollService.writeEmployeePayrollData();
		employeePayrollService.readEmployeePayrollData();		
	}

	private void readEmployeePayrollData() {
		
		System.out.println("Enter Employee Id :");
		int id = consoleInputReader.nextInt();
		System.out.println("Enter Employee Name :");
		String name = consoleInputReader.next();
		System.out.println("Enter Employee salary");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
	}

	private void writeEmployeePayrollData() {
		System.out.println("Writing Employee payroll to console :"+employeePayrollList);
		
	}

}
