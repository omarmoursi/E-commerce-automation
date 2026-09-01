package viewcart;

import Base.BaseTest;
import org.testng.annotations.Test;

public class AddToCartGetDataAndDeleteProductPageTest extends BaseTest {



    @Test
    public void test(){

        Pages.AddToCartGetDataAndDeleteProductPage addToCartGetDataAndDeleteProductPage=homePage.clickAddToCartGetDataAndDeleteProductPage();

        addToCartGetDataAndDeleteProductPage.ClickViewFirstProduct();
        addToCartGetDataAndDeleteProductPage.ClickAddToCart();
        addToCartGetDataAndDeleteProductPage.ClickViewCart();
        System.out.println(addToCartGetDataAndDeleteProductPage.getallfirstproductdat());





    }







}
