package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterwhileCheckout extends MethodHandles {

    Actions actions;

    public RegisterwhileCheckout(WebDriver driver) {
        super(driver);
    }


    private By productCard(String productName)
    {
        return By.xpath("//div[contains(@class,'single-products')]" +
            "[.//p[normalize-space()='" + productName + "']]");
    }


    private final By AddToCartButton = By.cssSelector(".product-overlay a.add-to-cart");

    private final By ViewCartButton=By.xpath("//u[contains(text(),'View Cart')]");

    private final By  ProceedToCheckout=By.xpath("//a[@class='btn btn-default check_out']");

    private final By  LoginAndSignUpButton=By.cssSelector("#checkoutModal a[href='/login']");



    public void ScrollToElementJsExcuter()
    {
        scrollByPixels(driver,0,400);
    }



    public void AddProductToCart(String productName)
    {

        WebElement product = driver.findElement(productCard(productName));

        new Actions(driver).moveToElement(product).perform();

        product.findElement(AddToCartButton).click();
    }



    public  void ClickViewCartButton()
    {

        click(ViewCartButton,15);

    }
    public  void ClickProceedToCheckout()
    {

        click(ProceedToCheckout,15);

    }

    public  void ClickLoginAndSignUpButton()
    {

        click(LoginAndSignUpButton,15);

    }

    public RegisterPage ClickViewAndCheckOut(){
        ClickViewCartButton();
        ClickProceedToCheckout();
        ClickLoginAndSignUpButton();
        return new  RegisterPage(driver);

    }


}













