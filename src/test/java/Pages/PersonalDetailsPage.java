package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalDetailsPage {

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Yes')]")
    public static WebElement First_time_Buyer_button;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_newtitle-button")
    public static WebElement title_dropdown;
    @FindBy(how = How.ID, using = "ui-id-2")
    public static WebElement title_option;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_forename1")
    public static WebElement First_name_textbox;


    @FindBy(how = How.ID, using = "applicants_0__personalDetails_surname")
    public static WebElement Last_name_textbox;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Male')]")
    public static WebElement gender_button;

    @FindBy(how = How.XPATH, using = "//fieldset[3]/div[2]/div/div[2]/div/label")
    public static WebElement name_change_button;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_dateOfBirth_Day-button")
    public static WebElement dateOfBirth_Day_dropdown;
    @FindBy(how = How.ID, using = "ui-id-20")
    public static WebElement dateOfBirth_Day_option;
    @FindBy(how = How.ID, using = "applicants_0__personalDetails_dateOfBirth_Month-button")
    public static WebElement dateOfBirth_Month_dropdown;
    @FindBy(how = How.ID, using = "ui-id-53")
    public static WebElement dateOfBirth_Month_option;
    @FindBy(how = How.ID, using = "applicants_0__personalDetails_dateOfBirth_Year-button")
    public static WebElement dateOfBirth_Year_dropdown;
    @FindBy(how = How.ID, using = "ui-id-80")
    public static WebElement dateOfBirth_Year_option;



    @FindBy(how = How.ID, using = "applicants_0__personalDetails_maritalStatus-button")
    public static WebElement marital_status_dropdown;
    @FindBy(how = How.ID, using = "ui-id-147")
    public static WebElement marital_status_option;

    @FindBy(how = How.CSS, using = ".radio-button-container-small:nth-child(1) label")
    public static WebElement dependant_button;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_nationality1-button")
    public static WebElement nationality_dropdown;
    @FindBy(how = How.ID, using = "ui-id-169")
    public static WebElement nationality_option;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select country of residence')]")
    public static WebElement country_of_residence_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'United Kingdom')]")
    public static WebElement country_of_residence_option;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_TownCityOfBirth")
    public static WebElement Birth_town_box;

    @FindBy(how = How.ID, using = "applicants_0__personalDetails_CountryOfBirth-button")
    public static WebElement country_of_birth_dropdown;
    @FindBy(how = How.CSS, using = "#ui-id-985")
    public static WebElement country_of_birth_option;


    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select country of tax residence')]")
    public static WebElement country_of_tax_dropdown;
    @FindBy(how = How.ID, using = "ui-id-1225")
    public static WebElement country_of_tax_option;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tsb-form\"]/section/fieldset[7]/div[2]/div/div[2]/div/label")
    public static WebElement US_Citizen_button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tsb-form\"]/section/fieldset[8]/div[2]/div/div[2]/div/label")
    public static WebElement political_exposed_button;


    @FindBy(how = How.XPATH, using = "//button[contains(.,'Next')]")
    public static WebElement Next_button;










    public void click_First_time_Buyer_button() {
        First_time_Buyer_button.click();

    }
    public void click_title_dropdown() {
            title_dropdown.click();

    }
    public void click_title_option() {
        title_option.click();
    }
    public void type_First_name_textbox() {
        First_name_textbox.sendKeys("David");
    }
    public void type_Last_name_textbox() {
        Last_name_textbox.sendKeys("Adams");
    }
    public void click_gender_button() {
        gender_button.click();
    }
    public void click_name_change_button() {
        name_change_button.click();
    }
    public void click_dateOfBirth_Day_dropdown() {
        dateOfBirth_Day_dropdown.click();
    }
    public void click_dateOfBirth_Day_option() {
        dateOfBirth_Day_option.click();
    }
    public void click_dateOfBirth_Month_dropdown() {
        dateOfBirth_Month_dropdown.click();
    }
    public void click_dateOfBirth_Month_option() {
        dateOfBirth_Month_option.click();
    }
    public void click_dateOfBirth_Year_dropdown() {
        dateOfBirth_Year_dropdown.click();
    }
    public void click_dateOfBirth_Year_option() {
        dateOfBirth_Year_option.click();
    }
    public void click_marital_status_dropdown() {
        marital_status_dropdown.click();
    }
    public void click_marital_status_option(){
        marital_status_option.click();
    }
    public void click_dependant_button(){
        dependant_button.click();
    }
    public void click_nationality_dropdown(){
        nationality_dropdown.click();
    }
    public void click_nationality_option(){
        nationality_option.click();
    }
    public void click_country_of_residence_dropdown(){
        country_of_residence_dropdown.click();
    }
    public void click_country_of_residence_option(){
        country_of_residence_option.click();
    }
    public void type_Birth_town_box() {
        Birth_town_box.sendKeys("London");
    }
    public void click_country_of_birth_dropdown(){
        country_of_birth_dropdown.click();
    }
    public void click_country_of_birth_option(){
        country_of_birth_option.click();
    }
    public void click_country_of_tax_dropdown(){
        country_of_tax_dropdown.click();
    }
    public void click_country_of_tax_option (){
        country_of_tax_option.click();
    }
    public void click_US_Citizen_button (){
        US_Citizen_button.click();
    }
    public void click_political_exposed_button () {
        political_exposed_button.click();
    }
    public void click_Next_button () {
        Next_button.click();
    }












}





























