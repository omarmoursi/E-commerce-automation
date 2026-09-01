package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class product_details extends MethodHandles {
    public product_details(WebDriver driver) {
        super(driver);
    }

    private By  firstproudect=By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a/i");


    private final By productName=By.xpath("//h2[contains(text(),'Blue Top')]");

    private final By ProductCategory=By.xpath("//p[contains(text(),'Category: Women > Tops')]");

    private final By productPrice=By.xpath("//span[contains(text(),'Rs. 500')]");

    private final By ProductAvailability=By.xpath("//p[contains(text(),' In Stock')]");

    private final By ProductCondition=By.xpath("//p[contains(text(),' New')]");

    private final By brand = By.xpath("//div[@class='product-information']//p[b[text()='Brand:']]");


    public String getProductName(){

        return   getText(productName,10);

    }
    public String getProductCategory(){

        return   getText(ProductCategory,10);

    }
    public String getProductPrice(){

        return   getText(productPrice,10);
    }
    public String getProductAvailability(){

        return   getText(ProductAvailability,10);
    }
    public String getProductCondition(){

        return   getText(ProductCondition,10);
    }
    public product_details clickfirstproudect(){
        click(firstproudect,10);
        return new product_details(driver);
    }

    public String getBrand() {
        return getText(brand, 10).replace("Brand:", "").trim();
    }

    public String getallproudectdetails(
    )


    {
        return      getProductName() + getProductCategory() + getProductPrice()
                + getProductAvailability() +getProductCondition()+ getBrand();


    }





}
