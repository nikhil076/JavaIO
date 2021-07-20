package EmployeePayrollService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeePayrollIOService {
	public static String PAYROLL_FILE_NAME = "payroll-file.txt";
	
	public void writeData(List<EmployeePayrollData> employeePayrollList)
	{
		StringBuffer empBuffer = new StringBuffer();
		employeePayrollList.forEach(employee -> {
			String employeeDataString = empBuffer.toString().concat("\n");
			empBuffer.append(employeeDataString);
		});
		
		try {
			Files.write(Path.of(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
		} catch (IOException e) {
		}
	}
	
	public void printData()
	{
		try {
			Files.lines(new File("payroll-file.txt").toPath()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public long countEntries()
	{
		long entries = 0;
		try {
			entries = Files.lines(new File("payroll-file.txt").toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return entries;
	}
}
