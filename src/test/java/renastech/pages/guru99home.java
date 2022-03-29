package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class guru99home extends BrowserUtils {

    public guru99home(){
        PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement addplan;
    @FindBy (xpath = "//h1[.='Add Tariff Plans']")
    private WebElement header;
    @FindBy (id = "rental1")
    private WebElement rental;
    @FindBy(id = "local_minutes")
    private WebElement localmin;
    @FindBy(id ="inter_minutes")
    private WebElement international;
    @FindBy(id = "sms_pack")
    private WebElement sms;
    @FindBy(id = "minutes_charges")
    private WebElement localcharges;
    @FindBy(id = "inter_charges")
    private WebElement intercharges;
    @FindBy(id = "sms_charges")
    private  WebElement percharges;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement congrats;
    @FindBy(xpath = "//input[@name='submit']")
private WebElement submit;

    public void setAddplan(){
        addplan.click();
    }
    public void setHeader(String expectedheader){
        Assert.assertEquals(expectedheader, header.getText());
    }
    public void setRental(String MonthlyRental){rental.sendKeys(MonthlyRental);}
    public void setLocalmin(String FreeLocalMinutes){localmin.sendKeys(FreeLocalMinutes);}
    public void setInternational(String FreeInternationalMinutes){international.sendKeys(FreeInternationalMinutes);}
    public void setSms(String FreeSMSPack){sms.sendKeys(FreeSMSPack);}
    public void setLocalcharges(String LocalPerMinutesCharges){localcharges.sendKeys(LocalPerMinutesCharges);}
    public void setIntercharges(String InternationalPerMinutesCharges){intercharges.sendKeys(InternationalPerMinutesCharges);}
    public void setPercharges(String SMSPerCharges){percharges.sendKeys(SMSPerCharges);}
    public void setSubmit(){submit.click();}
    public void setCongrats(String expectedmessage){Assert.assertEquals(expectedmessage, congrats.getText());}
}
