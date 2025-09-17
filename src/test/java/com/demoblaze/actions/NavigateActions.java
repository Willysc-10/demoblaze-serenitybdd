package com.demoblaze.actions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NavigateActions extends PageObject {


    public void openHomePage() {
        openUrl("https://www.demoblaze.com/");
    }


    public void goToProduct(String productName) {
        find(By.linkText(productName)).click();
    }
}
