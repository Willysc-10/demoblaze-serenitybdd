package com.demoblaze.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductActions extends NavigateActions {

    private WebDriverWait wait;

    public void addProductToCart(String productName) throws InterruptedException {
        goToProduct(productName);
        find(By.linkText("Add to cart")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println("Alert text: " + alert.getText());
            alert.accept(); // Aceptar alert de confirmación
        } catch (Exception e) {
            System.out.println("⚠️ No apareció ningún alert para el producto: " + productName);
        }
        openHomePage(); // volver al home para seleccionar otro producto
    }
}

