package assignment9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

	public static void main(String[] args) throws IOException {
		
		
		String path ="files\\rn.xlsx";
		File f = new File(path);
		FileInputStream fi = new FileInputStream(f);
	
		//connecting workbook to i/p stream(getting workbook to read
		Workbook wb =WorkbookFactory.create(fi);
		
		//getting first sheet to read
		Sheet ws = wb.getSheetAt(0);	//getting 1st sheet
		
		int rowCount =wb.getSheetAt(0).getPhysicalNumberOfRows();
		
		//getting row to read
		for(int r=0; r<rowCount;r++) {
			
		Row row=ws.getRow(r);
	Cell c = row.getCell(0);	//c=wb.getSheetAt(0).getRow(r).getCell(0)
		System.out.println(r+"-----" + c);
		}
		fi.close();

	}

}
