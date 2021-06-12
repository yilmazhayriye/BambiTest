package com.bambi.tests;

import com.bambi.pages.LoginPage;
import com.bambi.utilities.ConfigurationReader;
import com.bambi.utilities.Driver;
import com.bambi.utilities.Driver_parallel;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AramaButonu extends TestBase {

    LoginPage loginPage=new LoginPage();
    @Test

    public void aramaButonucalistir() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
        Thread.sleep(5000);
        loginPage.aramaButonu.sendKeys("Pamuk Yorgan"+ Keys.ENTER);



    }
}
