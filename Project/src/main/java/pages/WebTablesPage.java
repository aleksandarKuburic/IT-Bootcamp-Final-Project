package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage extends BasePage{

    private By addButton = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By eMail = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By department = By.id("department");
    private By submitButton = By.cssSelector("button[id='submit']");
   // private By tableSize = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]");
    private By addedPerson = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]");
    private String expectedAddedPersonInfo = "Makarena\n" +
            "Makarena\n" +
            "42\n" +
            "makarena@makarena.com\n" +
            "70000\n" +
            "Lambada";

    private By deleteButton3 = By.xpath("//*[@id=\"delete-record-3\"]");
    private By thirdRow = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]");
    private String expectedThirdRowInformationBeforeChange = "Kierra\n" +
            "Gentry\n" +
            "29\n" +
            "kierra@example.com\n" +
            "2000\n" +
            "Legal";
    private By editButton3 = By.xpath("//*[@id=\"edit-record-3\"]");




    public WebTablesPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }


    public WebElement getAddButton(){
        return getDriver().findElement(addButton);
    }
    public void clickAddButton(){
        getAddButton().click();
    }


    public WebElement getFirstName() {
        return getDriver().findElement(firstName);
    }
    public WebElement getLastName(){
        return  getDriver().findElement(lastName);
    }
    public WebElement getEMail(){
        return getDriver().findElement(eMail);
    }
    public WebElement getAge(){
        return getDriver().findElement(age);
    }
    public WebElement getSalary(){
        return getDriver().findElement(salary);
    }
    public WebElement getDepartment(){
        return getDriver().findElement(department);
    }
    public WebElement getSubmitButton(){
        return getDriver().findElement(submitButton);
    }
    public void clickSubmitButton(){
        getSubmitButton().click();
    }

    /**
     * send parameters for adding an entry
     * @param firstName
     * @param lastName
     * @param eMail
     * @param age
     * @param salary
     * @param department
     */
    public void fillInformationForm(String firstName, String lastName, String eMail, String age, String salary, String department){
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getEMail().sendKeys(eMail);
        getAge().sendKeys(age);
        getSalary().sendKeys(salary);
        getDepartment().sendKeys(department);
        clickSubmitButton();
    }

    public WebElement getAddedPerson(){
        return getDriver().findElement(addedPerson);
    }
    public String getAddedPersonInformation(){
        return getAddedPerson().getText();
    }
    public String getExpectedAddedPersonInfo(){
        return expectedAddedPersonInfo;
    }


    public WebElement getDeleteButton3(){
        return getDriver().findElement(deleteButton3);
    }
    public void clickDeleteButton3(){
        getDeleteButton3().click();
    }
    public WebElement getThirdRow(){
        return getDriver().findElement(thirdRow);
    }
    public String getThirdRowInformation(){
        return getThirdRow().getText();
    }
    public String getExpectedThirdRowInformationBeforeChange(){
        return expectedThirdRowInformationBeforeChange;
    }
    public WebElement getEditButton3(){
        return getDriver().findElement(editButton3);
    }
    public void clickEditButton3(){
        getEditButton3().click();
    }

    /**
     * clear present data and input new data to an existing entry
     * @param firstName
     * @param lastName
     * @param eMail
     * @param age
     * @param salary
     * @param department
     */
    public void editDataInInformationForm(String firstName, String lastName, String eMail, String age, String salary, String department){
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
        getLastName().clear();
        getLastName().sendKeys(lastName);
        getEMail().clear();
        getEMail().sendKeys(eMail);
        getAge().clear();
        getAge().sendKeys(age);
        getSalary().clear();
        getSalary().sendKeys(salary);
        getDepartment().clear();
        getDepartment().sendKeys(department);
        clickSubmitButton();

    }

}
