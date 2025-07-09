package testLayer;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.searchPage;
import utilityLayer.ExcelReader;

public class searchPageTest extends BaseClass {

	@BeforeTest
	public void setup() {
		BaseClass baseClass = new BaseClass();
		baseClass.initialization();
	}

	@Test(dataProvider = "tripdata")

	public void validatesearchPageFunctonality(String fromcity, String tocity, String monthyear, String date,
			String adult,

			String child, String infant) throws Exception {
		searchPage search = new searchPage();
		search.searchPageFunctionality(fromcity, tocity, monthyear, date, adult, child, infant);
	}

	@DataProvider(name = "tripdata")
	public Object[][] getdata() throws Exception {
		String excelpath = "/Users/pradnya/Documents/PradnyaWorkspace/searchdata.xlsx";

		ExcelReader ex = new ExcelReader(excelpath, "data");

		Object[][] data = ex.getalldata();

		return data;

	}

}
