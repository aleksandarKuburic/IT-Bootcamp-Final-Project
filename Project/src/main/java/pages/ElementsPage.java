package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class ElementsPage extends BasePage {

    private By textBox = By.id("item-0");
    private By checkBox = By.id("item-1");
    private By radioButton = By.id("item-2");
    private By webTables = By.id("item-3");
    private By buttons = By.id("item-4");


    public ElementsPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getTextBox (){
        return getDriver().findElement(textBox);
    }
    public void clickTextBox(){
        getActions().moveToElement(getTextBox()).click().perform();
    }

    public WebElement getCheckBox(){
        return getDriver().findElement(checkBox);
    }
    public void clickCheckBox(){
        getActions().moveToElement(getCheckBox()).click().perform();
    }

    public WebElement getRadioButton(){
        return getDriver().findElement(radioButton);
    }
    public void clickRadioButton(){
        getActions().moveToElement(getRadioButton()).click().perform();
    }

    public WebElement getButtons(){
        return getDriver().findElement(buttons);
    }
    public void clickButtons(){
        getActions().moveToElement(getButtons()).click().perform();
    }

    public WebElement getWebTables(){
        return getDriver().findElement(webTables);
    }
    public void clickWebTables(){
        getActions().moveToElement(getWebTables()).click().perform();
    }

}
