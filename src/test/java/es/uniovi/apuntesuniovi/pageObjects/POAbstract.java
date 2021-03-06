package es.uniovi.apuntesuniovi.pageObjects;

import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.WebDriver;

public abstract class POAbstract {
  protected WebDriver driver;
  protected TestUtil testUtil;

  public POAbstract(WebDriver driver, TestUtil testUtil) {
    this.driver = driver;
    this.testUtil = testUtil;
  }

  public abstract void run();
}
