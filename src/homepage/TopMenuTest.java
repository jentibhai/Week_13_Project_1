package homepage;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;



import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    @Test
    public void verifyPageNavigation() {
        //use selectMenu method to click on menu
        selectMenu("Computers");
        //verify page is navigated to selected menu
        verifyText("Computers",
                By.xpath("//h1[contains(text(),'Computers')]"),
                "Not navigated to selected menu");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}