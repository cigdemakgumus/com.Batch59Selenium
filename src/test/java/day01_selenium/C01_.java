package day01_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
}