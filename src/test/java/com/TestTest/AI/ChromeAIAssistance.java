package com.TestTest.AI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
public class ChromeAIAssistance {



public class LoginTest {
    WebDriver driver;
    LoginRepo loginPage;

    @BeforeMethod
    public void setup() {
        // Ensure you have the driver executable in your path
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://travel-test-bug.vercel.app/login");
        loginPage = new LoginRepo(driver);
    }

    @Test
    public void testSuccessfulLogin() throws Exception {
        loginPage.login("user@example.com", "securePassword123", true);
        // Add assertions here, e.g., check if URL changed or a dashboard element is present
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
}