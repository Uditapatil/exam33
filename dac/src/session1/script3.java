package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script3 {
ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","E:\\eclipsecode\\Eclipseworkspace\\library\\chromedriver.exe");
      	driver = new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		WebElement usnm = driver.findElement(By.name("uid"));
		usnm.sendKeys("mngr475299");
		// by.name => name is html attribute. We can choose by.class, by.id etc.
		driver.findElement(By.name("password")).sendKeys("sUgypEm"); // function chaining method
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Customer")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys("08/12/1999");
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Amravati");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name=\"pinno\"]")).sendKeys("444604");
		driver.findElement(By.xpath("//input[@name=\"telephoneno\"]")).sendKeys("9309295165");
		driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys("ashwini@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name=\"sub\"]")).click();
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		script3 o = new script3();
		o.open();
		o.login();
}

}