package ExcelFile;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet {

	public static void main(String[] args)throws Exception
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String CUSTNAME = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		String CUSTDESC = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		
		String CUSTNAME1 = wb.getSheet("CreateCustomer").getRow(2 ).getCell(2).getStringCellValue();
		String CUSTDESC1= wb.getSheet("CreateCustomer").getRow(2).getCell(3).getStringCellValue();

 

		System.out.println(CUSTNAME);
		System.out.println(CUSTDESC);
		System.out.println(CUSTNAME1);
		System.out.println(CUSTDESC1);

	}

}
