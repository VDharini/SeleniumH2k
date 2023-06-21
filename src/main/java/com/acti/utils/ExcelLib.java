package com.acti.utils;

import java.io.File;

/* 
 * Name: ExcelLib
 * Description: This class is used to fetch the data from excel sheet by creating an object where ever required
 * Developed by:
 * Approved by:
 * Approval date:
 * Last modified:
 */
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	XSSFWorkbook wb;

	public ExcelLib(String excelPath) {
		try {
			File file = new File(excelPath);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to load the excel file");
			e.printStackTrace();
		}
	}

	public int getRowCount(String sheetName) {
		int count = wb.getSheet(sheetName).getLastRowNum() + 1;
		return count;
	}

	public int getRowCount(int sheetNum) {
		return wb.getSheetAt(sheetNum).getLastRowNum() + 1;
	}

	public String getCellData(String sheetName, int row, int col) {
		String data = wb.getSheet(sheetName).getRow(row).getCell(col).toString();
		return data;
	}

	public String getCellData(int sheetNum, int row, int col) {
		String data = wb.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
		return data;
	}

}
