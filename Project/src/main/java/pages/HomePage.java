package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private By elementsSection = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div");

    public HomePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }



    public WebElement getElementsSection (){
        return  getDriver().findElement(elementsSection);
    }
    public void clickElementsSection(){
        getActions().moveToElement(getElementsSection()).click().perform();
    }
}
