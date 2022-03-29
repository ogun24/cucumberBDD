package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

import java.nio.file.WatchEvent;

public class Verification extends BrowserUtils {

    public Verification(){
        PageFactory.initElements(driver, this);}

        @FindBy(xpath = "//h2[@style='font-weight:300;line-height:66px;color:#555555;']")
                private WebElement verificationText;

    public void setVerificationText(String expected){
            Assert.assertEquals(verificationText.getText(),expected);
    }
}
