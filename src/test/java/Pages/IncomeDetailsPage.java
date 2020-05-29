package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IncomeDetailsPage {
    @FindBy(how = How.CSS, using = ".radio-button-container-small:nth-child(1) label")
    public static WebElement main_income_button;

    @FindBy(how = How.CSS, using = "#applicants_0__incomeDetails_employments_0__mainEmploymentStatus-button")
    public static WebElement employment_status_dropdown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Employed')]")
    public static WebElement employment_status_option;

    @FindBy(how = How.XPATH, using = "//section/section/fieldset/div[2]/div/div[2]/input")
    public static WebElement employer_name_text_box;


    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select contract type')]")
    public static WebElement contract_type_dropdown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Permanent')]")
    public static WebElement contract_type_option;


    @FindBy(how = How.XPATH, using = "//div[4]/div[2]/input")
    public static WebElement occupation_text_box;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select type of employment')]")
    public static WebElement employment_type_dropdown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Professional')]")
    public static WebElement employment_type_option;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Day')]")
    public static WebElement Start_day_dropdown;
    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/ul/li[2]")
    public static WebElement Start_day_option;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Month')]")
    public static WebElement Start_month_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'February')]")
    public static WebElement Start_month_option;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Year')]")
    public static WebElement Start_year_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'2015')]")
    public static WebElement Start_year_option;

    @FindBy(how = How.XPATH, using = "//div[3]/div/div[2]/div/input")
    public static WebElement annual_income_text_box;


    @FindBy(how = How.XPATH, using = "//section/div[2]/div[2]/div/input")
    public static WebElement monthly_income_text_box;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'No')]")
    public static WebElement no_other_income_button;

    @FindBy(how = How.XPATH, using = "//input[@id='applicants_0__incomeDetails_anticipatedRetirementAge']")
    public static WebElement retirement_age_text_box;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement Next_button;






    public void click_main_income_button() {
        main_income_button.click();

    }
    public void click_employment_status_dropdown() {
        employment_status_dropdown.click();

    }
    public void click_employment_status_option() {
        employment_status_option.click();

    }
    public void type_employer_name_text_box() {
        employer_name_text_box.sendKeys("NCC");


    }
    public void click_contract_type_dropdown() {
        contract_type_dropdown.click();

    }
    public void click_contract_type_option() {
        contract_type_option.click();

    }

    public void type_occupation_text_box() {
        occupation_text_box.sendKeys("Engineer");


    }
    public void click_employment_type_dropdown() {
        employment_type_dropdown.click();

    }
    public void click_employment_type_option() {
        employment_type_option.click();

    }
    public void click_Start_day_dropdown() {
        Start_day_dropdown.click();

    }
    public void click_Start_day_option() {
        Start_day_option.click();

    }
    public void click_Start_month_dropdown() {
        Start_month_dropdown.click();

    }
    public void click_Start_month_option() {
        Start_month_option.click();

    }
    public void click_Start_year_dropdown() {
        Start_year_dropdown.click();

    }
    public void click_Start_year_option() {
        Start_year_option.click();

    }
    public void type_annual_income_text_box() {
        annual_income_text_box.sendKeys("50000");

    }
    public void type_monthly_income_text_box() {
        monthly_income_text_box.sendKeys("3000");

    }

    public void click_no_other_income_button() {
        no_other_income_button.click();

    }
    public void type_retirement_age_text_box() {
        retirement_age_text_box.sendKeys("70");


    }


    public void click_Next_button() {
        Next_button.click();
    }










































































}
