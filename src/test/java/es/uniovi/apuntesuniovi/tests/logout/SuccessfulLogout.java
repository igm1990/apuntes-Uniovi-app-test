package es.uniovi.apuntesuniovi.tests.logout;

import es.uniovi.apuntesuniovi.model.Constants;
import es.uniovi.apuntesuniovi.pageObjects.login.POLogin;
import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Check the logout with correct data
 */
public class SuccessfulLogout extends AbstractTest {
  @Given("User is identified")
  public void user_is_identified() {
    testUtil.changeWebUrl(Constants.URL_BASE);
    POLogin login = new POLogin(driver, testUtil, "admin", "admin");
    login.run();
  }

  @When("tries to logout")
  public void tries_to_logout() {
    testUtil.changeWebClick("logout");
  }

  @Then("the application will let out him")
  public void the_application_will_let_out_him() {
    testUtil.textPresent("Identificarse", true);
    testUtil.textPresent("Cerrar sesión", false);
  }
}
