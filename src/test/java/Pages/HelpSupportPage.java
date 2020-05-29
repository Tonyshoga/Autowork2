package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HelpSupportPage {

    @FindBy(how = How.LINK_TEXT, using = "Continue")
    public static WebElement Continue_button;





    public void click_Continue_button() {
        Continue_button.click();


    }

    }
