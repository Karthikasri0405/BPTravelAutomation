package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig  {
	
	public void Excelread(String filename, String sheetname) throws IOException
	{
		File file = new File("filename");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("sheetname");
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String name = sh.getRow(i).getCell(0).getStringCellValue();
			String Pwd =sh.getRow(i).getCell(1).getStringCellValue();

			System.out.println("excel value username is:" + name);
			System.out.println(" password value  is :"  + Pwd);
		}

}
	/*public static void splittingstring() {
		String s="Name=Bala#Age=32#Mobile=43979648984"; 
		String[] firstsplit =s.split("#");
		 
		
		System.out.println("Firstname is" + firstsplit);
		
	}*/
	
public static  void spiltstring(){  
		
		String s="Name=Bala#Age=32#Mobile=43979648984";   
		String[] stringarray = s.split("[#]");   
		System.out.println("Splitted String is ");
	
		for(int i=0; i< stringarray.length; i++)  
		{  
			String key=stringarray[i];
			System.out.println( key);  
			
			for(int j=0;j<key.split("=").length;j++)
			{
			
				String value=key.split("=")[j];
				System.out.println(value);  
			}
		}  
}
		public static void main (String arg[])
		{
			spiltstring();
		}
		}
	



