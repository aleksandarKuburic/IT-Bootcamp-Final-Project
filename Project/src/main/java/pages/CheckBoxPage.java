package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends BasePage{

    private By plusButton = By.className("rct-option-expand-all");

    private By desktopButton = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");
    private By notesButton = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]");
    // //*[@id="tree-node"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]- JESTE, cela linija te opcije
    private By result = By.id("result");
    private String expectedResultTextForNotes = "You have selected :\n" +
            "notes";
    private String expectedResultTextForDesktop = "You have selected :\n" +
            "desktop\n" +
            "notes\n" +
            "commands";

    public CheckBoxPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getPlusButton(){
        return getDriver().findElement(plusButton);
    }
    public void clickPlusButton(){
        getPlusButton().click();
    }

    public WebElement getDesktopButton(){
        return getDriver().findElement(desktopButton);
    }
    public void clickDesktopButton(){
        getDesktopButton().click();
    }

    public WebElement getNotesButton(){
        return getDriver().findElement(notesButton);
    }
    public void clickNotesButton(){
        getNotesButton().click();
    }

    public WebElement getResult(){
        return getDriver().findElement(result);
    }

    public String getResultText(){
        return getResult().getText();
    }
    public String getExpectedResultTextForNotes(){
        return expectedResultTextForNotes;
    }
    public String getExpectedResultTextForDesktop(){
        return expectedResultTextForDesktop;
    }
}
