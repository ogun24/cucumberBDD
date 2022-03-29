package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

import java.time.Month;

public class Payment extends BrowserUtils {

    public Payment(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber ;

    @FindBy (id = "month")
    private WebElement month ;

    @FindBy (id = "year")
    private WebElement year ;

    @FindBy(id = "cvv_code")
    private WebElement cvvCode ;

    @FindBy (name = "submit")
    private WebElement payButton ;

    public void setCardNumber(String CardNumber){
        staticWait(1);
        cardNumber.sendKeys(CardNumber);
    }

    public void setMonth (String Month){
        staticWait(1);
        month.sendKeys(Month);

    }
    public void setYear(String Year){
        year.sendKeys(Year);
    }
    public void setCvvCode(String Cvvcode){
        cvvCode.sendKeys(Cvvcode);
    }
    public void setPayButton(){
        payButton.click();
    }

}