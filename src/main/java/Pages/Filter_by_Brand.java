package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Filter_by_Brand extends MethodHandles {

    public Filter_by_Brand(WebDriver driver)
    {
        super(driver);
    }

    private final By PoloBrand = By.cssSelector("a[href='/brand_products/Polo']");
    private final By KidsBrand = By.cssSelector("a[href='/brand_products/Kookie Kids']");




    public void clickPoloBrand(){
        click(PoloBrand,10);
    }

    public void clickKidsBrand(){
        click(KidsBrand,10);
    }


}
