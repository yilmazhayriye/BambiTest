package com.bambi.tests;

import com.bambi.pages.LoginPage;
import com.bambi.pages.YatakPage;
import com.bambi.utilities.BrowserUtils;
import com.bambi.utilities.ConfigurationReader;
import com.bambi.utilities.Driver;
import com.bambi.utilities.Driver_parallel;
import org.testng.annotations.Test;

public class YatakTest extends TestBase{

    YatakPage yatakPage=new YatakPage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void setYatakPage() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
        yatakPage.yatak.click();
        Thread.sleep(2000);
        BrowserUtils.scrollToElement(yatakPage.multisleepYatak);
        yatakPage.multisleepYatak.click();
        Thread.sleep(2000);
        yatakPage.arttır.click();
        Thread.sleep(2000);
        yatakPage.sepeteEkle.click();
        Thread.sleep(2000);
        yatakPage.sepeteGit.click();
        Thread.sleep(2000);
        yatakPage.sepetiOnayla.click();
        Thread.sleep(2000);
       yatakPage.uyeolmadandevamet.click();
       Thread.sleep(2000);
       yatakPage.emailgiris.sendKeys("ahmetyilmaz2007@gmail.com");
       BrowserUtils.waitFor(2);
       yatakPage.siparisiTamamla.click();




    }
}
