package assignment9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Random_Num_excel {

	public static void main(String[] args) throws IOException {
		
Random randomNum = new Random();
		
		Set<Integer>num=new LinkedHashSet<Integer>();
				
				while(num.size()!=500) {
					int a= 100 +randomNum.nextInt((1000-100)+1);
					//System.out.println(a);
					num.add(a);
					}
		String path ="files\\rn.xlsx";
		File f = new File(path);
		XSSFWorkbook wb =new XSSFWorkbook();
		XSSFSheet  ws= wb.createSheet("RandomNumbers");
		
		Row row = ws.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("RandomNumbers");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		
		
		for(int rn : num) {
			
			Row r = ws.createRow(ws.getLastRowNum()+1);
			Cell c=r.createCell(0);
			c.setCellValue(rn);
			
		}
		wb.write(fo);
		fo.close();

	}

}
