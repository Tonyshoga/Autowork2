package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MortgagePromisePage {

    @FindBy(how = How.ID, using = "applicationDetails_applicationType-button")
    public static WebElement applicationType_button;
    @FindBy(how = How.ID, using = "ui-id-2")
    public static WebElement applicationType_option;


    @FindBy(how = How.XPATH, using = "//label[contains(.,'One (sole applicant)')]")
    public static WebElement Sole_applicant_question;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Yes')]")
    public static WebElement age_question;

    @FindBy(how = How.XPATH, using = "//fieldset[3]/div[2]/div/div/div/label")
    public static WebElement resident_question;


    @FindBy(how = How.XPATH, using = "//fieldset[4]/div[2]/div/div/div/label")
    public static WebElement main_resident_question;


    @FindBy(how = How.XPATH, using = "//fieldset[5]/div[2]/div/div/div/label")
    public static WebElement income_question;


    @FindBy(how = How.CSS, using = ".form-row:nth-child(11) .radio-button-container:nth-child(2) label")
    public static WebElement arrears_question;

    @FindBy(how = How.CSS, using = ".form-row:nth-child(12) .radio-button-container:nth-child(2) label")
    public static WebElement ccj_question;


    @FindBy(how = How.CSS, using = ".form-row:nth-child(13) .radio-button-container:nth-child(2) label")
    public static WebElement bankrupcy_question;

    @FindBy(how = How.CSS, using = ".form-row:nth-child(14) .radio-button-container:nth-child(2) label")
    public static WebElement IO_question;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div[2]/div/button")
    public static WebElement Continue_button_option;



    public void click_applicationType_button() {
        applicationType_button.click();

    }
    public void click_applicationType_option() {
        applicationType_option.click();

    }
    public void click_Sole_applicant_question() {
        Sole_applicant_question.click();
    }
    public void click_age_question() {
        age_question.click();
    }
    public void click_resident_question() {
        resident_question.click();
    }
    public void click_main_resident_question() {
        main_resident_question.click();
    }

    public void click_income_question() {
        income_question.click();
    }

    public void click_arrears_question() {
        arrears_question.click();
    }

    public void click_ccj_question() {
        ccj_question.click();
    }
    public void click_bankrupcy_question() {
        bankrupcy_question.click();
    }
    public void click_IO_question() {
        IO_question.click();
    }
    public void click_Continue_button_option() {
        Continue_button_option.click();
    }






























}
