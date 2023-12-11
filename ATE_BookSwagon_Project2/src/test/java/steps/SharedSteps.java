package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedSteps {
	
	@Before(order=0)
	public void openBrowser()
	{
		System.out.println("opening the website");
		
	}
	@Before(order=1)
	public void creatingaccount()
	{
		System.out.println("login  website");
		
	}
   @After(order=1)
   public void search()
   {
	   System.out.println("Successfully searched in the  website");
   }
   @After(order=0)
   public void CloseBrowser()
   {
	   System.out.println("closing the browser");
	  
   }
}
