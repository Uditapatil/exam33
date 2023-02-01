package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {
ChromeDriver driver;
public void open()
{
	System.setProperty("webdriver.chrome.driver","E:\\eclipsecode\\Eclipseworkspace\\library\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/v4/");
	driver.manage().window().maximize();
	driver.close();
}
public void login() {
	WebElement usnm=driver.findElement(By.name("emailid"));
	usnm.sendKeys("udita");
driver.findElement(By.name("btnlogin")).click();
}
public void login2() {
	driver.findElement(By.name(""));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
script2 o=new script2();
o.open();
o.login();
	}

}
