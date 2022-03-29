package renastech.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import renastech.pages.AddCustomer;
import renastech.pages.guru99home;
import renastech.utils.BrowserUtils;

import java.util.Map;

public class guru99steps extends BrowserUtils {
    guru99home guru99home = new guru99home();
    AddCustomer addCustomer = new AddCustomer();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site()
    {
        System.out.println("Welcome to Guru99");
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
guru99home.setAddplan();



    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String expectedheader) {
        guru99home.setHeader(expectedheader);

    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
        guru99home.setRental(dataTable.get("Monthly Rental"));
        guru99home.setLocalmin(dataTable.get("Free Local Minutes"));
guru99home.setInternational(dataTable.get("Free International Minutes"));
guru99home.setSms(dataTable.get("Free SMS Pack"));
        guru99home.setLocalcharges(dataTable.get("Local Per Minutes Charges"));
        guru99home.setIntercharges(dataTable.get("International Per Minutes Charges"));
        guru99home.setPercharges(dataTable.get("SMS Per Charges"));
    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        guru99home.setSubmit();

    }
    @Then("The user would like to check message as {string}")
    public void the_user_would_like_to_check_message_as(String expectedmessage) {
    guru99home.setCongrats(expectedmessage);

    }

    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
addCustomer.setAddbutton();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String AddCustomer) {
     addCustomer.setAddtitle(AddCustomer);
    }


    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {

    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName, String lName, String Email, String address, String pNumber) {
        addCustomer.setFNAme(fName);
        addCustomer.setLname(lName);
        addCustomer.setEMail(Email);
        addCustomer.setAdres(address);
        addCustomer.setPhone(pNumber);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {

    }
}
