package es.uniovi.apuntesuniovi.pageObjects;

import es.uniovi.apuntesuniovi.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POAdminMenuUsers extends POAbstract {

    public POAdminMenuUsers(WebDriver driver, TestUtil testUtil) {
        super(driver, testUtil);
    }

    @Override
    public void run() {
        driver.findElement(By.linkText("Usuarios")).click();
        testUtil.waitChangeWeb();
    }
}