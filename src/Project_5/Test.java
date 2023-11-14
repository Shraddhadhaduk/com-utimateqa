package Project_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://courses.ultimateqa.com/";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open url into the browser
        driver.get(baseUrl);

        //Maximize the browser
        driver.manage().window().maximize();

        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //print the title
        String title = driver.getTitle();
        System.out.println(title);

        //get current url
        String current = driver.getCurrentUrl();
        System.out.println("The current url : " + driver.getCurrentUrl());

        //print Page source
        driver.getPageSource();

        //fine the sign in element and click on it
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();
        Thread.sleep(2000);

        //Print current url
        String currentUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(currentUrl);
        System.out.println("Get current url " + driver.getCurrentUrl());

        //Find the email id field and enter email id
        WebElement emailIdField = driver.findElement(By.id("user[email]"));
        emailIdField.sendKeys("Abcd123@gmail.com");
        Thread.sleep(2000);

        //Find the password field and enter password
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("1234");
        Thread.sleep(2000);

        //click on sign in button
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
        Thread.sleep(2000);

        //Navigate to baseurl
        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        //Navigate Forward
        driver.navigate().forward();
        Thread.sleep(2000);

        //Navigate forward
        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        //refresh page
        driver.navigate().refresh();
        Thread.sleep(2000);

        //close browser
        driver.quit();



    }
}
