package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {
       /* Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
            i. Username : testtechproed@gmail.com
            ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
     */
        System.setProperty("webdriver.chrome.driver","src/resorces/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

       // b. Sign in butonuna basin
        WebElement signElementLink= driver.findElement(By.linkText("Sign in"));
        signElementLink.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexBox= driver.findElement(By.id("session_email"));
        WebElement passwordTexbox= driver.findElement(By.name("session[password]"));
        WebElement signinButon=driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTexBox.sendKeys("testtechproed@gmail.com");
        passwordTexbox.sendKeys("Test1234!");
        signinButon.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullanıcıAdi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullanıcıAdi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullanıcıAdi)){
            System.out.println("Expected Kullanıcı Testi Passed");
        }else {
            System.out.println("Expected Kullanıcı Testi FAILED");
        }
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressesElementTest=driver.findElement(By.linkText("Addresses"));
        WebElement signElementi=driver.findElement(By.linkText("Sign out"));
        if (addressesElementTest.isDisplayed()){
            System.out.println("Adresses Testi Passed");
        }else {
            System.out.println("Adresses Testi FAILED");
        }

        if (signElementi.isDisplayed()){
            System.out.println("Sign Testi PASSED");
        }else {
            System.out.println("Sign Testi FAILED");
        }
        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement>linkListesi=driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki Link Sayisi:"+linkListesi.size());

        //Linkleri yazdıralım
        // Listemiz webelementlerden olustugu icin, direk yazdirirsak referanslari yazdirir
        // onun yerine for-each loop yapip her bir link webelementinin uzerindeki yaziyi yazdirmaliyiz
        for (WebElement each:linkListesi
             ) {
            System.out.println(each.getText());
        }
    }
}
