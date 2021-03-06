package es.uniovi.apuntesuniovi.tests.subject.disable;

import es.uniovi.apuntesuniovi.tests.AbstractTest;
import io.cucumber.java.en.Then;

public class InactiveActiveSubject extends AbstractTest {

  @Then("the subject disappeared in the list of subjects")
  public void the_subject_disappeared_in_the_list_of_subjects() {
    testUtil.waitChangeWeb();
    testUtil.textPresent(values.get("subjectName"), false);
  }
}
