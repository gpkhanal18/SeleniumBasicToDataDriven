package com.testng.datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public String[][] getCellData(String path, String sheet) throws InvalidFormatException, IOException {

		FileInputStream stream = new FileInputStream(path);
		Workbook workbook = WorkbookFactory.create(stream);
		Sheet s = workbook.getSheet(sheet);
		int rowcount = s.getLastRowNum();
		int cellcount = s.getRow(0).getLastCellNum();
		String data[][] = new String[rowcount][cellcount];
		System.out.println("row count is " + rowcount);
		for (int i = 1; i <= rowcount; i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < cellcount; j++) {
				Cell c = r.getCell(j);
				System.out.println("cell value is " +c.getStringCellValue());
				try {
					if (c.getCellType() == CellType.STRING) {
						data[i - 1][j] = c.getStringCellValue();
					} else {

						data[i - 1][j] = String.valueOf(c.getNumericCellValue());
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
		System.out.println(data);
		return data;
	}
}