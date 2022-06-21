package UtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import configuration.Path;
public class Utility 


{
	public void takeScreeenshot(String tcID, WebDriver driverxx) throws IOException
	{
		File src = ((TakesScreenshot)driverxx).getScreenshotAs(OutputType.FILE);
		 
//		 Date dt = new Date();
//		 String date = dt.toString().replace(":", "_");            // Date is Optional if tcID changes
		 
		File dest = new File(Path.project_ScrPath + tcID + ".jpg");
		
		FileHandler.copy(src, dest);
	}
	
	
	
//    ====================  To Get ScreenShot of Particular Element  ==========================
	
	public void takeScreeenshot(String tcID, WebElement vote) throws IOException
	{
		 File src = vote.getScreenshotAs(OutputType.FILE);
		 
		 Date dt = new Date();
		 String date = dt.toString().replace(":", "_");
		 
		File dest = new File(Path.project_ScrPath + tcID + "_" + date + ".jpg");
		
		FileHandler.copy(src, dest);
	}
	

//  ====================  To Get ScreenShot of Particular Element  ==========================
	
	public String readXLData(int row, int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream xlFile = new FileInputStream(Path.XL_path);
		
		String sheet = WorkbookFactory.create(xlFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		
		return sheet;
	}
	
	
	public String readPropertyFile(String key) throws IOException
	{
		
		FileInputStream proFile = new FileInputStream(Path.PropertiesPath);
		
		Properties pro = new Properties();

		pro.load(proFile);
		
		String keys = pro.getProperty(key);
		
		return keys;
	}
	
	
	
	

}
