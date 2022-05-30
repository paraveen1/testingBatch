package loginPageamazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.AmazonLoginpage;

public class AmazoneloginPage {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		AmazonLoginpage amazonloginpage = new AmazonLoginpage(driver);
		amazonloginpage.singinPage();
		amazonloginpage.entermobilenumber("9860067721");
		Thread.sleep(5000);
//		amazonloginpage.ClickOncontinueButton();
//	    Thread.sleep(5000);
//		amazonloginpage.enterPassword("jkdigital19");
//		Thread.sleep(5000);
//		amazonloginpage.ClickOnsignInButton();
//		Thread.sleep(5000);
		
		amazonloginpage.accountAndlist(driver);
		amazonloginpage.signOutbutton(driver);
}
}