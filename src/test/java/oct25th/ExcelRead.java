package oct25th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Book1.xlsx");
		 @SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		 XSSFSheet ws = wb.getSheet("Sheet1");
		 System.out.println(ws.getLastRowNum());
		 System.out.println(ws.getPhysicalNumberOfRows());
		 System.out.println(ws.getRow(0).getLastCellNum());
		 System.out.println(ws.getRow(0).getPhysicalNumberOfCells());
		 Row row=null;
		 Cell cell=null;
		 for(int i=0;i<ws.getLastRowNum();i++) {
			 row=ws.getRow(i);
			 for(int j=0;j<row.getLastCellNum();j++) {
				 cell =row.getCell(j);
				 if(cell.getCellType()==CellType.STRING) {
					 System.out.println(cell.getStringCellValue()+ " is a string");
					 
				 }
				 else if(cell.getCellType()==CellType.NUMERIC) {
					 System.out.println(cell.getNumericCellValue()+ " is a number");
				 }
				 else if(cell.getCellType()==CellType.BOOLEAN) {
					 System.out.println(cell.getBooleanCellValue()+ " is a boolean");
				 }
			 }
		 }
	}

}
