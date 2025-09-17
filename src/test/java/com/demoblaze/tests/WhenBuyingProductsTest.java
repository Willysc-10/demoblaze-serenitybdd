package com.demoblaze.tests;

import com.demoblaze.actions.NavigateActions;
import com.demoblaze.actions.ProductActions;
import com.demoblaze.actions.CartActions;

import org.junit.Test;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WhenBuyingProductsTest {

    NavigateActions navigate;
    ProductActions products;
    CartActions cart;

    @Test
    public void buyTwoProducts() throws InterruptedException {
        navigate.openHomePage();
        products.addProductToCart("Samsung galaxy s6");
        products.addProductToCart("Nokia lumia 1520");
        cart.viewCart();
        cart.checkout("William", "Ecuador", "Quito", "1234567890123456", "09", "2025");
    }
}
