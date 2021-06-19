package com.automationpratice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_Class2 {

	public static WebDriver driver;
	//browserlaunch
public static WebDriver browserLaunch(String browser)
{
	try {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Java_Selenium\\Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
//	else if(browser.equalsIgnoreCase("firefox"))
//	{
			
//	}
		else
		{
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
	     	
		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return driver;

}
//sendkeys
public static void enterValues(WebElement element,String str)
{
	try {
		element.sendKeys(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
//click method
public static void clickOnElement(WebElement element)
{
	try {
		element.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
//Action 
	public static void mouseAction(WebElement element,String s)
{
	try {
		Actions act=new Actions(driver);
		
		if(s.equalsIgnoreCase("click"))
		{
			act.click(element).perform();
		}
		else if(s.equalsIgnoreCase("contextclick"))
		{
			act.contextClick(element).perform();
		}
		else if(s.equalsIgnoreCase("doubleclick"))
		{
			act.doubleClick(element).perform();
		}
		else if(s.equalsIgnoreCase("movetoelement"))
		{
			act.moveToElement(element).perform();
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	//dragandrop
	public static void dragandDrop(WebElement element,WebElement element1)
	{		
		try {
			Actions act=new Actions(driver);
			act.dragAndDrop(element, element1).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//ismultiple
	public static void multiDrop(WebElement element)
	{
		try {
			Select s= new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//getoptions
	public static void getOption(Select s,WebElement element)
	{
		try {
			List<WebElement> options = s.getOptions();
			for (WebElement elements : options)
     {
				String text = elements.getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//getallselectedoptions
	public static void getAllSelectOptn(WebElement element,String str)
	{  
		try {
			Select s=new Select(element);
			s.selectByValue(str);
List<WebElement> allSelOptions = s.getAllSelectedOptions();
for (WebElement webElement : allSelOptions) 
{
			String text = webElement.getText();
			System.out.println(text);
}
		} catch (Exception e) {
			e.printStackTrace();
		}
	/*for (WebElement element1 : allSelOptions)
	{
		if(element1.getText().equals(str))
		{
			System.out.println(element1.getText());
		}
	}*/
	}
//getfirstselct
	public static void getFirstSelect(WebElement element,String Str)
	{
		try {
			Select s=new Select(element);
			WebElement firstSelOption = s.getFirstSelectedOption();
			System.out.println(firstSelOption.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//getext
	public static void geText(WebElement element)
	{
		try {
			Select s=new Select(element);
			int size = s.getOptions().size();
			System.out.println(size);
			List<WebElement> options = s.getOptions();
			for (int i = 0; i < size; i++) 
			{
				//if(i==1||i==3)
				//{}
				String text = options.get(i).getText();
				System.out.println(text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//robot class
	public static void robotAction(WebElement element,int n) throws AWTException
	{
		try {
			Actions act=new Actions(driver);
			act.contextClick(element).perform();
			Robot rob=new Robot();
			int i;
			
			for(i=0;i<n;i++)
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
//select
public static void selectIndex(WebElement element,String value)
{
	Select s= new Select(element);
	
	s.selectByIndex(Integer.parseInt(value));
	}

public static void selectValue(WebElement element,String value)
{
	Select s= new Select(element);
	s.selectByValue(value);
		
	}

public static void selectVisibleText(WebElement element,String value)

	{
	Select s= new Select(element);

		s.selectByVisibleText(value);
	}




//close
public static void closeCurrentPage()
{
	try {
		driver=new ChromeDriver();
		driver.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
//quit
public static void quit()
{
	try {
		driver=new ChromeDriver();
		driver.quit();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


//getUrl

public static void getUrl(String str)
{
	try {
		driver.get(str);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

//getmethod
public static void getTitle(String str)
{
		try {
			String title = driver.getTitle();
			System.out.println(title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public static void currentUrl(String str)
	{
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//navigation method
public static void navigateTo(String url)
{
   	try {
		driver.navigate().to(url);
	} catch (Exception e)
   	{
		e.printStackTrace();
	}
    }

public static void navigateback(String url) {
    
    
  	try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
 public static void navigateforward(String url) 
    {
    	try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
   
 public static void navigaterefresh(String url)
    {
    	try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

//waitconcept
public static void implicitWait(long a)
{
	try {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		}

public static void explicitWait(WebElement element,long a)
{
	try {
		WebDriverWait wait=new WebDriverWait(driver,a);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
//Alert
public static void alert(WebElement element,String str)
{
	try {
		Alert alrt=driver.switchTo().alert();
		if(str.equalsIgnoreCase("accept"))
		{
		
			alrt.accept();
			element.click();
		}
		else if(str.equalsIgnoreCase("dismiss"))
		{
		alrt.dismiss();
		element.click();
}
		else if(str.equalsIgnoreCase("sendkeys"))
		{
			
			alrt.sendKeys(str);
			alrt.accept();

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
/*public static void confirmAccept(WebElement element)
{
	Alert alrt=driver.switchTo().alert();
	
		alrt.accept();					
		element.click();
}
public static void confirmDismiss(WebElement element)
	{
	Alert alrt=driver.switchTo().alert();
		alrt.dismiss();
		element.click();
	}
public static void promAlert(WebElement element)
{
Alert alrt=driver.switchTo().alert();
alrt.accept();
element.click();

}
public static void promSend(WebElement element,String str)
{
Alert alrt=driver.switchTo().alert();
alrt.sendKeys(str);
}*/

//frame
public static void framelement(WebElement element)
{
try {
	driver.switchTo().frame(element);
	element.click();
} catch (Exception e) {
	e.printStackTrace();
}

}//frame
public static void frameindex(int a)
{
try {
	driver.switchTo().frame(a);
} catch (Exception e) {
	e.printStackTrace();
}
}
//isSelect
public static void isSelect(WebElement element)
{
try {
	element.click();
	boolean selected = element.isSelected();
	System.out.println(selected);
} catch (Exception e) {
	e.printStackTrace();
}
}
//isdisplay
public static void isdisplay(WebElement element)
{
try {
	boolean dispalyed = element.isDisplayed();
	System.out.println(dispalyed);
} catch (Exception e) {
	e.printStackTrace();
}
}
//isEnabled
public static void isEnabled(WebElement element)
{
try {
	boolean enabled = element.isEnabled();
	System.out.println(enabled);
} catch (Exception e) {
	e.printStackTrace();
}
}
//windowhandle
public static void windowHandle(String str) throws InterruptedException
{
//driver.switchTo().window(str);
if(str.equalsIgnoreCase("parentwindow"))
{
String str1 = driver.getWindowHandle();
System.out.println(str1);
}
else if(str.equalsIgnoreCase("childwindow"))
{
	Set<String> handles= driver.getWindowHandles();
	Thread.sleep(2000);
	for (String str1: handles)
	{
		System.out.println(str1);
		String title = driver.switchTo().window(str1).getTitle();
		System.out.println(title);
	}
	}
else if(str.equalsIgnoreCase("title"))
{
	String str1 = driver.getWindowHandle();
	String title = driver.switchTo().window(str1).getTitle();
	System.out.println(title);
}
}
//JavaScriptExecutor scrollfunction
public static void scroll(WebElement element,String str)
{
try {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(str.equalsIgnoreCase("click"))
	{
		js.executeScript("arguments[0].click();",element);
	}
	else if(str.equalsIgnoreCase("scrollIntoView"))
	{
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	else if(str.equalsIgnoreCase("scrollUp"))
	{
		js.executeScript("window.scrollBy(0,500);");
	}
} catch (Exception e) {
	e.printStackTrace();
}
}
//Screenshot
public static void screenShot(String str) throws IOException
{
try {
	TakesScreenshot ts=(TakesScreenshot) driver;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn =new File(str);
	FileUtils.copyFile(src, destn);
} catch (WebDriverException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
}
//getattribute
public static void getattribute(WebElement element,String str)
{
try {
	if(str.equalsIgnoreCase("value"))
	{
	String attr = element.getAttribute("value");
	System.out.println(attr);
	}
	else if(str.equalsIgnoreCase("name"))
	{
		String attr = element.getAttribute("name");
		System.out.println(attr);
	}
} catch (Exception e) {
	e.printStackTrace();
}
}


public static void getAttribut(By bySearchButton)
{
	WebElement element=driver.findElement(bySearchButton);
	System.out.println(element);
}
}


