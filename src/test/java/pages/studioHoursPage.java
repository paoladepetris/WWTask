package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class studioHoursPage {
    WebDriver driver ;

public studioHoursPage() {
    driver = Driver.getInstance().getDriver();
    PageFactory.initElements(driver, this);
}
    @FindBy(id = "location-search")
    public WebElement locationSearch;

    @FindBy(className = "linkUnderline-1_h4g")
    public WebElement firstLocationOption;

    @FindBy(className = "distance-OhP63")
    public WebElement distanceFirstLocation;

    @FindBy(className = "locationName-1jro_")
    public WebElement firstSearchResult;

    @FindBy(className = "title-3o8Pv")
    public WebElement businessHoursButton;

    @FindBy(className = "day-CZkDC")
    public List<WebElement> listBusinessHours;

}
