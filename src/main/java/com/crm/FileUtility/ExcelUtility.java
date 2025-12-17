
package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	@DataProvider(name = "loginData")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OrangeHRMTestCases.xlsx");
		   Workbook wb = WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet("LoginTestData");
		   int row = sh.getPhysicalNumberOfRows();
		   int column = sh.getRow(0).getPhysicalNumberOfCells();
		   Object[][] obj = new Object[row - 1][column];
		   for (int i = 1; i < row; i++) {
		       Row r = sh.getRow(i);
		       if (r == null) {
		           continue;
		       }
		       for (int j = 0; j < column; j++) {
		           Cell c = r.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
		           obj[i - 1][j] = c.toString();
		       }
		   }
		   wb.close();
		   fis.close();
		   return obj;
	}
}


