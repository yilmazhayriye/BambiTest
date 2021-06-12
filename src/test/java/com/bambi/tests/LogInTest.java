package com.bambi.tests;

import com.bambi.pages.LoginPage;
import com.bambi.utilities.ConfigurationReader;
import com.bambi.utilities.Driver;
import com.bambi.utilities.Driver_parallel;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTesti() throws InterruptedException {

        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
        Thread.sleep(5000);
        loginPage.logIn.click();
        Thread.sleep(5000);
        loginPage.loginAsUser();



    }
}