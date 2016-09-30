package com.juice.orange.util;

import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private static String location;
	protected static void readXlsx(String location) throws IOException{
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(location);
		for(int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++){
			XSSFSheet Sheet = xssfWorkbook.getSheetAt(numSheet);
			if(Sheet == null){
				continue;
			}
			System.out.println(Sheet.getLastRowNum());
			for(int rowNum = 0; rowNum <= Sheet.getLastRowNum(); rowNum++){
				XSSFRow row = Sheet.getRow(rowNum);
				if(row == null){
					continue;
				}
				
				for(int cellNum = 0; cellNum <= row.getLastCellNum(); cellNum++){
					XSSFCell cell = row.getCell(cellNum);
					if(cell == null){
						continue;
					}
					System.out.println(" "+getValue(cell));
				}
				System.out.println();
				
			}
		}
	}
	protected static String getValue(XSSFCell cell){
		 DecimalFormat df = new DecimalFormat("#");
		System.out.println("type:"+cell.getCellType());
		if(cell.getCellType() == cell.CELL_TYPE_BOOLEAN){
			return String.valueOf(cell.getBooleanCellValue());
		}else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
			return String.valueOf(df.format(cell.getNumericCellValue()));
		}else{
			return String.valueOf(cell.getStringCellValue());
		}
	}
	public static void main(String[] args){
		location = "C:\\Users\\zhangxiao3\\Desktop\\abc.xlsx";
		try {
			readXlsx(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
