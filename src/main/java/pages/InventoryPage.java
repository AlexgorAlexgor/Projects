package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.cssSelector;

public class InventoryPage {
    public SelenideElement inventoryList = $(byClassName("inventory_list"));
    public SelenideElement h3DataTest = $(By.tagName("h3"));

    public SelenideElement burgerMenu = $(By.id("react-burger-menu-btn"));
    public SelenideElement logoutField = $(By.id("logout_sidebar_link"));

    public ElementsCollection inventoryItems = $$(byClassName("inventory_item"));

    public SelenideElement sortDropDown = $(byClassName("product_sort_container"));
    public SelenideElement textAz=$(byText("Name (A to Z)"));

    public ElementsCollection sortedItems=$$(By.id("inventory_container"));
    public SelenideElement sortDropdown = $(byClassName("product_sort_container"));
    public SelenideElement nameAtoZ = $(cssSelector("[value='az']"));
    public ElementsCollection inventoryNames = $$(By.className("inventory_item_name"));
    public SelenideElement nameZtoA = $(cssSelector("[value='za']"));

    public SelenideElement priceLowToHigh = $(byCssSelector("[value='lohi']"));

    public ElementsCollection inventoryPrices = $$(By.className("inventory_item_price"));

  // public ElementsCollection inventoryItems = $$(By.linkText("Add to cart"));
    public  SelenideElement buttonShoppingCartLink =$(byClassName("shopping_cart_link"));

}
