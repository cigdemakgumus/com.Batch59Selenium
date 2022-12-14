package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resorces/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        // findElement(By... locator)--> istediğimiz web elementine bizi döndürür.
        //biz o webelementini kullanmak için bir objeye essign ederiz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //herhangii bir webelementine istediğimiz yazıyı yollamak istersek
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

    }
}
