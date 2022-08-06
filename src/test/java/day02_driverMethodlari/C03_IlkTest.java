package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url ine gidin
            2- Baslığın amazon kelimesi içerdiğini test edin
            3- url in https://www.amazon.com a esit olduğunu test edin
            4-sayfayı kapatın
         */
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

       // 1- https://www.amazon.com url ine gidin
        driver.get("https://www.amazon.com.tr");

        //2- Baslığın amazon kelimesi içerdiğini test edin
        String actuelTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actuelTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
        }

         // 3- url in https://www.amazon.com a esit olduğunu test edin
            String actuelUrl= driver.getCurrentUrl();
            String expectedUrl="https://www.amazon.com.tr";
            if (actuelUrl.equals(expectedUrl)){
                System.out.println("Url Testi PASSED");
            }else {
                System.out.println("actual Url: "+actuelUrl+ " beklenen URLden farklı, Testi FAILED");
            }
        // 4-sayfayı kapatın
        driver.close();


        /*System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
       }

         */
    }
}
