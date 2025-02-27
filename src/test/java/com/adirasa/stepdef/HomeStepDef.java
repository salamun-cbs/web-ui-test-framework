package com.adirasa.stepdef;

import com.adirasa.BaseTest;
import com.adirasa.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on the homepage")
    public void userIsOnTheHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
