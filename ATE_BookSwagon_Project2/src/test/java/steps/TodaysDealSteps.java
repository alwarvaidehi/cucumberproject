package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SearchBoxPage;
import pages.Todaysdealpage;

public class TodaysDealSteps extends SearchBoxPage{
	Todaysdealpage td;
	@Given("user click on the todays deal")
	public void user_click_on_the_todays_deal() throws InterruptedException {
		//
	
		td=PageFactory.initElements(driver, Todaysdealpage.class);
		Thread.sleep(3000);
	   td.todaysdeallog();
	}

	@Given("user selected first item")
	public void user_selected_first_item() {
	 td.selecing();   
	}

	@When("user click on the buynow button")
	public void user_click_on_the_buynow_button() {
      td.buynoebtn();
     // driver.quit();
    //  driver.close();
	}


}
