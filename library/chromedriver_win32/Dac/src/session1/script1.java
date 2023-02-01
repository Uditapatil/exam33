package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {
ChromeDriver driver;
public void open()
{
	System.setProperty("webdriver.chrome.driver", "E:\\eclipsecode\\library.chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(null);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
script1 o=new script1();
o.open();
	}

}
