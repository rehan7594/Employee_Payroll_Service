package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService {
	private List<EmployeePayrollData> datas;


	public EmployeePayrollService() {

	}


	public EmployeePayrollService(List<EmployeePayrollData> datas) {
		this.datas = datas;
	}


	public static void main(String[] args) throws Exception  {

		List<EmployeePayrollData> datas = new ArrayList<EmployeePayrollData>();
		EmployeePayrollService service=new EmployeePayrollService(datas);

		FileIOUtiles utiles=new FileIOUtiles();
		utiles.isExist("Data");
		utiles.createFolder("Data");
		utiles.createFile("Data/data1.txt");
		utiles.writeTOFile("Data/data1.txt");
		utiles.readFromFile("Data/data1.txt");
		utiles.listOfFilesandFolder("Data");
		utiles.delete("Data/data1.txt");
		utiles.delete("Data");	
	}
}

class EmployeePayrollData{
	private int id;
	private double salary;
	private String name;
	public EmployeePayrollData(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeePayrollData [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}