package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

// "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]" - za alert stranicu

public class ButtonsPage extends BasePage{

    // Locators for buttons
    private By doubleClickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[1]/button");
    private By rightClickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/button");
    private By singleClickButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/button");

    // single click button msg
    private By msgForSingleClickButton = By.xpath("//*[@id=\"dynamicClickMessage\"]");
    private String expectedMsgForSingleClickButton = "You have done a dynamic click";

    // double click msg
    private By msgForDoubleClickButton = By.xpath("//*[@id=\"doubleClickMessage\"]");
    private String expectedMsgForDoubleClickButton = "You have done a double click";

    // right click msg
    private By msgForRightClickButton = By.xpath("//*[@id=\"rightClickMessage\"]");
    private String expectedMsgForRightClickButton = "You have done a right click";

    public ButtonsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    // double click element and click
    public WebElement getDoubleClickButton(){
        return getDriver().findElement(doubleClickButton);
    }
    public void clickDoubleClickButtonTwice(){
        getActions().doubleClick(getDoubleClickButton()).perform();
    }

    // right click element and click
    public WebElement getRightClickButton(){
        return getDriver().findElement(rightClickButton);
    }
    public void rightClickRightClickButton(){
        getActions().contextClick(getRightClickButton()).perform();
    }

    // single click element and click
    public WebElement getSingleClickButton(){
        return getDriver().findElement(singleClickButton);
    }
    public void clickSingleClickButton(){
        getSingleClickButton().click();
    }


    // single click msgs
    public WebElement getMsgForSingleClickButton(){
        return getDriver().findElement(msgForSingleClickButton);
    }
    public String msgForSingleClickButtonText(){
        return getMsgForSingleClickButton().getText();
    }
    public String getExpectedMsgForSingleClickButton(){
        return expectedMsgForSingleClickButton;
    }

    // double click msgs
    public WebElement getMsgForDoubleClickButton(){
        return getDriver().findElement(msgForDoubleClickButton);}
    public String msgForDoubleClickButtonText(){
        return getMsgForDoubleClickButton().getText();
    }
    public String getExpectedMsgForDoubleClickButton(){
        return expectedMsgForDoubleClickButton;
    }

    // right click msgs
    public WebElement getMsgForRightClickButton(){
        return getDriver().findElement(msgForRightClickButton);
    }
    public String msgForRightClickButtonText(){
        return getMsgForRightClickButton().getText();
    }
    public String getExpectedMsgForRightClickButton(){
        return expectedMsgForRightClickButton;
    }
}
