package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadAllData {

	public static void Read_data() throws IOException
	{
		File fl=new File("");
		FileInputStream fis=new FileInputStream(fl);
		Workbook w=new XSSFWorkbook(fis);
		Sheet sh=(Sheet) w.getSheet("Logindetails");
		
		if(int i=0;i<=3;i++)
		{ Row r=sh.getRow(i);}
		else if(j=0;j<=1;j++)
		{ Cell c=r.getCell(j) 
		String values=c.getStringCellValue(c);
		}
		}
	public static void main(String[] args) throws IOException {
		Read_data();
	}
	}
