package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YourCartPage {
    public SelenideElement YourCartPageOpen =$(By.className("cart_list"));
        //https://www.saucedemo.com/cart.html
    //public SelenideElement h3DataTest = $(By.tagName("h3"));

}
