package renastech.stepDefinations;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QPDecoderStream;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import renastech.pages.Admin;
import renastech.pages.OrangeHRMHome;
import renastech.pages.OrangeHRMLogin;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {


    OrangeHRMHome orangeHRMHome = new OrangeHRMHome();
    OrangeHRMLogin orangeHRMLogin= new OrangeHRMLogin();
     Admin admin = new Admin();


     @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {


        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.get(ConfigurationsReader.getProperties("urlHRM"));
        driver.manage().window().maximize();
        System.out.println("The website is launched");

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {

        orangeHRMLogin.setUsername();
        orangeHRMLogin.setPassword();

        }


    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {

        orangeHRMLogin.setLoginbutton();

    }
    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        OrangeHRMHome orangeHRMHome = new OrangeHRMHome();
        orangeHRMHome.setDashboardMessage();
    }
    @Then("The user wants to go to PIM page")
    public void the_user_wants_to_go_to_pim_page() {
       orangeHRMHome.setPIM();
    }
    @Then("The user wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page() {
      orangeHRMHome.setAdd();
    }
    @Then("The user wants to add user name as {string}")
    public void the_user_wants_to_add_user_name_as(String name) {
        orangeHRMHome.setFname(name);

    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String lastname) {
        orangeHRMHome.setLname(lastname);

    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {
orangeHRMHome.setSave();

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String pdetails ) {
orangeHRMHome.setPdetails(pdetails);

    }@Then("The User wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page(Map<String, String> dataTable) {
orangeHRMHome.setAdd();
orangeHRMHome.setFname(dataTable.get("FirstName"));
        orangeHRMHome.setLname(dataTable.get("LastName"));  }
    @Then("The user wants to add login details")
    public void the_user_wants_to_add_login_details(Map<String, String> dataTable) {
        orangeHRMHome.setDetailsBox();
        orangeHRMHome.setName2("User Name");
        orangeHRMHome.setPassword(dataTable.get("Password"));
        orangeHRMHome.setRepassword(dataTable.get("Password"));
        orangeHRMHome.setStatus(dataTable.get("Status"));

    }

    @Then("The user wants to add an employee in a list way")
    public void the_user_wants_to_add_an_employee_in_a_list_way(List<List<String>>dataTable) {
        orangeHRMHome.setAdd();
        orangeHRMHome.setFname(dataTable.get(0).get(0));
        orangeHRMHome.setLname(dataTable.get(0).get(1));


    }
    @Then("The user wants to add login details in a list way")
    public void the_user_wants_to_add_login_details_in_a_list_way(List<List<String>>dataTable) {
orangeHRMHome.setDetailsBox();
orangeHRMHome.setName2(dataTable.get(2).get(0));

    }

    @Then("The user wants to go to Admin page")
    public void the_user_wants_to_go_to_admin_page() {
        admin.setAdmin();

    }
    @Then("The user wants to go to Nationalities section")
    public void the_user_wants_to_go_to_nationalities_section() {
admin.setNationality();
    }
    @Then("The user wants to add new nationalities")
    public void the_user_wants_to_add_new_nationalities() {
        admin.setAdd();


    }
   /* @Then("The user wants to add nationatilies as {string}")
    public void the_user_wants_to_add_nationatilies_as(String string) {
FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
    }*/
    @Given("The user want to login Orange HRM with excel")
    public void the_user_want_to_login_orange_hrm_with_excel()throws IOException {
        String filePath = "C:\\Users\\OGÜN BOY\\IdeaProjects\\cucumberBDD\\src\\test\\resources\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");


        int rows =sheet.getLastRowNum();
        int cols= sheet.getRow(0).getLastCellNum();

        XSSFRow row =sheet.getRow(1);
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));
        System.out.println("total row number is" + rows);
        System.out.println("total column number is " +cols);

        orangeHRMLogin.setDataFromExcel(row.getCell(0).toString(),row.getCell(1).toString());

    }

}
