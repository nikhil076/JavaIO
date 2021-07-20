package EmployeePayrollService;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class EmployeePayrollServiceTest {
	@Test
	public void given3EmployeesWWhenWrittenToFileShouldMatchEmployeeEntries()
	{
		EmployeePayrollData[] arraayOfEmps = {
				new EmployeePayrollData(1,"Jeff",10000.0),
				new EmployeePayrollData(2,"Bill",20000.0),
				new EmployeePayrollData(3,"Mark",30000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arraayOfEmps));
		employeePayrollService.writeEmployeePayrollData(FILE_IO);
		employeePayrollService.printData(FILE_IO);
		long entries = employeePayrollService.countEntries(FILE_IO);
		Assert.assertEquals(3,entries);
	}
	
	@Test
	public void givenFileOnReadingFromFileShouldMatchEmployeeCount() 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		long entries = employeePayrollService.readEmployeePayrollData(FILE_IO);
		Assert.assertEquals(3,entries);
	}
}
