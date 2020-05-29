package TSBMortagage;


import Pages.*;
import base.testbase;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import java.io.IOException;

public class StepDefinations extends testbase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage() throws Throwable {
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }



    @Given("^I click on the Firstime buyer link$")
    public void i_click_on_the_Firstime_buyer_link() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.click_First_time_buyer_button();

    }

    @Given("^I click on get a mortagage promise button$")
    public void i_click_on_get_a_mortagage_promise_button() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.click_mortgage_promise_button();


    }

    @When("^I click on continue button$")
    public void i_click_on_continue_button() throws Throwable {
        HelpSupportPage helpSupportPage = PageFactory.initElements(driver,HelpSupportPage.class);
        helpSupportPage.click_Continue_button();


    }





    @When("^I select Buy a home from application type dropdown$")
    public void i_select_Buy_a_home_from_application_type_dropdown() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_applicationType_button();

        mortgagePromisePage = PageFactory.initElements(driver, MortgagePromisePage.class);
        mortgagePromisePage.click_applicationType_option();
        Thread.sleep(3000);

    }

    @Then("^I click  a sole applicant$")
    public void i_click_a_sole_applicant() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_Sole_applicant_question();


    }

    @Then("^I click yes on Age question$")
    public void i_click_yes_on_Age_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_age_question();



    }

    @Then("^I click yes on resident question$")
    public void i_click_yes_on_resident_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_resident_question();

    }

    @Then("^I click yes on main residence question$")
    public void i_click_yes_on_main_residence_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_main_resident_question();


    }

    @Then("^I click  yes on the income question$")
    public void i_click_yes_on_the_income_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_income_question();

    }

    @Then("^I click no the arrears question$")
    public void i_click_no_the_arrears_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_arrears_question();
    }

    @Then("^I click  no on the CCJ question$")
    public void i_click_no_on_the_CCJ_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_ccj_question();

    }

    @Then("^I click no on the bankruptcy question$")
    public void i_click_no_on_the_bankruptcy_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_bankrupcy_question();

    }

    @Then("^I click no on the IO question$")
    public void i_click_no_on_the_IO_question() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_IO_question();
    }

    @Then("^i click on continue option$")
    public void i_click_on_continue_option() throws Throwable {
        MortgagePromisePage mortgagePromisePage = PageFactory.initElements(driver,MortgagePromisePage.class);
        mortgagePromisePage.click_Continue_button_option();

    }


    @Given("^I tick the disclosure radio button$")
    public void i_tick_the_disclosure_radio_button() throws Throwable {
        DisclosurePage disclosurePage = PageFactory.initElements(driver,DisclosurePage.class);
       disclosurePage.click_disclosure_radio_button();

    }

    @Given("^I click on the continue button$")
    public void i_click_on_the_continue_button() throws Throwable {
        DisclosurePage disclosurePage = PageFactory.initElements(driver,DisclosurePage.class);
        disclosurePage.click_continue_button();

    }

    @Given("^I click yes on first time buyer question$")
    public void i_click_yes_on_first_time_buyer_question() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_First_time_Buyer_button();

    }

    @Given("^I select a title from the dropdown menu$")
    public void i_select_a_title_from_the_dropdown_menu() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_title_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_title_option();

    }

    @Given("^I enter a Fist name$")
    public void i_enter_a_Fist_name() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.type_First_name_textbox();


    }

    @Given("^I enter a last name\\?$")
    public void i_enter_a_last_name() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.type_Last_name_textbox();

    }

    @Then("^I click on the male gender button$")
    public void i_click_on_the_male_gender_button() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_gender_button();


    }

    @Then("^I click no on the name change button$")
    public void i_click_no_on_the_name_change_button() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_name_change_button();
    }

    @Then("^I enter a DOB$")
    public void i_enter_a_DOB() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Day_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Day_option();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Month_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Month_option();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Year_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_dateOfBirth_Year_option();


    }

    @Then("^i select single from the marital status dropdown$")
    public void i_select_single_from_the_marital_status_dropdown() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_marital_status_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_marital_status_option();

    }

    @Then("^I click a number of dependant$")
    public void i_click_a_number_of_dependant() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_dependant_button();
    }

    @Then("^I select  a nationality from dropdown$")
    public void i_select_a_nationality_from_dropdown() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_nationality_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_nationality_option();


    }

    @Then("^I select a country of residence$")
    public void i_select_a_country_of_residence() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_residence_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_residence_option();
    }

    @Then("^I enter my city of birth$")
    public void i_enter_my_city_of_birth() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.type_Birth_town_box();
    }

    @Then("^I select a country of birth from dropdown$")
    public void i_select_a_country_of_birth_from_dropdown() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_birth_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_birth_option();

    }

    @Then("^I select a country of tax residence  from dropdown$")
    public void i_select_a_country_of_tax_residence_from_dropdown() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_tax_dropdown();
        personalDetailsPage = PageFactory.initElements(driver, PersonalDetailsPage.class);
        personalDetailsPage.click_country_of_tax_option();
    }

    @Then("^I click No on US Citizen question$")
    public void i_click_No_on_US_Citizen_question() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_US_Citizen_button();

    }

    @Then("^I click No on Politically exposed person$")
    public void i_click_No_on_Politically_exposed_person() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_political_exposed_button();
    }

    @Then("^I click on next button$")
    public void i_click_on_next_button() throws Throwable {
        PersonalDetailsPage personalDetailsPage = PageFactory.initElements(driver,PersonalDetailsPage.class);
        personalDetailsPage.click_Next_button();
    }

//ADDRESS DETAILS PAGE

    @Given("^I select a residential status$")
    public void i_select_a_residential_status() throws Throwable {
      AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
      addressDetailsPage.click_resident_status_dropdown();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_resident_status_option();

    }

    @Given("^I enter a postcode$")
    public void i_enter_a_postcode() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.type_address_details_search_box();

    }

    @Given("^I click on find address button$")
    public void i_click_on_find_address_button() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_find_address_button();
        Thread.sleep(3000);
    }


    @Given("^I click on address dropdown to select address$")
    public void i_click_on_address_dropdown_to_select_address() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_address_dropdown();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_address_option();

    }

    @Given("^I enter a date moved$")
    public void i_enter_a_date_moved() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Day_button();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Day_option();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Month_button();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Month_option();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Year_button();
        addressDetailsPage = PageFactory.initElements(driver, AddressDetailsPage.class);
        addressDetailsPage.click_dateMovedToAddress_Year_option();



    }

    @Then("^I enter a telephone number$")
    public void i_enter_a_telephone_number() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.type_telephone_text_box();
    }

    @Then("^I enter a preferred email address$")
    public void i_enter_a_preferred_email_address() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.type_email_text_box();
    }

    @Then("^I click on No to post question$")
    public void i_click_on_No_to_post_question() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_post_question_button();

    }

    @Then("^I click on yes to email question$")
    public void i_click_on_yes_to_email_question() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_email_question_button();

    }

    @Then("^I click on No to text question$")
    public void i_click_on_No_to_text_question() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_text_question_button();
    }

    @Then("^I click on yes to phone  question$")
    public void i_click_on_yes_to_phone_question() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_phone_question_button();
    }

    @Then("^I click on next option$")
    public void i_click_on_next_option() throws Throwable {
        AddressDetailsPage addressDetailsPage = PageFactory.initElements(driver,AddressDetailsPage.class);
        addressDetailsPage.click_next_option_button();


    }
//PROPERTY DETAILS PAGE


    @Given("^I select property type$")
    public void i_select_property_type() throws Throwable {
     PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
     propertyDetailsPage.click_property_type_dropdown();
        propertyDetailsPage = PageFactory.initElements(driver, PropertyDetailsPage.class);
        propertyDetailsPage.click_property_type_option();

    }

    @Given("^i enter a loan amount$")
    public void i_enter_a_loan_amount() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.type_loan_amount_text_box();
    }

    @Given("^I enter a purchase price$")
    public void i_enter_a_purchase_price() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.type_purchase_price_text_box();


    }

    @Then("^I enter a source of deposit$")
    public void i_enter_a_source_of_deposit() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_source_of_deposit_dropdown();
        propertyDetailsPage = PageFactory.initElements(driver, PropertyDetailsPage.class);
        propertyDetailsPage.click_source_of_deposit_option();

    }

    @Then("^I click no to buying flat  question$")
    public void i_click_no_to_buying_flat_question() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_buy_flat_question();

    }

    @Then("^I click no to purchase scheme   question$")
    public void i_click_no_to_purchase_scheme_question() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_purchase_scheme_question();

    }

    @Then("^I click no to new build question$")
    public void i_click_no_to_new_build_question() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_new_build_question();

    }

    @Then("^I click no to property wish question  question$")
    public void i_click_no_to_property_wish_question_question() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_property_wish_question();
    }

    @Then("^I click no to own properties  question$")
    public void i_click_no_to_own_properties_question() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_own_property_question();
    }

    @Then("^I click next button$")
    public void i_click_next_button() throws Throwable {
        PropertyDetailsPage propertyDetailsPage = PageFactory.initElements(driver,PropertyDetailsPage.class);
        propertyDetailsPage.click_next_button();

    }


//INCOME PAGE


    @Given("^I click number of main incomes$")
    public void i_click_number_of_main_incomes() throws Throwable {
      IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
      incomeDetailsPage.click_main_income_button();

        Thread.sleep(3000);

    }

    @Given("^I click current employment status dropdown$")
    public void i_click_current_employment_status_dropdown() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_employment_status_dropdown();
    }

    @Given("^I select employment status$")
    public void i_select_employment_status() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_employment_status_option();

    }

    @Given("^I enter employers name$")
    public void i_enter_employers_name() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.type_employer_name_text_box();


    }

    @Given("^I click on contract type dropdown$")
    public void i_click_on_contract_type_dropdown() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_contract_type_dropdown();

    }

    @Given("^I select contract type from dropdown$")
    public void i_select_contract_type_from_dropdown() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_contract_type_option();

    }

    @Given("^I enter occupation$")
    public void i_enter_occupation() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.type_occupation_text_box();

    }

    @Given("^I click on type of employment dropdown$")
    public void i_click_on_type_of_employment_dropdown() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_employment_type_dropdown();
    }

    @Given("^I select type of employment from dropdown$")
    public void i_select_type_of_employment_from_dropdown() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_employment_type_option();

    }

    @Given("^I enter date started$")
    public void i_enter_date_started() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_day_dropdown();
        incomeDetailsPage = PageFactory.initElements(driver, IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_day_option();
        incomeDetailsPage = PageFactory.initElements(driver, IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_month_dropdown();
        incomeDetailsPage = PageFactory.initElements(driver, IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_month_option();
        incomeDetailsPage = PageFactory.initElements(driver, IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_year_dropdown();
        incomeDetailsPage = PageFactory.initElements(driver, IncomeDetailsPage.class);
        incomeDetailsPage.click_Start_year_option();

    }

    @Given("^I enter Basic annual income$")
    public void i_enter_Basic_annual_income() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.type_annual_income_text_box();

    }

    @Given("^I enter a monthly net income$")
    public void i_enter_a_monthly_net_income() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.type_monthly_income_text_box();

    }

    @Given("^I click no on other income option$")
    public void i_click_no_on_other_income_option() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_no_other_income_button();
    }

    @Given("^I enter anticipated retirement  age$")
    public void i_enter_anticipated_retirement_age() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.type_retirement_age_text_box();

    }


    @Given("^I click a next button option$")
    public void i_click_a_next_button_option() throws Throwable {
        IncomeDetailsPage incomeDetailsPage = PageFactory.initElements(driver,IncomeDetailsPage.class);
        incomeDetailsPage.click_Next_button();
    }
//EXPENDITURE PAGE

    @Given("^I click on add commitment button$")
    public void i_click_on_add_commitment_button() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.click_add_commitment_button();


    }

    @Given("^I click on Commitment type dropdown$")
    public void i_click_on_Commitment_type_dropdown() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.click_commitment_type_dropdown();
        expenditureDetailsPage = PageFactory.initElements(driver, ExpenditureDetailsPage.class);
        expenditureDetailsPage.click_commitment_type_option();

    }

    @Then("^I type  a provider$")
    public void i_type_a_provider() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.type_provider_text_box();

    }

    @Then("^I type a monthly payment$")
    public void i_type_a_monthly_payment() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.type_monthly_payment_text_box();

    }

    @Then("^I type an outstanding amount$")
    public void i_type_an_outstanding_amount() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.type_outstanding_payment_text_box();

    }

    @Then("^I click yes on repay commitment question$")
    public void i_click_yes_on_repay_commitment_question() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.click_repay_commitment_button();


    }

    @Then("^I click next button on expenditure page$")
    public void i_click_next_button_on_expenditure_page() throws Throwable {
        ExpenditureDetailsPage expenditureDetailsPage = PageFactory.initElements(driver,ExpenditureDetailsPage.class);
        expenditureDetailsPage.click_next_button();



        Thread.sleep(3000);

    }


    @Then("^I click on Submit application$")
    public void i_click_on_Submit_application() throws Throwable {
        driver.findElement(By.xpath("//button[contains(.,'Submit application')]")).click();
    }


}
















