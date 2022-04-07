package testNG;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
	
	@DataProvider(name="loginfb",parallel=true)
	public String[][] getdata() throws Exception {
		
	File Excelfile = new File("C:\\Users\\sandavenisrinivas\\Downloads\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(Excelfile);  //System.out.println(Excelfile.exists());
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int numofrows = sheet.getPhysicalNumberOfRows();     //System.out.println(sheet.getPhysicalNumberOfRows());
	int numofcolumns = sheet.getRow(0).getLastCellNum();   //System.out.println(sheet.getLastRowNum());
	
	String[][] data = new String[numofrows-1][numofcolumns];
	for(int i=0; i<numofrows-1; i++) {
		for(int j=0; j<numofcolumns; j++) {
			
			DataFormatter df = new DataFormatter();
			data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));    //System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
			
		}
	}
	
	workbook.close();
	fis.close();
	
	/*for(String[] dataArray:data) {
		System.out.println(Arrays.toString(dataArray));
	}*/
	return data;
	}

}
