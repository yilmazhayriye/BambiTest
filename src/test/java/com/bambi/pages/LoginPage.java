package com.bambi.pages;

import com.bambi.utilities.ConfigurationReader;
import com.bambi.utilities.Driver_parallel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver_parallel.get(), this);
    }

    @FindBy(xpath = "//body/div[@id='main-content']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/*[1]")
    public WebElement logIn;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement userNameTextBox;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//div[@class='container account-containerv2']")
    public WebElement loginForm;

    @FindBy(xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement logInButton;


    @FindBy( xpath = "//body/div[@id='main-content']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    public  WebElement aramaButonu;

    public void loginAsUser() {

        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        userNameTextBox.sendKeys(username);
        passwordTextBox.sendKeys(password);
        logInButton.click();
    }
}