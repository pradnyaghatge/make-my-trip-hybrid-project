package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.HandleAction;
import utilityLayer.HandleCalender;
import utilityLayer.HandleRadiobutton;
import utilityLayer.HandleWebElement;

public class searchPage extends BaseClass {
	@FindBy(xpath = "//span[@class='commonModal__close']")
	WebElement wbclose;

	@FindBy(id = "fromCity")
	WebElement wbfrom;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement wbfromcity;

	@FindBy(id = "toCity")
	WebElement wbto;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement wtocity;
	
	@FindBy(xpath="//p[text()='Goa - Dabolim Airport, India']")
	WebElement selfrom;

	@FindBys(@FindBy(xpath = "//div[@class='makeFlex gap8 hrtlCenter  ']/child::div"))
	List<WebElement> wbfare;

	@FindBy(xpath = "//p[text()='Pune Airport']")
	WebElement selectcity;

	// @FindBy(id="departure")
	// WebElement wbdetart;

	@FindBy(xpath = "//div[@class='DayPicker-Months']/child::div/preceding-sibling::div/child::div[@class='DayPicker-Caption']/child::div")

	WebElement wbmonthyear;

	@FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement wbnext;

	@FindBys(@FindBy(xpath = "//div[@class='DayPicker-Months']/child::div/preceding-sibling::div/descendant::p/preceding-sibling::p"))
	List<WebElement> wbdate;

	@FindBy(xpath="//p[@data-cy='travellerText']")
	WebElement wbtraveller;

	@FindBys(@FindBy(xpath = "//p[@data-cy='adultRange']/following-sibling::ul[@class='guestCounter font12 darkText gbCounter']/child::li"))
	List<WebElement> wbadult;

	@FindBys(@FindBy(xpath = "//p[@data-cy='childrenRange']/following-sibling::ul/child::li"))
	List<WebElement> wbchild;

	@FindBys(@FindBy(xpath = "//p[@data-cy='childrenRange']/following-sibling::ul/child::li"))
	List<WebElement> wbinfant;
	
	@FindBy(xpath="//li[@data-cy='travelClass-2']")
	WebElement wbclass;
	
	@FindBy(xpath="//button[text()='APPLY']")
	WebElement wbapply;
	
	@FindBy(xpath="//a[text()='Search']")
	WebElement wbsearch;
	
	

	public searchPage() {
		PageFactory.initElements(driver, this);
	}

	public void searchPageFunctionality(String fromcity, String tocity, String monthyear, String date, String adult,
		
		String child, String infant) throws Exception {
		
		HandleWebElement.click(wbclose);
		
		HandleWebElement.click(wbfrom);
		
		
		
		HandleWebElement.click(wbfromcity);
		
		
		
		HandleAction.sendKeys(wbfromcity, fromcity);
		
		
		HandleWebElement.click(selfrom);
		
		
		HandleWebElement.click(wbto);
		
		
		
		HandleWebElement.click(wtocity);
		
		
		
		HandleAction.sendKeys(wtocity, tocity);
		
	
		
		HandleWebElement.click(selectcity);
		
		// HandleRadiobutton.selectRadiobutton(wbfare, fare);
		
		// HandleWebElement.click(wbdetart);

		
		
		HandleCalender.selectMonthYear(wbmonthyear, wbnext, monthyear);
		
		
		HandleCalender.selectdate(wbdate, date);
		
		
		HandleWebElement.click(wbtraveller);
		
		
		HandleCalender.selectdate(wbadult, adult);
		
		
		HandleCalender.selectdate(wbchild, child);
		
		
		HandleCalender.selectdate(wbinfant, infant);
		
		
		HandleWebElement.click(wbclass);
		
		HandleWebElement.click(wbapply);
		
		HandleWebElement.click(wbsearch);
		
		

	}

}
