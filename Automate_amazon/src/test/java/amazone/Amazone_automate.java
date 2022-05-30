package amazone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClass.BuyAirPodPage;
import PomClass.VisitAppleStore;
import PomClass.WatchShoppingPage;

public class Amazone_automate {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
	       WatchShoppingPage  watchshoppingPage = new   WatchShoppingPage(driver) ;
	       
	       watchshoppingPage.ClickWatchShoppingPage();
	       
		BuyAirPodPage buyAirpodPage = new BuyAirPodPage (driver);
		  
		buyAirpodPage.OpenBuyAirPodPage();
		
		VisitAppleStore visitAppleStore = new VisitAppleStore(driver);
		
		visitAppleStore.OpenVisitAppleStore();
		 //testCase1
		String url = driver.getCurrentUrl();
		
		//String url2 = driver.getCurrentUrl();
		
		//if(url.equals("https://www.amazon.com/stores/Apple/page/77D9E1F7-0337-4282-9DB6-B6B8FB2DC98D?ref_=ast_bln")&&
			//	url2.equals("https://www.amazon.com/Apple-AirPods-Charging-Latest-Model/dp/B07PXGQC1Q/ref=lp_17938598011_1_1"));
		//{
			//System.out.println("pass");
		//}
		
		
		if(url.equals("https://www.amazon.com/stores/Apple/page/77D9E1F7-0337-4282-9DB6-B6B8FB2DC98D?ref_="))
		{
			System.out.println("pass");
		}
		
		else
			
		{System.out.println("fail");
			
		}
		
		
	}

}
