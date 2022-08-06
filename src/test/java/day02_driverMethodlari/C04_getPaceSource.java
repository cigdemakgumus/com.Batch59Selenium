package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPaceSource {
    public static void main(String[] args) {
    // Amazon sitesine gidip kaynak kodlarında  "spend less" yazdığını test edin
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr");
        String sayfaKaynakKodlari=driver.getPageSource();
        String arananKelime="spend less";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("kaynak Kodu Testi PASSED");
        }else {
            System.out.println("Kaynak Kodlarında" + arananKelime + "yok, test FAILED");
        }




    }
}
