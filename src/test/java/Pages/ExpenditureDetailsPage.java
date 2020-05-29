package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExpenditureDetailsPage {


    @FindBy(how = How.LINK_TEXT, using = "Add commitment")
    public static WebElement add_commitment_button;


    @FindBy(how = How.XPATH, using = "//span[contains(.,'Select commitment type')]")
    public static WebElement commitment_type_dropdown;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Overdraft')]")
    public static WebElement commitment_type_option;

    @FindBy(how = How.NAME, using = "applicants[0].expenditureDetails.Commitments[0].Details.company")
    public static WebElement provider_text_box;

    @FindBy(how = How.NAME, using = "applicants[0].expenditureDetails.Commitments[0].Details.monthlyPayment")
    public static WebElement monthly_payment_text_box;

    @FindBy(how = How.NAME, using = "applicants[0].expenditureDetails.Commitments[0].Details.outstandingBalance")
    public static WebElement outstanding_payment_text_box;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Yes')]")
    public static WebElement repay_commitment_button;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Next')]")
    public static WebElement next_button;



    public void click_add_commitment_button() {
        add_commitment_button.click();

    }

    public void click_commitment_type_dropdown() {
        commitment_type_dropdown.click();

    }
    public void click_commitment_type_option() {
        commitment_type_option.click();

    }
    public void type_provider_text_box() {
        provider_text_box.sendKeys("HSBC");

    }
    public void type_monthly_payment_text_box() {
        monthly_payment_text_box.sendKeys("150");

    }
    public void type_outstanding_payment_text_box() {
        outstanding_payment_text_box.sendKeys("700");

    }
    public void click_repay_commitment_button() {
        repay_commitment_button.click();

    }
    public void click_next_button() {
        next_button.click();

    }











































}
