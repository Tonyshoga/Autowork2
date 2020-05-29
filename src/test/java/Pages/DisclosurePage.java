package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DisclosurePage {


    @FindBy(how = How.XPATH, using = "//div[@id='content']/form/div/label")
    public static WebElement disclosure_radio_button;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement continue_button;



    public void click_disclosure_radio_button() {
        disclosure_radio_button.click();

    }

    public void click_continue_button() {
        continue_button.click();

    }
















}
