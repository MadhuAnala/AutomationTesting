package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {
		//file input stream
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Ravi Anala\\Desktop\\Book1.xlsx");
		
		//now we need to access excel sheet
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheets= workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Book1"))
			{
				//accessesing the sheet
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				//to access the rows
				
				Iterator<Row> rows=sheet.iterator();
				Row firstrow= rows.next();
				
				// now we need to access cells
				
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell val=ce.next();
					if(val.getStringCellValue().equalsIgnoreCase("city"))
					{
						//to get the desired column index number
						column=k;
					}
					k++;
				}
				//once the column number is identified we have to get the 
				//value in that column, so we have to traverse other rows
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("cef"))
					{
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext())
						{
							System.out.println(cv.next().getStringCellValue());
						}
						
					}
				}
				
				
			}
		}
	}

}
