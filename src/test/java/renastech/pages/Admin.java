package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Admin extends BrowserUtils {

    public Admin(){
        PageFactory.initElements(driver, this);}


    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement admin;
    @FindBy(id = "menu_admin_nationality")
    private WebElement nationality;
    @FindBy(id = "btnAdd")
    private WebElement add;

    public void setAdmin(){clickWithWait(admin);}
    public void setNationality(){clickWithWait(nationality);}
    public void setAdd(){clickWithWait(add);}




}