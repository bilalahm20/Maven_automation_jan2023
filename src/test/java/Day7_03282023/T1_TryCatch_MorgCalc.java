package Day7_03282023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_TryCatch_MorgCalc {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options
        ChromeOptions options = new ChromeOptions();
        //start maximized for windows
        options.addArguments("start-maximized");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        //go to mortgage calculator homepage
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //wait two seconds
        Thread.sleep(2000);

        try {
            //we store homevalue as webelement
            WebElement homeValue = driver.findElement(By.xpath("//*[@id  = 'homevalue']"));
            //clear the field
            homeValue.clear();
            //enter 850000
            homeValue.sendKeys("850000");
        } catch (Exception e) {
            System.out.println("Unable to enter home value because of error: " + e);
        }//end of home value try catch

        try{
            //enter downpayment
            WebElement downPayment = driver.findElement(By.xpath("//*[@id  = 'downpayment']"));
            //clear the field
            downPayment.clear();
            //enter 150000 as downpayment
            downPayment.sendKeys("150000");
        } catch (Exception e){
            System.out.println("Unable to enter down payment value because of error: " + e);
        }

        try {
            //click on calculate button
            driver.findElement(By.xpath("//*[@value = 'Calculate']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on calculate button because of error: " + e);
        }

        try {
            //capture the monthly payment
            String monthlyPayment = driver.findElements(By.xpath("//*[@class= 'left-cell']/h3")).get(0).getText();
            System.out.println("The Monthly Payment is: " + monthlyPayment);
        }catch (Exception e){
            System.out.println("Unable to capture the monthly payment because of error: " + e);
        }

        //Quit the Driver
        driver.quit();
    }//end of main
}//end of class
