package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Utility 
{

	public static String [][]  printData(String sheetname) 
	{
	File file =new File (System.getProperty("user.dir")+"\\data\\MyFile.xlsx");
	FileInputStream FIS = null;
	try {
		FIS = new FileInputStream(file );
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFWorkbook workbook = null;
	try {
		workbook = new XSSFWorkbook(FIS);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	XSSFSheet sheet=workbook.getSheet(sheetname);
		   	int rows= sheet.getLastRowNum();
		   	int cols=sheet.getRow(0).getLastCellNum();
	   String [  ][  ] data=new String [rows] [cols];	             //creating string type of array 	
		   //	String data[][]= new String[rows][cols];
		   	
		   	for(int i=0; i< rows    ;i++)
		   	{
		   		XSSFRow row=sheet.getRow(i+1);
		   		
		   		for(int j=0; j<cols    ;j++)
		   		{
		   			XSSFCell cell=row.getCell(j);
		   			
		   			data [ i ]  [ j ]  = cell.toString();
		   		}
		   		
		   	}
	           return data;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public static String [][] readDataFromExcelFile( String sheetname)
	{
		
		
	    File f=new File(System.getProperty("user.dir"+"\\data\\My File.xlsx")) ;
		XSSFWorkbook workbook = null;
		FileInputStream fis = null;
		try {
			workbook = new XSSFWorkbook(fis);
			 fis=new FileInputStream(f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet=workbook.getSheet(sheetname);
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		
		String  data[][]=new String[rows][cols];
	
		for(int i=0; i<rows   ;i++)
		{
			
			XSSFRow row=sheet.getRow(i+1);
			
			
			for(int j=0 ; j<cols   ;j++)
			{
				XSSFCell cell=row.getCell(j);	
				data[i][j] =cell.toString();
			}
			
			
		}
		System.out.println(data);
		return data;
		
	}*/
	
	
} 
