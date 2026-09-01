package productreview;

import Base.BaseTest;
import Pages.proudectreview;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;
import static reader.ReadDataFromJson.dataModel;

public class ProductReviewTest extends BaseTest {


       @Test
       public void testrview() throws FileNotFoundException {

           proudectreview proudectreview= homePage.clickProductReview();
           proudectreview.ReviewForm
                   (
                   dataModel().review.name,
                   dataModel().review.email,
                   dataModel().review.review

                   );

           String ActualResult=proudectreview.GetSucess();
           String ExpectedResult=dataModel().review.valimessage;
           assertEquals(ActualResult,ExpectedResult);

       }









}
