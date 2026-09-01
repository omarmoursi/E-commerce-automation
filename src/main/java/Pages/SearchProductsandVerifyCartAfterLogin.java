package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductsandVerifyCartAfterLogin extends MethodHandles {


    public SearchProductsandVerifyCartAfterLogin(WebDriver driver) {
        super(driver);
    }

    private final By SearchField=By.cssSelector("#search_product");
    private final By SearchButton=By.xpath("//button[@id='submit_search']");
    private final By ViewProductButton=By.cssSelector("a[href='/product_details/2']");
    private final By AddToCartButton=By.xpath("//button[@type='button']");
    private final By ViewCart=By.xpath("//div[@class='modal-content']//a");
    private final By LoginButton=By.linkText("Signup / Login");
    private final By CartButton=By.linkText("Cart");



    public void InsertProductName(String prodname)
    {

        sendKeys(SearchField,prodname,10);
    }
    public void ClickSearchButton()
    {
        click(SearchButton,10);

    }

    public void ClickViewProduct()
    {
        click(ViewProductButton,10);

    }

    public void ClickAddToCartButton()
    {
        click(AddToCartButton,10);

    }
    public void ClickViewCart()
    {
        click(ViewCart,20);

    }
    public LoginPage ClickLoginButton()
    {
        click(LoginButton,10);
        return new LoginPage(driver);
    }

    public void ClickCartButton()
    {
        click(CartButton,20);

    }
    public void   SearchToView(String prodname){
        InsertProductName(prodname);
        ClickSearchButton();
        ClickViewProduct();
        ClickAddToCartButton();
        ClickViewCart();


    }




}
