package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCart_Checkout_Payment extends MethodHandles {


    public AddProductToCart_Checkout_Payment(WebDriver driver) {
        super(driver);
    }


    private final By FirstProductAddToCart = By.cssSelector(".productinfo a[data-product-id='1']");
    private final By ContinueButton=By.xpath("//button[@data-dismiss='modal']");
    private final By SecondProductAddToCart = By.xpath("(//div[@class='productinfo text-center']//a[contains(@class,'add-to-cart')])[2]");
    private final By ViewCart = By.xpath("//p[@class='text-center']//a");


    public void ScrollToElementJsExcuter()
    {

        scrollByPixels(driver,0,500);

    }

    public void AddFirstProdUctToCart(){


        click(FirstProductAddToCart,10);

    }
    public void AddSecondProductToCart(){


        click(SecondProductAddToCart,10);

    }

    public void ClickContinueButtonFirst()
    {

        click(ContinueButton,10);

    }


    public void ClickOnViewCart(){


        click(ViewCart,10);
    }

    public AddToCartGetDataAndDeleteProductPage AddProductsToCart(){
        ScrollToElementJsExcuter();
        AddFirstProdUctToCart();
        ClickContinueButtonFirst();
        AddSecondProductToCart();
        ClickOnViewCart();
        return new AddToCartGetDataAndDeleteProductPage(driver);
    }







}
