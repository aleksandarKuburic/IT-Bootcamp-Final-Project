package tests;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait driverWait;
     private Actions actions;

    private HomePage homePage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private CheckBoxPage checkBoxPage;
    private RadioButtonPage radioButtonPage;
    private WebTablesPage webTablesPage;
    private ButtonsPage buttonsPage;


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Andromeda\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        actions = new Actions(driver);

        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.navigate().to("https://demoqa.com/");
        driver.manage().window().maximize();

        this.homePage = new HomePage(driver,driverWait, actions);
        this.elementsPage = new ElementsPage(driver,driverWait,actions);
        this.textBoxPage = new TextBoxPage(driver,driverWait,actions);
        this.checkBoxPage = new CheckBoxPage(driver,driverWait,actions);
        this.radioButtonPage = new RadioButtonPage(driver,driverWait,actions);
        this.webTablesPage = new WebTablesPage(driver,driverWait,actions);
        this.buttonsPage = new ButtonsPage(driver,driverWait,actions);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }

    public HomePage getHomePage(){
        return homePage;
    }
    public ElementsPage getElementsPage(){
        return elementsPage;
    }
    public TextBoxPage getTextBoxPage(){
        return textBoxPage;
    }
    public CheckBoxPage getCheckBoxPage(){
        return checkBoxPage;
    }
    public RadioButtonPage getRadioButtonPage(){
        return radioButtonPage;
    }
    public ButtonsPage getButtonsPage(){
        return buttonsPage;
    }
    public WebTablesPage getWebTablesPage(){
        return webTablesPage;
    }


}
