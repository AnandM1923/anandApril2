package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.ActionsUtility;
import basepckg.BaseClass;

public class HomePage extends BaseClass {
	public WebDriver driver;
	ActionsUtility actionsUtility=new ActionsUtility();
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
@FindBy(xpath="//a[@href='/abtest']")
	WebElement ele;

public boolean IsDispaleyd() {
	boolean dis=actionsUtility.IsDisplayed(driver, ele);
	return dis;
	
}

}
