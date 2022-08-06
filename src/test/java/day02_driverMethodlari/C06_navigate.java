package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException{
        /* eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek driver.get() yerine
        driver.navigate.to() methodunu kullanırız ve sonrasında forward(), back(), veya refresh() methodlarını kullanabiliriz.

         */
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com.tr");
        Thread.sleep(2000);

        driver.navigate().to("httos://www.facebook.com.tr");
        Thread.sleep(2000);

        // amazon'a geri donelim
        driver.navigate().back();
        Thread.sleep(2000);
        // yeniden facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);
        // sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);
        // sayfayi kapatalim
        driver.close();
    }
}
