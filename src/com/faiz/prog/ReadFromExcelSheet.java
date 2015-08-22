package com.faiz.prog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelSheet {
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;
    
    
    public static void main(String args[]) throws IOException {
	String filePath = "/home/faiz/test.xlsx";
	String[][] result = readFromExcel(filePath);
	for(int i=0;i<result.length; i++)
	    for (int j=0;j<result[i].length;j++)
		System.out.println(result[i][j]);
	
    }
    
    public static String[][] readFromExcel(String filepath) throws IOException {
	File file = new File(filepath);
	FileInputStream fileInputStream = new FileInputStream(file);
	
	String[][] dataExcel = null;
  //	System.out.println("inside read from file");
	workbook = new XSSFWorkbook(fileInputStream);
	sheet = workbook.getSheetAt(0);
	int rowStart = 1, colStart = 1, totalRows = 0;
	totalRows = sheet.getLastRowNum();
	int Ci=0, Cj=0;
	dataExcel=new String[totalRows][3];
	for (int i=rowStart; i<= totalRows;i++, Ci++)
	{
//	    System.out.println("reading row");
	   Cj = 0;
	   row = sheet.getRow(i);
	   for (int j = colStart; j < 3; j++, Cj++)
	   {
//	       System.out.println("reading cell");
	       cell = row.getCell(j);
	       System.out.print(cell.toString());
	       dataExcel[Ci][Cj] =  cell.toString();
	       if(j==colStart){System.out.print(" : ");}
	       else if(j==2){}
	       else {System.out.print(" , ");}
	       
	   }
	   System.out.println("");
	    
	}
	System.out.println(dataExcel);
	return dataExcel;
	
    }

}
