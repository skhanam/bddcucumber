package com.quidco.app.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by amohindroo on 02/03/17.
 */
public class FavPageObject {

    @FindBy(css = "div.settings-field .icon-primary-expand-bg")
    public static List<WebElement> expandBtns;

    @FindBy(css = "input.remove-favourite")
    public static WebElement removeBtn;

    public static String removebtnFormat = "input.remove-favourite";


}
