package com.sauce.qa.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.sauce.qa.base.baseclas;

public class TestUtil extends baseclas {
	public static int PAGE_LOAD_TIMEOUT = 20;
	public static int IMPLICIT_WAIT = 30;

	public static Object[][] gettestdata(String SheetName) throws IOException {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					"C:\\Users\\Aathvika\\eclipse-workspace\\PageObjectModelTest\\src\\main\\java\\com\\sauce\\qa\\Testdata\\Testdata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFWorkbook Wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = Wb.getSheet(SheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}

		return data;
	}

	public static void Screenshottt() {
		TakesScreenshot tke = (TakesScreenshot) driver;
		File temp = tke.getScreenshotAs(OutputType.FILE);
		File perm = new File(
				"C:\\Users\\Aathvika\\eclipse-workspace\\PageObjectModelTest\\test-output\\ScreenshotFolder/"
						+ System.currentTimeMillis() + ".png");
		try {
			Files.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
