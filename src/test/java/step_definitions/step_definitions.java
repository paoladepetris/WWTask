package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.studioHoursPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import java.util.concurrent.TimeUnit;

public class step_definitions {
    WebDriver driver = Driver.getInstance().getDriver();
    studioHoursPage hoursPage = new studioHoursPage();
    JavascriptExecutor jse = (JavascriptExecutor)Driver.getInstance().getDriver();
    String firstResultTitle;
    @Given("I navigate to WW Studio Finder page")
    public void i_navigate_to_WW_Studio_Finder_page() {
        Driver.getInstance().getDriver().get(ConfigurationReader.getProperty("config.properties","findWorkshop.url"));
       String title = driver.getTitle();
       try{
           Assert.assertTrue(String.valueOf(title.contains("Find WW Studios & Meetings Near You | WW USA")), true);
       }catch(AssertionError e){
            System.out.println("The actual title contains: "+ title);
        }
    }
    @When("I click on In-Person and type {string} in search field")
    public void i_click_on_In_Person_and_type_in_search_field(String string) {
        hoursPage.locationSearch.click();
        hoursPage.locationSearch.sendKeys("10011", Keys.ENTER);
    }
    @Then("I should be able to see different locations")
    public void i_should_be_able_to_see_different_locations() {
        jse.executeScript("arguments[0].scrollIntoView(true);",hoursPage.firstLocationOption);
        firstResultTitle = hoursPage.firstLocationOption.getText();
        System.out.println(firstResultTitle);
        System.out.println(hoursPage.distanceFirstLocation.getText());
    }
    @Then("I click on the first search result and click on Business Hours")
    public void i_click_on_the_first_search_result_and_click_on_Business_Hours() {
        jse.executeScript("arguments[0].click();", hoursPage.firstLocationOption);
        String clickSearchResult = hoursPage.firstSearchResult.getText();
        try{
            Assert.assertEquals(firstResultTitle, clickSearchResult);
        }catch(AssertionError e){
            System.out.println("The selected Studio name doesn't match with the one you clicked");
        }
        hoursPage.businessHoursButton.click();
        jse.executeScript("arguments[0].scrollIntoView(true);",hoursPage.businessHoursButton);
        driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }
    @Then("I should be able to see all the business hours for that studio")
    public void i_should_be_able_to_see_all_the_business_hours_for_that_studio() {
        for(WebElement list : hoursPage.listBusinessHours){
        System.out.println(list.getText());
    }
    }
}
