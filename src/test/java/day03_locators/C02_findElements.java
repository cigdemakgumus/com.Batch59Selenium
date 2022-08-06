package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) {
        //amazon sayfasında kac link bulunduğunu yazdıralım

        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://wwwamazon.com");
        List<WebElement>linkListesi=driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki Link Sayısı : "+linkListesi.size());

    }
}
