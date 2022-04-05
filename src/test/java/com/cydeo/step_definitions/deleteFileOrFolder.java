package com.cydeo.step_definitions;

import com.cydeo.pages.DashBoardPage;
import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deleteFileOrFolder {
    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
    loginPage.login();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
    dashBoardPage.clickModule(module);
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {

    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    }
}
