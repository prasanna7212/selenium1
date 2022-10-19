package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub n  
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver=new ChromeDriver();
  driver.get("http://leaftaps.com/opentaps/control/main");
  driver.manage().window().maximize();
  driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); 
  driver.findElement(By.id("Password")).sendKeys("rmsfa");
  driver.findElement(By.className("decorativeSubmit")).click();
  driver.findElement(By.linkText("CRMSF")).click();
  driver.findElement(By.linkText("Leads")).click();
  driver.findElement(By.linkText ("CreateLead")).click();
  driver.findElement(By.name("departmentName")).sendKeys("QA Engineer");
	driver.findElement(By.name("description")).sendKeys("Selenium WebDriver");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sreedharvarma2614@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("Automation engineering is the best");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	
System.out.println(title);
		
  
	   
  
  
	}
}
                     	 
