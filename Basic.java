import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;






//Excel Imports
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import POM.POM_File;

public class Basic {

	
	static String[][] myArray= new String[12][12];
	
	@Test
	
	public static void testunits() throws IOException, InterruptedException {
	//public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub

		WebDriver driver= new FirefoxDriver();
		String url="https://demo.opencart.com";
		driver.get(url);
		POM_File pom_obj;
		pom_obj = new POM_File(driver);
		pom_obj.click_on_myaccount();
		pom_obj.click_on_login_button();

	    Basic objExcelFile = new Basic();
	    String filePath = "D:/Users/ssattira/Desktop";
	    
	    objExcelFile.readExcel(filePath,"Input_Data_Book.xlsx","Input_Data_Sheet");

	    pom_obj.enter_email(myArray[0][0]);
	    pom_obj.enter_password(myArray[1][0]);
	    pom_obj.click_on_login_button_after_email_pswd();
	    pom_obj.click_on_AddressBook_Button();
	    pom_obj.click_on_add_new_address();
	    
	    pom_obj.select_Country_fromaddress(myArray[9][0]);
	    
	    pom_obj.enter_address_firstname(myArray[2][0]);
	    pom_obj.enter_address_lastname(myArray[3][0]);
	    pom_obj.enter_address_company(myArray[4][0]);
	    pom_obj.enter_address_address1(myArray[5][0]);
	    pom_obj.enter_address_address2(myArray[6][0]);
	    pom_obj.enter_address_city(myArray[7][0]);
	    pom_obj.enter_address_postalcode(myArray[8][0]);
	    pom_obj.select_state_fromCountry_fromaddress(myArray[10][0]);
	    pom_obj.click_on_submit_Address();
	    String success_failure_message=pom_obj.return_Message();
	    //System.out.println(success_failure_message);
	    Assert.assertEquals("Your address has been successfully added", success_failure_message);
	    
	   
	    
	}
		
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		
	    //Create an object of File class to open xlsx file
	    File file =    new File(filePath+"//"+fileName);
	    //Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook guru99Workbook = null;
	    //Find the file extension by splitting file name in substring  and getting only extension name
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    //Check condition if the file is xlsx file
	    if(fileExtensionName.equals(".xlsx")){
	    //If it is xlsx file then create object of XSSFWorkbook class
	    guru99Workbook = new XSSFWorkbook(inputStream);
	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        guru99Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = guru99Sheet.getRow(i);
	        
	        //Create a loop to print cell values in a row
	       
	        for (int  j = 0; j < row.getLastCellNum(); j++) {
	            //Print Excel data in console
	            // System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	            myArray[i][j]=row.getCell(j).getStringCellValue();
	            
	        }

	        //System.out.println();
	        


	    }
/*
	    String EmailID=myArray[0][0];			//System.out.println(EmailID);
	    String Password=myArray[1][0];			//System.out.println(Password);
	    String First_Name=myArray[2][0];		//System.out.println(First_Name);
	    String Last_Name=myArray[3][0];			//System.out.println(Last_Name);
	    String Company=myArray[4][0];			//System.out.println(Company);
	    String Address=myArray[5][0];			//System.out.println(Address);
	    String City=myArray[6][0];				//System.out.println(City);
	    String Pincode=myArray[7][0];			//System.out.println(Pincode);
	    String Country=myArray[8][0];			//System.out.println(Country);
	    String State=myArray[9][0];				//System.out.println(State);
	    String Default_Button=myArray[10][0];	//System.out.println(Default_Button);
*/
				
	}

}
