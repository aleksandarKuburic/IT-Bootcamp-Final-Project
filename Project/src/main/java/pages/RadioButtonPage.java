package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{

    private By noButton = By.xpath("//*[@id=\"noRadio\"]");
    private By noButtonSection = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]");

    private By yesButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    // //*[@id="app"]/div/div/div[2]/div[2]/div[2]/div[2] - nije
    private By yesButtonChecker = By.xpath("//*[@id=\"yesRadio\"]");

    private By impressiveButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By impressiveButtonChecker = By.xpath("//*[@id=\"impressiveRadio\"]");
    private By confirmationMsg = By.className("mt-3");
    private String expectedMsgYesButton = "You have selected Yes";
    private String expectedMsgImpressiveButton = "You have selected Impressive";

    public RadioButtonPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }


    // No button
    public WebElement getNoButton(){
        return getDriver().findElement(noButton);
    }
    public WebElement getNoButtonSection(){
        return getDriver().findElement(noButtonSection);
    }
    public boolean checkIfNoButtonIsDisplayed(){
        return getNoButtonSection().isDisplayed();
    }
    public boolean checkIfNoButtonIsEnabled(){
        return getNoButton().isEnabled();
    }



    // Yes button
    public WebElement getYesButton(){
        return getDriver().findElement(yesButton);
    }
    public void clickYesButton(){
        getYesButton().click();
    }
    public WebElement getYesButtonChecker(){
        return getDriver().findElement(yesButtonChecker);
    }
    public boolean checkIfYesButtonSelected(){
        return getYesButtonChecker().isSelected();
    }


    // Impressive button
    public WebElement getImpressiveButton(){
        return getDriver().findElement(impressiveButton);
    }
    public void clickImpressiveButton(){
        getImpressiveButton().click();
    }
    public WebElement getImpressiveButtonChecker(){
        return getDriver().findElement(impressiveButtonChecker);
    }
    public boolean checkIfImpressiveButtonSelected(){
        return getImpressiveButtonChecker().isSelected();
    }


    // Confirmation msgs
    public WebElement getConfirmationMsg(){
        return getDriver().findElement(confirmationMsg);
    }
    public String confirmationMsgText(){
        return getConfirmationMsg().getText();
    }

    public String getExpectedMsgYesButton(){
        return expectedMsgYesButton;
    }
    public String getExpectedMsgImpressiveButton(){
        return expectedMsgImpressiveButton;
    }
}
