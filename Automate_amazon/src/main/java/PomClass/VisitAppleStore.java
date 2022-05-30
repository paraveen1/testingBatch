package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitAppleStore {
	@FindBy(xpath="//a[@id='bylineInfo']")
	private WebElement visitAppleStore;
	
	public VisitAppleStore(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void OpenVisitAppleStore()
	{
		visitAppleStore.click();
	}

}
