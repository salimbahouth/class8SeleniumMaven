import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;


public class HomeWork8 {
    private static WebDriver driver;
//    private static WebDriver driver;
//    private static WebDriver driver1;
//    private static WebDriver driver2;
//
    @BeforeClass
    public static void beforeAll() {

//        4
        System.setProperty("webdriver.gecko.driver" , "/Users/cupra/Downloads/geckodriver.exe");
        driver = new FirefoxDriver();
//        3
//        System.setProperty("webdriver.gecko.driver" , "/Users/cupra/Downloads/geckodriver.exe");
//        driver = new FirefoxDriver();
//        2
//        System.setProperty("webdriver.chrome.driver" , "/Users/cupra/Downloads/chromedriver.exe");
//        driver = new ChromeDriver();
//        1
//        System.setProperty("webdriver.chrome.driver" , "/Users/cupra/Downloads/chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver" , "/Users/cupra/Downloads/geckodriver.exe");
//        driver1 = new ChromeDriver();
//        driver2 = new FirefoxDriver();
    }
//
//    @Test
//    public void test_01_open(){
//        driver1.get("https://www.walla.co.il");
//        driver2.get("https://www.ynet.co.il");
//    }


//    ----- 2 ------
//    @Test
//    public void test_02_navToTranslate(){
//        driver.navigate().to("https://translate.google.com/");
//        System.out.println(driver.findElement(By.className("er8xn")));
//        System.out.println(driver.findElement(By.tagName("textarea")));
//    }
//    ----- 2 ------

    //    ----- 3 ------
//    @Test
//    public void test_02_navToyoutube(){
//        driver.navigate().to("https://www.youtube.com//");
//        System.out.println(driver.findElement(By.id("logo")));
////        its a plus from me to click the menu button
//        driver.findElement(By.id("guide-button")).click();
//    }
//    ----- 3------

    //    ----- 4 ------
    @Test
    public void test_02_navToselenium(){
        // i changed the url because .org is not openning
        driver.navigate().to("https://www.selenium.dev//");
        System.out.println(driver.findElement(By.className("form-control td-search-input ds-input")));
        driver.findElement(By.xpath("form-control td-search-input ds-input")).sendKeys("selenium");
        // this element has no name attribute
    }
//    ----- 4------

}
