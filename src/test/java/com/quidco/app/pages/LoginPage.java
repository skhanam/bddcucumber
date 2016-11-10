package com.quidco.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by thadeus on 11/04/16.
 */
public class LoginPage extends BasePage{


    @FindBy(id = "username")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "continue")
    private WebElement continueBtn;
    @FindBy(xpath = "//*[@id=\"sign-in-page-form\"]/div/div[1]/div[3]/input")
    private WebElement signInBtn;


    public LoginPage enterUsernameAndPassWord(String username,String password){
        waitForElementDisplay(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        return this;
    }
    public LandingPage clickSignInBtn(){
        signInBtn.click();
        if(isElementVisible(continueBtn)){
            continueBtn.click();
        }
        return PageFactory.initElements(driver,LandingPage.class);
    }

}
