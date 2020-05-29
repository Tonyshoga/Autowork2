package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.LINK_TEXT, using = "First time buyers")
    public static WebElement First_time_buyer_button;


    @FindBy(how = How.LINK_TEXT, using = "Get a mortgage promise")
    public static WebElement mortgage_promise_button;


    public void click_First_time_buyer_button() {
        First_time_buyer_button.click();
    }


    public void click_mortgage_promise_button() {
        mortgage_promise_button.click();


    }

}
