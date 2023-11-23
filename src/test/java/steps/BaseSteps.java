package steps;

import pages.InventoryPage;
import pages.LoginPage;
import pages.YourCartPage;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();
    YourCartPage yourCartPage=new YourCartPage();

   // String BASE_URL = "https://www.saucedemo.com/";

   /* @Before
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }*/
}


