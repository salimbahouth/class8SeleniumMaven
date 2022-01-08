import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    JavascriptExecutor js = (JavascriptExecutor) driver;
//    private static WebDriver driver1;
//    private static WebDriver driver2;
//
    @BeforeClass
    public static void beforeAll() {
//        6
        System.setProperty("webdriver.chrome.driver" , "/Users/cupra/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
//        5
//        System.setProperty("webdriver.chrome.driver" , "/Users/cupra/Downloads/chromedriver.exe");
//        driver = new ChromeDriver();
//        4
//        System.setProperty("webdriver.gecko.driver" , "/Users/cupra/Downloads/geckodriver.exe");
//        driver = new FirefoxDriver();
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
//    public void test_03_navToyoutube(){
//        driver.navigate().to("https://www.youtube.com//");
//        System.out.println(driver.findElement(By.id("logo")));
////        its a plus from me to click the menu button
//        driver.findElement(By.id("guide-button")).click();
//    }
//    ----- 3------

    //    ----- 4 ------
//    @Test
//    public void test_04_navToselenium(){
//        // i changed the url because .org is not openning
//        driver.navigate().to("https://www.selenium.dev//");
//        System.out.println(driver.findElement(By.className("form-control td-search-input ds-input")));
//        driver.findElement(By.xpath("form-control td-search-input ds-input")).sendKeys("selenium");
//        // this element has no name attribute
//    }
//    ----- 4 ------

//    ----- 5 ------
//    @Test
//    public void test_05_amzn(){
//        driver.get("https://www.amazon.com");
//        String amazonTitle = "Amazon.com. Spend less. Smile more.";
//        Assert.assertEquals(driver.getTitle(), amazonTitle);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("leather shoes");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//    }
//    ----- 5 -----

    //    ----- 6 ------
//    @Test
//    public void test_06_t(){
//        driver.get("https://translate.google.com");
//        driver.findElement(By.className("er8xn")).sendKeys("שלום");
//    }
//    ----- 6 -----

    //    ----- 7 ------
//    @Test
//    public void test_07_youtube(){
//        driver.get("https://www.youtube.com");
//        driver.findElement(By.id("search")).sendKeys("diet mountain dew");
//        driver.findElement(By.id("search-icon-legacy")).click();
//    }
//    ----- 7 -----

    //    ----- 8 ------
//    @Test
//    public void test_08_fb(){
//        driver.get("https://www.facebook.com");
//        driver.findElement(By.id("email")).sendKeys("cupra-gt30@hotmail.com");
//        driver.findElement(By.id("pass")).sendKeys("Salimb1q2w3e");
//        driver.findElement(By.name("login")).click();
//    }
//    ----- 8 -----



}
