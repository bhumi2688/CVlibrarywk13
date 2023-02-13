package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }
    @Test(dataProvider = "JobDetails", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String Title,String Location,String distance,
               String minSalary,String maxSalary,String typeSalary,String typeJob,String result){
        homePage.enterJobTitle(Title);
        homePage.enterLocation(Location);
        homePage.selectDistanceFromDropDown(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(minSalary);
        homePage.enterMaxSalary(maxSalary);
        homePage.selectSalaryTypeDropDown(typeSalary);
        homePage.selectJobTypeDropDown(typeJob);
        homePage.clickOnFindJobs();
        resultPage.resultMessage(result);



    }

}
