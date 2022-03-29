package renastech.pages;

import org.apache.pdfbox.contentstream.operator.state.Save;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;
import org.apache.log4j.Logger;
import java.util.logging.LogManager;

public class OrangeHRMHome extends BrowserUtils {

    public OrangeHRMHome(){
        PageFactory.initElements(driver, this);
    }


    static final Logger logger= Logger.getLogger(OrangeHRMHome.class);


    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement dashboardMessage;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "btnAdd")
    private WebElement add;
    @FindBy(id = "firstName")
    private WebElement Fname;
    @FindBy(id = "lastName")
    private WebElement Lname;
    @FindBy(id = "btnSave")
    private WebElement save;
@FindBy(xpath = "//h1[.='Personal Details']")
private WebElement Pdetails;
@FindBy(id = "chkLogin")
private WebElement detailsBox;
@FindBy (id = "user_name")
private WebElement name2;
@FindBy(id = "user_password")
private WebElement password;
    @FindBy(id = "re_password")
    private WebElement repassword;
    @FindBy(id = "status")
    private WebElement status;

    public void setPIM(){
        PIM.click();}

    public void setAdd(){
        add.click();
    }
public void setFname(String name){
        Fname.sendKeys(name);
}
public void setLname(String lastname){
        Lname.sendKeys(lastname);

}
    public  void setDashboardMessage(){
        Assert.assertEquals("Dashboard", dashboardMessage.getText() );
    }
public void setSave(){
    save.click();
}

public void setPdetails(String pdetails){
        Assert.assertEquals(pdetails, Pdetails.getText());
}
public void setDetailsBox(){clickWithWait(detailsBox);}
public void setName2(String Name2){
    name2.sendKeys(Name2);}

public void setPassword(String Password){
    password.sendKeys(Password);
}public void setRepassword(String Repassword){
        repassword.sendKeys(Repassword);
}
public void setStatus(String Status){BrowserUtils.selectFromDropDown(status, Status);

logger.info("status is passed");
    }
}