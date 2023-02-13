package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class



HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @FindBy(xpath = "//select[@class='hp-distance form__select']")
    WebElement distanceDropDown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;
    public void enterJobTitle(String Title){
        sendTextToElement(jobTitle,Title);
    }
    public void enterLocation(String Location){
        sendTextToElement(location,Location);
    }
    public void selectDistanceFromDropDown(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        log.info("Clicking On More Search Option" + moreSearchOptionLink.toString());
        clickOnElement(moreSearchOptionLink);
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryTypeDropDown(String typeSalary){
        selectByValueFromDropDown(salaryTypeDropDown,typeSalary);
    }
    public void selectJobTypeDropDown(String typeJob){
        selectByValueFromDropDown(jobTypeDropDown,typeJob);
    }
    public void clickOnFindJobs(){
        log.info("Clicking on Find Jobs" + findJobs.toString());
        clickOnElement(findJobs);
    }
    public void jobSearchApplication(String Title,String Location,String distance,String minSalary,String maxSalary,String typeSalary,String typeJob){
        enterJobTitle(Title);
        enterLocation(Location);
        selectDistanceFromDropDown(distance);
        enterMinSalary(minSalary);
        enterMaxSalary(maxSalary);
        selectSalaryTypeDropDown(typeSalary);
        selectJobTypeDropDown(typeJob);
    }




}




