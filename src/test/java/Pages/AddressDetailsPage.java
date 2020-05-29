package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressDetailsPage {

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select residential status')]")
    public static WebElement resident_status_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Renting')]")
    public static WebElement resident_status_option;

    @FindBy(how = How.ID, using = "applicants_0__addressDetails_currentAddress_address_SearchPostCode")
    public static WebElement address_details_search_box;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Find address')]")
    public static WebElement find_address_button;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Please select from the list below')]")
    public static WebElement address_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'2 The Stockyards, GLOUCESTER GL1 2AL')]")
    public static WebElement address_option;

    @FindBy(how = How.ID, using = "applicants_0__addressDetails_currentAddress_dateMovedToAddress_Day-button")
    public static WebElement dateMovedToAddress_Day_button;
    @FindBy(how = How.ID, using = "ui-id-38")
    public static WebElement dateMovedToAddress_Day_option;
    @FindBy(how = How.ID, using = "applicants_0__addressDetails_currentAddress_dateMovedToAddress_Month-button")
    public static WebElement dateMovedToAddress_Month_button;
    @FindBy(how = How.ID, using = "ui-id-77")
    public static WebElement dateMovedToAddress_Month_option;
    @FindBy(how = How.ID, using = "applicants_0__addressDetails_currentAddress_dateMovedToAddress_Year-button")
    public static WebElement dateMovedToAddress_Year_button;
    @FindBy(how = How.ID, using = "ui-id-88")
    public static WebElement dateMovedToAddress_Year_option;



    @FindBy(how = How.ID, using = "applicants_0__addressDetails_telephone")
    public static WebElement telephone_text_box;


    @FindBy(how = How.ID, using = "applicants_0__addressDetails_email")
    public static WebElement email_text_box;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Yes')]")
    public static WebElement post_question_button ;

    @FindBy(how = How.XPATH, using = "//fieldset[2]/div[2]/div/div/div/label")
    public static WebElement email_question_button ;

    @FindBy(how = How.XPATH, using = "//fieldset[3]/div[2]/div/div/div/label")
    public static WebElement text_question_button ;


    @FindBy(how = How.XPATH, using = "//fieldset[4]/div[2]/div/div/div/label")
    public static WebElement phone_question_button;


    @FindBy(how = How.CSS, using = ".button-container-primary > .button")
    public static WebElement next_option_button;





    public void click_resident_status_dropdown() {
        resident_status_dropdown.click();

    }

    public void click_resident_status_option() {
        resident_status_option.click();
    }
    public void type_address_details_search_box() {
        address_details_search_box.sendKeys("GL1 2AL");
    }
    public void click_find_address_button() {
        find_address_button.click();
    }
    public void click_address_dropdown() {
        address_dropdown.click();
    }
    public void click_address_option() {
        address_option.click();
    }
    public void click_dateMovedToAddress_Day_button() {
        dateMovedToAddress_Day_button.click();
    }
    public void click_dateMovedToAddress_Day_option() {
        dateMovedToAddress_Day_option.click();
    }
    public void click_dateMovedToAddress_Month_button() {
        dateMovedToAddress_Month_button.click();
    }
    public void click_dateMovedToAddress_Month_option() {
        dateMovedToAddress_Month_option.click();
    }
    public void click_dateMovedToAddress_Year_button() {
        dateMovedToAddress_Year_button.click();
    }

    public void click_dateMovedToAddress_Year_option() {
        dateMovedToAddress_Year_option.click();
    }
    public void type_telephone_text_box() {
        telephone_text_box.sendKeys("07832736453");
    }
    public void type_email_text_box() {
        email_text_box.sendKeys("james@aol.com");

    }

    public void click_post_question_button () {
        post_question_button .click();

    }
    public void click_email_question_button () {
        email_question_button .click();

    }

    public void click_text_question_button () {
        text_question_button .click();

    }
    public void click_phone_question_button () {
        phone_question_button .click();

    }

    public void click_next_option_button () {
        next_option_button.click();

    }
















































}
