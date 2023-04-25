package ActionItem_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Assignment_2 {
    public static void main(String[] args) throws InterruptedException {
        //set up the WebDriver you will be using
        WebDriverManager.chromedriver().setup();

        //choose the Driver/Browser you would like to use
        WebDriver driver = new ChromeDriver();

        //Create an array list with the sports
        ArrayList<String> sportsKeywords = new ArrayList<>();
        sportsKeywords.add ("Basketball");
        sportsKeywords.add ("Ice Hockey");
        sportsKeywords.add ("Football");
        sportsKeywords.add ("Soccer");


        //Create a ForLoop for the ArrayList and search
        for (int i = 0; i < sportsKeywords.size(); i++) {
            //Use bing as your search engine
            driver.navigate().to("https://www.bing.com");


            //wait for 3 seconds
            Thread.sleep(1000);

            //enter the keyword on the search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sportsKeywords.get(i));

            //press on the search button
            driver.findElement(By.xpath("//*[@id='sb_form_q']")).submit();

            //wait for 3 seconds
            Thread.sleep(1000);

            //get the results and store it on a sting variable
            String results = driver.findElement(By.xpath("//*{@class='sb_count']")).getText();

            //split the results and print out only the search numbers
            String[] arrayResult = results.split(" ");
            System.out.println("For " + sportsKeywords.get(i) + " is " + arrayResult[1]);

            driver.quit();



        }//end of loop
    }//end of main
}//end of class
