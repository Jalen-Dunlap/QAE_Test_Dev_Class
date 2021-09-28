package basics.demoQa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import basics.framework.PageObject;

public class DemoQaHomePage extends PageObject {

	protected DemoQaHomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	@FindBy(how=How.CSS, using = "div.home-banner a")
	private WebElement joinNow;
	
	public ToolsQaSeleniumTrainingPage clickJoinNow() {
		joinNow.click();
		
		String[] windows = driver.getWindowHandles().toArray(new String[4]);
		driver.switchTo().window(windows[2]);
		
		return new ToolsQaSeleniumTrainingPage(driver,baseUrl);
	}
	
	
}
