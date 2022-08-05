package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class DataDriven {
	
	public WebDriver driver;
	
	ArrayList<String> a = new ArrayList();
	
	

	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Ravi Anala\\Desktop\\Book1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("DATA"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
					
				Iterator<Row> rows=sheet.iterator();
				
				Row firstrow=rows.next();
				
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("testcase"))
					{
						column=k;
					}
					k++;
				}
				
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						Iterator<Cell> val=r.cellIterator();
						while(val.hasNext())
						{
							a.add(val.next().getStringCellValue());
						}
					}
				}
				
				
			}
			
			
		}
		return a;
	}

}
