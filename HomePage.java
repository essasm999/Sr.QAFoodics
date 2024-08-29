// Sulaiman Mohammed AlEssa / +966540054047  / essasm@hotmail.com

package foodics;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

//	@Test
	public static void main(String[] args) throws InterruptedException	{
	
		
		// chrome driver exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test_\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new WebDriver();
	
		// will navigate Amazon home page
		driver.get(" https://www.amazon.eg/");
		System.out.println("Amazon website open");
		
		//Maximize the page
		driver.manage().window().maximize();
	    System.out.println("The Window Maximized");

		// Keep the browser opened
		Thread.sleep(1000);
		
		// click on Login
		WebElement log = driver.findElemnt(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		log.click();
		System.out.println("The Login menu open");
		
		// Click on Sign-in
		WebElement login = driver.findElemnt(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		login.click();
		System.out.println("Click on Login");
		
		
		// Enters email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]"));
		email.click();
		email.sendKeys("essa@hotmail.com");
		System.out.println("Entered Email");
		
		// Clicks on Next email button
		WebElement nextem = driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input"));
		nextem.click();
		System.out.println("Clicks on Continue button");
		
		// Enters password
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		pass.click();
		pass.sendKeys("12345678");
		System.out.println("enters Password");
		
		// Clicks on sign in button
		WebElement signIn = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		signIn.click();
		System.out.println("Clicks on sign in button");
		
		// because this Test Data; I will open the Amazon home page again
		
		// will navigate Amazon home page
		driver.get(" https://www.amazon.eg/");
		System.out.println("Amazon website open");
		
		
		// Clicks on All menu at left side
		WebElement Allleft = driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]"));
		Allleft.click();
		System.out.println("Clicks ALl button at left sise");
				
		// Clicks see all button
		WebElement seeAll = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[14]/a[1]"));
		seeAll.click();
		System.out.println("Clicks on See All button");
		
		//scroll down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		    
	  // This  will scroll down the page by  1000 pixel vertical to see the videos Games button
		js.executeScript("window.scrollBy(0,1000)");
		// Keep the browser opened
		Thread.sleep(1000);
		System.out.println("Scroll down to see all --> Video Games");     

		 // Clicks Video Games button
		  WebElement vGames = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/ul/li[11]/a"));
		  vGames.click();
		  System.out.println("Clicks on Video Games button");

		// Clicks All video Games button
		  WebElement  allvGame= driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[16]/li[3]/a"));
		  allvGame.click();
		  System.out.println("Clicks on All Video Games button");    			
		    		    
		// Clicks Filter Free shipping
			WebElement FreeShip  = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div[1]/label/i"));
			FreeShip.click();
			System.out.println("Clicks on Free Shipping Filter");	    	    
	    	    
			// Keep the browser applying Filter 
    		Thread.sleep(2000);
			
    		//scroll down the page
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		    
    	  // This  will scroll down the page by  2100 pixel vertical see New condition button
    		js.executeScript("window.scrollBy(0,2100)");
    		// Keep the browser opened
    		Thread.sleep(1000);
    		System.out.println("Scroll down to see New Condition");     
	
    		
			// Clicks new Conditions
			WebElement newCon = driver.findElement(By.xpath("//*[@id=\"p_n_condition-type/28071525031\"]"));
			newCon.click();
			System.out.println("Clicks on New Condition");
			
			
			// Keep the browser opened to see the result
    		Thread.sleep(1000);
			
    		// Clicks sort price from high to low
			WebElement sort = driver.findElement(By.id("s-result-sort-select_2"));
			sort.click();
			System.out.println("Clicks on sort From High to Low");
    		
			//scroll down the page
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		    
    	  // This  will scroll down the page by  5000 pixel vertical see New condition button
    		js.executeScript("window.scrollBy(0,5000)");
    		// Keep the browser opened
    		Thread.sleep(1000);
    		System.out.println("Scroll down to Next page bar");     
	
    		// Clicks Next button to go to Next page
			WebElement nexPa1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[18]/div/div/span/a[3]"));
			nexPa1.click();
			System.out.println("Clicks on Next page button");
    		
			// Clicks  item 1 to view Product details page
			WebElement it1 = driver.findElement(By.Class(("a-size-medium a-color-base a-text-normal"));
			it1.click();
			System.out.println("open item page details,"
					+ " First itme's price below 15K EGP");
			// Clicks add to Cart button
			WebElement add1 = driver.findElement(By.id("add-to-cart-button"));
			add1.click();
			System.out.println("Clicks on Add to cart"
					+ "First itme's price below 15K EGP");
			
	        //Back return page of Product
	        driver.navigate().back();
	        //Back return to search page
	        driver.navigate().back();
			
	     // Clicks add to cart for second item 2
			WebElement add2 = driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));
			add2.click();
			System.out.println("Clicks on add to cart the second item");
			
			// Clicks 
			WebElement add3 = driver.findElement(By.Class("a-size-medium a-color-base a-text-normal"));
			add3.click();
			System.out.println("Clicks on add the third item 3, open Product details page");	
			
			
			// Clicks add to Cart button for 3third Product
			WebElement add3 = driver.findElement(By.id("add-to-cart-button"));
			add3.click();
			System.out.println("Clicks on Add to cart"
					+ "Third itme's price below 15K EGP");
			
	        //Back return page of Product
	        driver.navigate().back();
	        //Back return to search page
	        driver.navigate().back();
			
	     // Clicks add to Cart for the fourth item
			WebElement add4 = driver.findElement(By.id("a-autoid-2-announce"));
			add4.click();
			System.out.println("Clicks on Add to Cart for the fourth item");		
			
			 // Clicks add to Cart for the Fifth item
			WebElement add5 = driver.findElement(By.id("a-autoid-3-announce"));
			add5.click();
			System.out.println("Clicks on Add to Cart for the Fifth item");		
								
			 // Clicks add to Cart for the sixth item
			WebElement add6 = driver.findElement(By.id("a-autoid-4-announce"));
			add6.click();
			System.out.println("Clicks on Add to Cart for the sixth item");		
			

			 // Clicks add to Cart for the seventh item
			WebElement add7 = driver.findElement(By.id("a-autoid-5-announce"));
			add7.click();
			System.out.println("Clicks on Add to Cart for the seventh item");		
					
			
			
	 // Clicks add to Cart for the eighth item
	WebElement add8 = driver.findElement(By.id("a-autoid-7-announce"));
	add8.click();
	System.out.println("Clicks on Add to Cart for the eighth item");		
		
			
	// Clicks open ninth Product page
	WebElement it9 = driver.findElement(By.Class("a-size-medium a-color-base a-text-normal"));
	it9.click();
	System.out.println("Clicks on open Product details page");

	// Clicks add to Cart button for 9  Product
	WebElement add9 = driver.findElement(By.id("add-to-cart-button"));
	add9.click();
	System.out.println("Clicks on Add to cart"
			+ "Nineth itme's price below 15K EGP");
	
    //Back return page of Product
    driver.navigate().back();
    //Back return to search page
    driver.navigate().back();
	
	
	
	// Clicks open tenth Product page
	WebElement it10 = driver.findElement(By.Class(""));
	it10.click();
	System.out.println("Clicks on open Product details page");

	// Clicks add to Cart button for 10  Product
	WebElement add10 = driver.findElement(By.id("add-to-cart-button"));
	add10.click();
	System.out.println("Clicks on Add to cart"
			+ "Tenth itme's price below 15K EGP");
	
    //Back return page of Product
    driver.navigate().back();
    //Back return to search page
    driver.navigate().back();
	
	

	
	// Clicks open tenth Product page
	WebElement it10 = driver.findElement(By.Class(""));
	it10.click();
	System.out.println("Clicks on open Product details page");

	// Clicks add to Cart button for 10  Product
	WebElement add10 = driver.findElement(By.id("add-to-cart-button"));
	add10.click();
	System.out.println("Clicks on Add to cart"
			+ "Tenth itme's price below 15K EGP");
	
    //Back return page of Product
    driver.navigate().back();
    //Back return to search page
    driver.navigate().back();
	
	
    

	
	// Clicks open eleventh Product page
	WebElement it11 = driver.findElement(By.Class("a-size-mini a-spacing-none a-color-base s-line-clamp-2"));
	it11.click();
	System.out.println("Clicks on open Product details page");

	// Clicks add to Cart button for 11  Product
	WebElement add11 = driver.findElement(By.id("add-to-cart-button"));
	add11.click();
	System.out.println("Clicks on Add to cart"
			+ "eleventh itme's price below 15K EGP");
	
    //Back return page of Product
    driver.navigate().back();
    //Back return to search page
    driver.navigate().back();
	
	
    

	// Clicks open eleventh Product page
	WebElement it12 = driver.findElement(By.Class("a-size-mini a-spacing-none a-color-base s-line-clamp-2"));
	it12.click();
	System.out.println("Clicks on open Product details page");

	// Clicks add to Cart button for 11  Product
	WebElement add12 = driver.findElement(By.id("add-to-cart-button"));
	add12.click();
	System.out.println("Clicks on Add to cart"
			+ "twelvth itme's price below 15K EGP");
	
    //Back return page of Product
    driver.navigate().back();
    //Back return to search page
    driver.navigate().back();
	
	
 // Clicks go to basket
	WebElement basket = driver.findElement(By.Class("a-button-text"));
	basket.click();
	System.out.println("Clicks on go to basket");
    
	// Clicks proceed to Buy button
	WebElement buy = driver.findElement(By.id("proceed-to-checkout-action"));
	buy.click();
	System.out.println("Clicks on proceed to Buy button");
			
		
	// because I have address already saved, I will click on add new address to complete requirement 
	// Clicks on add new address
	WebElement newAddress = driver.findElement(By.id("add-new-address-popover-link"));
	newAddress.click();
	System.out.println("Clicks on add new address");
	
	// Clicks enter Full Name
	WebElement fullName = driver.findElement(By.id("address-ui-widgets-enterAddressFullName"));
	fullName.click();
	fullName.sendKeys("Sulaiman Mohammed AlEssa");
	System.out.println("Clicks on enter full name input, and enters Sulaiman's Name");
	
	// Clicks enter phoneNumber
		WebElement phone = driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber"));
		phone.click();
		phone.sendKeys("564849849");
		System.out.println("Clicks on enter full name input");
		
	
	// send keys to enters a Street Name
	WebElement street  = driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
	street.click();
	street.sendKeys("Cairo");
	System.out.println("Clicks on street input button, and enters Street");
		
	
	
	// send keys to enters a building Number
		WebElement buildNo  = driver.findElement(By.id("address-ui-widgets-enter-building-name-or-number"));
		buildNo.click();
		buildNo.sendKeys("2");
		System.out.println("Clicks on street input button, and enters building number: 2");
		
		// select area and City
		WebElement area1  = driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		area.click();
		WebElement area1  = driver.findElement(By.Name("Cairo, "));
		area1.click();
		System.out.println("Clicks on area input button, and select Cairo");
		
		// select District
				WebElement dis  = driver.findElement(By.id("address-ui-widgets-enterAddressDistrictOrCounty"));
				dis.click();
				WebElement dis1  = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div[14]/ul/li[1]"));
				dis1.click();
				System.out.println("Clicks on District input button, and select district ");
		
	
	// enters nearest point
	WebElement near = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]"));
	near.click();
	near.sendKeys("Masjid");
	System.out.println("Clicks on nearest point input + enters Masjid");
	
	
	// Clicks add delivery instruction, click on Radio button "Home (7am-9pm, all days)"
	WebElement home = driver.findElement(By.id("address-ui-widgets-addr-details-res-radio-input"));
	home.click();
	System.out.println("Clicks on Radio button: Home (7am-9pm, all days)");
	
	// Clicks add Address button
	WebElement addAddressButton = driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input"));
	addAddressButton.click();
	System.out.println("Clicks on Add Adress button");
	
	// no available cash option; because the URL is AMAZON Egypt not allowed on Saudi Arabia
	// I will complete the assignment by add new Card
	
	// Clicks add new Card 
	WebElement newCard = driver.findElement(By.xpath("//*[@id=\"pp-Gyb8HD-257\"]"));
	newCard.click();
	System.out.println("Clicks on add new Card");
	
	// Clicks input CARD Number input
	WebElement inCard = driver.findElement(By.xpath(""));
	inCard.click();
	inCard.sendKeys("5360230159427034");
	System.out.println("Clicks on Card input cell and enters TestCard Number");

	// Clicks input CARD Holder Name  input	     
		WebElement inCardHold = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-19\"]"));
		inCardHold.click();
		inCardHold.sendKeys("Sulaiman AlEssa");
		System.out.println("Clicks on Card Holder input cell and enters Card Holder Name");

	
	
	
	// Clicks month list button
	WebElement month = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-23\"]/span/span"));
	month.click();
	System.out.println("Clicks on month button");
	
	// selects Month: 11 Novemeber
	WebElement 11 = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-20_10\"]"));
	11.click();
	System.out.println("Clicks on 11 November");
	
	
	// selects Year = 2024
		WebElement year = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-24\"]/span/span"));
		year.click();
		System.out.println("Clicks on Year button");
		
		
	
	// Clicks 
	WebElement 24 = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-22_0\"]"));
	24.click();
	System.out.println("Clicks on Year = 2024");
	
	// Clicks add Card
	WebElement cardadded = driver.findElement(By.xpath("//*[@id=\"pp-oVgR4C-28\"]/span/input"));
	cardadded.click();
	System.out.println("Clicks on Add Card button");
	
	
	// Clicks proceed with payment
	WebElement proceed = driver.findElement(By.id("orderSummaryPrimaryActionBtn-announce"));
	proceed.click();
	System.out.println("Clicks on Procced with Payment");
	
	// wait many second before close the page
	Thread.sleep(3000);
	
	
	//Close the Browser
//	@AfterTest
	public void end{
		
	driver.quit();
	}
	
	}

}
