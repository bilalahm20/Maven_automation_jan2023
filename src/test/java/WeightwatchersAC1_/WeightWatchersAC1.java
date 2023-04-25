package WeightwatchersAC1_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.ArrayList;

public class WeightWatchersAC1 {
    public static void main(String[] args) throws InterruptedException {
        //setup chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start maximized for windows with incognito
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //define the WebDriver
        ChromeDriver driver = new ChromeDriver(options);
        //go to weight watchers homepage
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11230");
        zipCode.add("11235");
        zipCode.add("07032");

        for (int i = 0; i < zipCode.size(); i++) {
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            Thread.sleep(3000);
            //Click on find workshop
            driver.findElement(By.xpath("//*[text()= 'Find a Workshop']")).click();
            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipCode.get(i));
            Thread.sleep(3000);

            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            Thread.sleep(3000);

            try {

                ArrayList<WebElement> studios = new ArrayList<>(driver.findElements(By.xpath("//*[@class='container-3SE46']")));
                if (i == 0) {
                    studios.get(1).click();
                } else if (i == 1) {
                    studios.get(2).click();
                } else if (i == 2) {
                    studios.get(0).click();
                }// end of condition

            }catch (Exception e){
                System.out.println("unable to complete conditional statement" +e);
            }// end of try catch
            Thread.sleep(3000);

            try {
                // capture the address
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
               String[] arrayResult = address.split("");
                System.out.println("The Address is" + arrayResult[0] + arrayResult[1] +arrayResult[2] + arrayResult[3] +arrayResult);
            } catch(Exception e){
                System.out.println("unable to capture the address" + e);
            }// end of try catch

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll down 800 pixels (based on your need adjust it by + or - 200)
            jse.executeScript("scroll(0,750)");
            //wait a few seconds
            Thread.sleep(2000);

            try {
                // capture and print the time table
                String timeTable = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("The Schedule is " + timeTable);
            }catch(Exception e){
                System.out.println("unable to capture the schedule" + e);
                }
            }// end of try catch










        // end of loop
    }//end of main
}//end of class
