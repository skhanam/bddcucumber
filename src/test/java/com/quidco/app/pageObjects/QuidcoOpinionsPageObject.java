package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by ashishmohindroo on 4/12/17.
 */
public class QuidcoOpinionsPageObject {


    @FindBy(css = ".your-profile-btn")
    public static WebElement profileBtn;

    @FindBy(xpath = "//select[starts-with(@id,\"questions_\")]")
    public static List<WebElement> questions;


}
