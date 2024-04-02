package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basepckg.BaseClass;

public class ActionsUtility extends BaseClass {
	
	
	public boolean IsDisplayed(WebDriver ldriver,WebElement ele) {
		
		boolean flag=true;
		try {
			boolean isDis=ele.isDisplayed();
			flag=true;
		}catch (Exception e) {
			flag=false;
			System.out.println(e.getMessage());
		}
		
		if(flag) {
			System.out.println("The Webelement is dispalyed :" +ele);
		}else {
			System.out.println("The Webelement is not dispalyed :" +ele);
		}
		
		return flag;
		
	}

	
	
}
