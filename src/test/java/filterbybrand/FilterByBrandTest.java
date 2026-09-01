package filterbybrand;

import Base.BaseTest;
import Pages.Filter_by_Brand;
import Pages.Filter_by_category;
import Pages.HomePage;
import org.testng.annotations.Test;

public class FilterByBrandTest extends BaseTest {


    @Test
    public void TestFilterByBrand(){

          Filter_by_Brand filterByBrand= homePage.clickProductForBrand();
             filterByBrand.clickPoloBrand();
             filterByBrand.clickKidsBrand();

    }




}
