	public void getScreenshot(WebDriver driverxx) throws IOException
	{
	
		 File src = ((TakesScreenshot)driverxx).getScreenshotAs(OutputType.FILE);
		 Date dt = new Date();
		 String replDate = dt.toString().replace(":", "_");
		 
		 File dest = new File(Path.Local_ScrPath+replDate+"image.jpg");
		
		 FileHandler.copy(src, dest);
		
	}
