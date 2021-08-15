package automationpractice.rahulshetty.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationpractice.rahulshetty.utils.BaseClass;

public class AllPages extends BaseClass {

	public WebDriver driver;

	public AllPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// using page factory
	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement suggestion_class_input1;
	@FindBy(xpath = "//ul[@id='ui-id-1']//li//div[text()='Mexico']")
	public WebElement new2;
	@FindBy(xpath = "//*[@name=\"dropdown-class-example\"]/option[3]")
	public WebElement option2;
	@FindBy(xpath = "//*[@name=\"dropdown-class-example\"]/option[4]")
	public WebElement option3;
	@FindBy(xpath = "//button[@id='openwindow']")
	public WebElement openwindow;
	@FindBy(xpath = "//div[@style=\"position: absolute; inset: 0px; box-shadow: rgba(0, 0, 0, 0) 0px 0px 0px inset;\"]")
	public WebElement closepopup;
	@FindBy(xpath = "//a[@id='opentab']")
	public WebElement opentab;
	@FindBy(xpath = "//a[contains (text(), 'VIEW ALL COURSES')]")
	public WebElement viewcorse;
	@FindBy(css = "a[id=opentab]")
	public WebElement opentabcs;
	@FindBy(xpath = "//input[@id='name']")
	public WebElement switchtab;
	@FindBy(css = "input[id=alertbtn]")
	public WebElement alrtbtn;
	@FindBy(css = "input[id=confirmbtn]")
	public WebElement confirmbtn;
	@FindBy(xpath = "//table[@name='courses']")
	public WebElement tbl;
	@FindBy(xpath = "//*[@id=\"product\"]/tbody/tr/td[contains (text(), '25')]")
	public WebElement tx25;
	@FindBy(xpath = "//div[@class='text-center']")
	public WebElement chk;
	@FindBy(xpath = "//header[@class='jumbotron text-center header_style']")
	public WebElement inv1;
	@FindBy(xpath = "//input[@id='autocomplete']")
	public WebElement inv;
	@FindBy(xpath = "//table[@name='courses'] //td[text()='25']/preceding-sibling::td[1]")
	public List<WebElement> table25;
	@FindBy(xpath = "//td[text()='Engineer']/preceding-sibling::td")
	public List<WebElement> Engineersnames;
	@FindBy(xpath = "//iframe[@id='courses-iframe']")
	public WebElement IFrame;
	@FindBy(xpath = "//li[text()='His mentorship program is most after in the software testing community with long waiting period.']")
	public WebElement text;

}
