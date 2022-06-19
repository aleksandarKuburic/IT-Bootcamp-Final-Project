package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage{

    // Locators for elements

    private By fullName = By.id("userName");
    private By eMail = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");

    private By confirmationMsg = By.xpath("//*[@id=\"output\"]/div");

    private String expectedSubmitMsg = "Name:Makarena\n" +
            "Email:makarena@makarena.com\n" +
            "Current Address :Makarena\n" +
            "Permananet Address :Makarena";

    public TextBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);

    }

    // Getters for elements
    public WebElement getfullName(){
        return getDriver().findElement(fullName);
    }
    public WebElement getEMail(){
        return getDriver().findElement(eMail);
    }
    public WebElement getCurrentAddress(){
        return getDriver().findElement(currentAddress);
    }
    public WebElement getPermanentAddress(){
        return getDriver().findElement(permanentAddress);
    }
    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }


    public void clickSubmitButton(){
        getSubmitButton().click();
    }


    // confirmation msgs
    public WebElement getConfirmationMsg(){
        return getDriver().findElement(confirmationMsg);
    }
    public String confirmationMsgText(){
        return getConfirmationMsg().getText();
    }

    public String getExpectedSubmitMsg(){
        return expectedSubmitMsg;
    }


    /**
     * Filling out fields of Text box card
     * @param fullName
     * @param eMail
     * @param currentAddress
     * @param permanentAddress
     */
    public void fillOutTextBoxFormAndSubmit(String fullName, String eMail, String currentAddress, String permanentAddress){
        getfullName().sendKeys(fullName);
        getEMail().sendKeys(eMail);
        getCurrentAddress().sendKeys(currentAddress);
        getPermanentAddress().sendKeys(permanentAddress);
        clickSubmitButton();
    }


}
