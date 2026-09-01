package filterbycategory;

import Base.BaseTest;
import Pages.Filter_by_category;
import org.testng.annotations.Test;

public class FilterByCategoryTest extends BaseTest {

             @Test
         public void TestFilterCategory() throws InterruptedException {

                 Filter_by_category filterByCategory=  homePage.clickFilterByCategory();
                 filterByCategory.ScrollToElementJsExcuter();
                         filterByCategory.getalldata();


             }



}
