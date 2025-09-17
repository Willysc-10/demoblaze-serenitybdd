package com.demoblaze.actions;

import org.openqa.selenium.By;

public class CartActions extends NavigateActions {

    public void viewCart() {
        find(By.id("cartur")).click();
    }

    public void checkout(String name, String country, String city, String creditCard, String month, String year) {
        find(By.xpath("//button[text()='Place Order']")).click();
        find(By.id("name")).type(name);
        find(By.id("country")).type(country);
        find(By.id("city")).type(city);
        find(By.id("card")).type(creditCard);
        find(By.id("month")).type(month);
        find(By.id("year")).type(year);
        find(By.xpath("//button[text()='Purchase']")).click();
    }
}
