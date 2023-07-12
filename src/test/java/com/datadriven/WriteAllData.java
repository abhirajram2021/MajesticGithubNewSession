package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteAllData {
	
	public static void Write_data() throws IOException
	{
		File f=new File("C:\\Users\\Abhilash\\Desktop\\ExcelTestData\\Book5.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		w.createSheet("Details").createRow(0).createCell(0).setCellValue("Employee_Id");
		w.getSheet("Details").getRow(0).createCell(1).setCellValue("Employee_Name");
		w.getSheet("Details").getRow(0).createCell(2).setCellValue("Department");
		w.getSheet("Details").getRow(0).createCell(3).setCellValue("Role");
		w.getSheet("Details").getRow(0).createCell(4).setCellValue("Salary");
		
		w.getSheet("Details").createRow(1).createCell(0).setCellValue(101);
		w.getSheet("Details").getRow(1).createCell(1).setCellValue("Alex Jacob");
		w.getSheet("Details").getRow(1).createCell(2).setCellValue("IT");
		w.getSheet("Details").getRow(1).createCell(3).setCellValue("Software Engineer");
		w.getSheet("Details").getRow(1).createCell(4).setCellValue(30000);
		
		w.getSheet("Details").createRow(2).createCell(0).setCellValue(102);
		w.getSheet("Details").getRow(2).createCell(1).setCellValue("Aleena Aldo");
		w.getSheet("Details").getRow(2).createCell(2).setCellValue("IT");
		w.getSheet("Details").getRow(2).createCell(3).setCellValue("Software Test Engineer");
		w.getSheet("Details").getRow(2).createCell(4).setCellValue(30000);
		
		w.getSheet("Details").createRow(3).createCell(0).setCellValue(103);
		w.getSheet("Details").getRow(3).createCell(1).setCellValue("Akshay Ashok");
		w.getSheet("Details").getRow(3).createCell(2).setCellValue("IT");
		w.getSheet("Details").getRow(3).createCell(3).setCellValue("Project Manager");
		w.getSheet("Details").getRow(3).createCell(4).setCellValue(50000);;
		
		w.getSheet("Details").createRow(4).createCell(0).setCellValue(104);
		w.getSheet("Details").getRow(4).createCell(1).setCellValue("Kiran M");
		w.getSheet("Details").getRow(4).createCell(2).setCellValue("IT");
		w.getSheet("Details").getRow(4).createCell(3).setCellValue("BA");
		w.getSheet("Details").getRow(4).createCell(4).setCellValue(60000);
		
		FileOutputStream fos=new FileOutputStream(f);
		w.write(fos);
		System.out.println("successfully write data on the Excelsheet");
		
	}
	
	public static void main(String[] args) throws IOException {
		Write_data();
	}

}
