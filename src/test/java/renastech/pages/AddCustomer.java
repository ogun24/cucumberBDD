package renastech.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class AddCustomer extends BrowserUtils {
    public AddCustomer(){
        PageFactory.initElements(driver ,this);
    }
@FindBy (xpath = "(//a[.='Add Customer'])[1]")
    private WebElement addbutton;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement addtitle;
    @FindBy(id = "fname")
    private WebElement fNAme;
    @FindBy(id = "lname")
    private WebElement lname;
    @FindBy(id = "email")
    private WebElement eMail;
    @FindBy (xpath = "//textarea[@id='message']")
    private WebElement adres;
    @FindBy(id = "telephoneno")
    private WebElement phone;



public void setAddbutton(){clickWithWait(addbutton); }
    public void setAddtitle(String AddCustomer){Assert.assertEquals(AddCustomer, addtitle.getText()  );
    }
    public void setFNAme(String fName){enterText(fNAme,fName);}
    public void setLname(String lName){enterText(lname,lName);}
    public void setEMail(String email){enterText(eMail,email);}
    public void setAdres(String address){enterText(adres, address);}
    public void setPhone(String pNumber){enterText(phone,pNumber);}



}
