package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /* İlerde wait konusunu daha geniş ele alacağız
        bir sayfa acılırken ilk basta sayfanın içinde bulunan elelmentlere göre bir yukleme suresine ihtıyac vardır
        veya bir web elementinin kullanılabilmesiiçin zamana ihtiyac olabilir
        implicitlyWait bize sayfanın yuklenmesi ve sayfadaki elementlere ulasım için beklenecek Maxımum süreyi belirleme
         olanağı sağlar.
         */
    }
}
