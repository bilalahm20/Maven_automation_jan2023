package Day12_04112023;

import ReusableLibrary.ReusableActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_TestNGForLoop {
    WebDriver driver;
    @BeforeSuite
    public void setUpChromeDriver() {
        //declare the webdriver and define it from the reusable actions
        driver = ReusableActions.setUpDriver();
    }//end of before class

    @AfterSuite
    public void quitDriverSession() {
        driver.quit();
    }//end of after suite

    @Test
    public void searchForMultipleCars() {
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("bmw");
        carBrands.add("tesla");
        carBrands.add("Porsche");
        carBrands.add("Mercedes");
        for (int i = 0; i < carBrands.size(); i++) {
            //go to google homepage
            driver.navigate().to("https://www.google.com/");
            //enter a car in the search field
            ReusableActions.sendKeysAction(driver, "//*[@name='q']", carBrands.get(i), "SearchField");
            //hit submit on the google search button
            ReusableActions.submitAction(driver, "//*[@name='btnK']", "GoogleSubmit");
            String result = ReusableActions.getText(driver, "//*[@id='result-stats']", "SearchResult");
            String[] arrayResult = result.split(" ");
            System.out.println("Results for car brands " + carBrands.get(i) + " " + arrayResult[1]);


        }//end of loop
    }//end of searchMultipleCars test score
}//end of class
