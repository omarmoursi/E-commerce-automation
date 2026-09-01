package ProductsSearch;

import Base.BaseTest;
import Pages.SearchProduct;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static reader.ReadDataFromJson.dataModel;

public class ProductsSearchTest extends BaseTest {






    @Test
    public void testsearchproudects() throws FileNotFoundException {

        SearchProduct searchProduct= homePage.clickProductsButton();
        searchProduct.search(dataModel().sreachproudects.BlueTop );

        String searchText = searchProduct.getSearchText();

        List<String> products = searchProduct.getProductNames();

        boolean found = products.stream().anyMatch(product -> product.equalsIgnoreCase(searchText));

        Assert.assertTrue(found, "Search result does not contain: " + searchText);


    }



}
