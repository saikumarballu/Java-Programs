package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		String EXCEL_FILE="S:\\workspace\\Selenium\\src\\com\\prop\\sai.xlsx";
		File file=new File(EXCEL_FILE);
		XSSFCell cell=null;
		XSSFRow row=null;
		
		DataFormatter df = new DataFormatter();
		//String value = df.formatCellValue(cell);
		
		FileInputStream fis=new FileInputStream(file);
		FileOutputStream fos=null;
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int RowCount=sheet.getLastRowNum();
		//System.out.println(RowCount);
		
		//System.out.println("Total Columns are: "+row.getLastCellNum());
		for(int i=0;i<RowCount+1;i++){
			row= sheet.getRow(i);
			
			
			for(int j=0;j<row.getLastCellNum();j++){
				//System.out.println(row.getCell(j).getNumericCellValue());
				
				//String.valueOf(cell.getNumericCellValue())
				
				cell=row.getCell(j);
				String value = df.formatCellValue(cell);
				System.out.print(value+"\t");
				
			}
			System.out.println("");
			System.out.println("----\t----\t----");
			
		}
		fis.close();
		cell=row.createCell(RowCount);
		cell.setCellValue("Pass");
		fos=new FileOutputStream(file);
		workbook.write(fos);
		fos.close();

	}

}
