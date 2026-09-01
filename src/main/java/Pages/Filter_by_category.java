package Pages;

import Utils.MethodHandles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Filter_by_category extends MethodHandles {

    public Filter_by_category(WebDriver driver)
    {
        super(driver);
    }



    private final By WomenCategory = By.cssSelector("a[href='#Women']");

    private final By WomenDress    = By.cssSelector("#Women a[href='/category_products/1']");

    private final By WomenProductsDisplayed    = By.xpath("//h2[contains(text(),'Women - Dress Products')]");

    private final By MenCategory=By.cssSelector("a[href='#Men']");

    private final By TshirtCategory=By.cssSelector("#Men a[href='/category_products/3']");

    private final By Title    = By.cssSelector("//title[contains(text(),'Automation Exercise - Tshirts Products')]");



    public void ScrollToElementJsExcuter()
    {
        scrollByPixels(driver,0,500);
    }


    public void ClickWomenCategory(){
       click(WomenCategory,10);
    }


    public void ClickWomenDress(){
        click(WomenDress,10);
    }


    public void ClickMenCategory(){
        click(MenCategory,10);
    }

    public void ClickTshirtCategory(){
        click(TshirtCategory,10);
    }

    public void Dressproudectsisvisable(){isDisplayed(WomenProductsDisplayed,10);}


    public  void getalldata() throws InterruptedException {

       ClickWomenCategory();
       ClickWomenDress();
       ClickMenCategory();
       ClickTshirtCategory();
}


}
