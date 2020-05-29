package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PropertyDetailsPage {
    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select property type')]")
    public static WebElement property_type_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Detached House')]")
    public static WebElement property_type_option;

    @FindBy(how = How.NAME, using = "propertyDetails.loanAmount")
    public static WebElement loan_amount_text_box;

    @FindBy(how = How.NAME, using = "propertyDetails.propertyValue")
    public static WebElement purchase_price_text_box;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select Source of Deposit')]")
    public static WebElement source_of_deposit_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Savings')]")
    public static WebElement source_of_deposit_option;


    @FindBy(how = How.CSS, using = ".form-row:nth-child(8) .radio-button-container:nth-child(2) label")
    public static WebElement buy_flat_question;

    @FindBy(how = How.CSS, using = ".form-row:nth-child(10) .radio-button-container:nth-child(2) label")
    public static WebElement purchase_scheme_question;


    @FindBy(how = How.CSS, using = ".form-row:nth-child(12) .radio-button-container:nth-child(2) label")
    public static WebElement new_build_question;

    @FindBy(how = How.XPATH, using = "//fieldset[5]/div[2]/div/div[2]/div/label")
    public static WebElement property_wish_question;


    @FindBy(how = How.XPATH, using = "//fieldset[6]/div[2]/div/div[2]/div/label")
    public static WebElement own_property_question;

    @FindBy(how = How.CSS, using = ".button-container-primary > .button")
    public static WebElement next_button;













    public void click_property_type_dropdown() {
        property_type_dropdown.click();
    }
    public void click_property_type_option() {
        property_type_option.click();
    }

    public void type_loan_amount_text_box() {
        loan_amount_text_box.sendKeys("200000");
    }
    public void type_purchase_price_text_box() {
        purchase_price_text_box.sendKeys("300000");
    }
    public void click_source_of_deposit_dropdown() {
        source_of_deposit_dropdown.click();
    }
    public void click_source_of_deposit_option() {
        source_of_deposit_option.click();
    }
    public void click_buy_flat_question() {
        buy_flat_question.click();
    }
    public void click_purchase_scheme_question() {
        purchase_scheme_question.click();
    }
    public void click_new_build_question() {
        new_build_question.click();
    }
    public void click_property_wish_question() {
        property_wish_question.click();
    }
    public void click_own_property_question() {
        own_property_question.click();
    }
    public void click_next_button() {
        next_button.click();
    }
































































}
