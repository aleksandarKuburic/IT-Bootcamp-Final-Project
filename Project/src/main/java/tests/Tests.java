package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest{

    @Test (priority = 1)
    public void testTextBoxSubmission() throws InterruptedException {
        getHomePage().clickElementsSection();
        getElementsPage().clickTextBox();
        getTextBoxPage().fillOutTextBoxFormAndSubmit
                ("Makarena", "makarena@makarena.com", "Makarena","Makarena");
        Assert.assertEquals(getTextBoxPage().getExpectedSubmitMsg(), getTextBoxPage().confirmationMsgText());
    }

    @Test (priority = 2)
    public void testCheckBoxForNotes() {
        getHomePage().clickElementsSection();
        getElementsPage().clickCheckBox();
        getCheckBoxPage().clickPlusButton();
        getCheckBoxPage().clickNotesButton();
        Assert.assertEquals(getCheckBoxPage().getResultText(), getCheckBoxPage().getExpectedResultTextForNotes());
    }

    @Test (priority = 3)
    public void testCheckBoxForDesktop() {
        getHomePage().clickElementsSection();
        getElementsPage().clickCheckBox();
        getCheckBoxPage().clickPlusButton();
        getCheckBoxPage().clickDesktopButton();
        Assert.assertEquals(getCheckBoxPage().getResultText(), getCheckBoxPage().getExpectedResultTextForDesktop());
    }

    /*
     Test that is meant to fail and a basis for a bug report.
     */
    @Test(priority = 4)
    public void testNoRadioButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickRadioButton();
        Assert.assertTrue(getRadioButtonPage().checkIfNoButtonIsDisplayed());
        Assert.assertTrue(getRadioButtonPage().checkIfNoButtonIsEnabled());
    }

    @Test(priority = 5)
    public void testYesRadioButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickRadioButton();
        getRadioButtonPage().clickYesButton();
        Assert.assertEquals(getRadioButtonPage().getExpectedMsgYesButton(),getRadioButtonPage().confirmationMsgText());
        Assert.assertTrue(getRadioButtonPage().checkIfYesButtonSelected());
        Assert.assertFalse(getRadioButtonPage().checkIfImpressiveButtonSelected());
    }

    @Test(priority = 6)
    public void testImpressiveRadioButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickRadioButton();
        getRadioButtonPage().clickImpressiveButton();
        Assert.assertEquals(getRadioButtonPage().getExpectedMsgImpressiveButton(), getRadioButtonPage().confirmationMsgText());
        Assert.assertTrue(getRadioButtonPage().checkIfImpressiveButtonSelected());
        Assert.assertFalse(getRadioButtonPage().checkIfYesButtonSelected());
    }

    @Test (priority = 7)
    public void testWebTablesAddButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickWebTables();
        getWebTablesPage().clickAddButton();
        getWebTablesPage().fillInformationForm
                ("Makarena", "Makarena", "makarena@makarena.com","42","70000","Lambada");
        Assert.assertEquals(getWebTablesPage().getAddedPersonInformation(), getWebTablesPage().getExpectedAddedPersonInfo());
    }

    @Test(priority = 8)
    public void testWebTablesDeleteButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickWebTables();
        Assert.assertEquals(getWebTablesPage().getExpectedThirdRowInformationBeforeChange(),
                getWebTablesPage().getThirdRowInformation());
        getWebTablesPage().clickDeleteButton3();
        Assert.assertEquals("       ", getWebTablesPage().getThirdRowInformation());
    }

    @Test(priority = 9)
    public void testWebTablesEditButton() {
        getHomePage().clickElementsSection();
        getElementsPage().clickWebTables();
        Assert.assertEquals(getWebTablesPage().getExpectedThirdRowInformationBeforeChange(),
                getWebTablesPage().getThirdRowInformation());
        getWebTablesPage().clickEditButton3();
        getWebTablesPage().editDataInInformationForm
                ("Makarena", "Makarena", "makarena@makarena.com","42","70000","Lambada");
        Assert.assertEquals(getWebTablesPage().getThirdRowInformation(), getWebTablesPage().getExpectedAddedPersonInfo());
    }

    @Test (priority = 10)
    public void testButtons() {
        getHomePage().clickElementsSection();
        getElementsPage().clickButtons();
        getButtonsPage().clickSingleClickButton();
        getButtonsPage().clickDoubleClickButtonTwice();
        getButtonsPage().rightClickRightClickButton();
        Assert.assertEquals(getButtonsPage().msgForSingleClickButtonText(),getButtonsPage().getExpectedMsgForSingleClickButton());
        Assert.assertEquals(getButtonsPage().msgForDoubleClickButtonText(),getButtonsPage().getExpectedMsgForDoubleClickButton());
        Assert.assertEquals(getButtonsPage().msgForRightClickButtonText(), getButtonsPage().getExpectedMsgForRightClickButton());

    }
}
