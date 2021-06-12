package com.bambi.pages;

import com.bambi.utilities.Driver_parallel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YatakPage {
    public YatakPage() {
        PageFactory.initElements(Driver_parallel.get(), this);
    }
    @FindBy (linkText = "YATAK")
    public WebElement yatak;
    @FindBy (xpath = "//a[contains(text(),'Multisleep Yatak Keşfet')]")
    public  WebElement multisleepYatak;
    @FindBy( xpath = "//body/div[@id='main-content']/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[3]/div[3]/div[2]")
    public  WebElement arttır;
    @FindBy (xpath = "(//button[@class='btnAddToBasket buton-main buton-sepet'])[1]")
    public WebElement sepeteEkle;
    @FindBy (xpath = "//a[contains(text(),'Sepete Git')]")
    public WebElement sepeteGit;
    @FindBy (xpath = "//a[contains(text(),'Sepeti Onayla')]")
    public  WebElement sepetiOnayla;
    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public  WebElement adresBaslıgı;
    @FindBy (xpath = "//input[@class='form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-mask ng-touched']")
    public WebElement telefonNo;
    @FindBy (xpath = "//input[@name='TcNo']")
    public  WebElement tcNo;
    @FindBy (xpath = "//select[@name='StateProvinceId']")
    public  WebElement ilSec;
    @FindBy (xpath = "//select[@name='DistrictId']")
    public  WebElement ilceSec;
    @FindBy (xpath = "//textarea[@name='Description']")
    public  WebElement adres;
    @FindBy(xpath = "//span[@class='checkmark']")
    public WebElement adresiFaturadaKullan;
    @FindBy(xpath = "//button[contains(text(),'Kaydet')]")
    public  WebElement kaydet;
    @FindBy (xpath = "//a[contains(text(),'ÜYE OLMADAN DEVAM ET')]")
    public WebElement uyeolmadandevamet;
    @FindBy (css = "body.checkout-layout.odeme-lay.ng-scope:nth-child(2) div.container-fluid.checkoutv2-full-contain.ng-scope:nth-child(1) div.row div.container.checkoutv2-norm-contain div.row div.col-xs-12.col-sm-12.col-md-9.checkout-payment-left-main-box:nth-child(1) div.row div.col-xs-12.payment-step-tab-main-box:nth-child(2) div.row div.tab-content div.tab-pane.account-containerv2-main.active:nth-child(1) div.container.account-containerv2 div.tab-content div.tab-pane.uyeliksiz-pane.active:nth-child(3) form.login-form.account-create.ng-pristine.ng-valid-email.ng-invalid.ng-invalid-required div.form-group > input.form-control.ng-pristine.ng-untouched.ng-empty.ng-valid-email.ng-invalid.ng-invalid-required")
    public  WebElement emailgiris;
    @FindBy (xpath = "//button[contains(text(),'Siparişi Tamamla')]")
    public  WebElement siparisiTamamla;



}
