package com.juice.orange.XMLReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class XLSXReader {
	private XSSFWorkbook xssfWorkbook;
	private String topName;
	List<JSONObject> jsonList;

	XLSXReader(String fileAddr, String topName) throws IOException {
		xssfWorkbook = new XSSFWorkbook(fileAddr);
		this.topName = topName;
		jsonList = new ArrayList<JSONObject>();
	}
	XLSXReader(){
		
	}

	// String location = "C:\\Users\\zhangxiao3\\Desktop\\abc.xlsx";

	@SuppressWarnings("static-access")
	public List<JSONObject> parseSheet(String currentSheetName) {
		XSSFSheet currentSheet = xssfWorkbook.getSheet(currentSheetName);
		JSONObject jsonObj = new JSONObject();
		XSSFRow titleRow = currentSheet.getRow(0);
		int titleNum = titleRow.getLastCellNum();
		String[] titleList = new String[titleNum];
		for (int i = 0; i <= titleNum; i++) {
			// TODO check fieldType
			titleList[i] = titleRow.getCell(i).getStringCellValue();
		}
		for (int row = 1; row <= currentSheet.getLastRowNum(); row++) {

			XSSFRow tempRow = currentSheet.getRow(row);
			for (int cell = 0; cell < titleNum; cell++) {
				// TODO check fieldType
				XSSFCell tempCell = tempRow.getCell(cell);
				if (tempCell.CELL_TYPE_BLANK == 3) {
					jsonObj.put(titleList[cell], "");
				} else if (tempCell.getStringCellValue() == "N/A") {
					jsonObj.put(titleList[cell], parseSheet(titleList[cell]));
				} else {
					jsonObj.put(titleList[cell], tempCell.getStringCellValue());
				}
			}
			jsonList.add(jsonObj);
		}
		return jsonList;
	}
	@Test
	public void testParseSheet(){
		String location = "C:\\Users\\zhangxiao3\\Desktop\\abc.xlsx";
		XLSXReader reader = null;
		try {
			reader = new XLSXReader(location,"StoreEntity");
		} catch (IOException e) {
			e.printStackTrace();
		}
		reader.parseSheet(topName);
		System.out.println(jsonList);
	}

}
