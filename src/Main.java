import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

//    public WebDriver driver;

//    public void moWeb(){
//        driver = new ChromeDriver();
//        driver.get("https://www.google.ru/");
//    }
//
//    public void registerWithEmptyData(){
//        driver = new ChromeDriver();
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }
        WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

//    @Test
//    public void registerWithEmptyData(){
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

//    @Test
//    public void registerWithInvalidEmail(){
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("tran thai thong");
//        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("thong@gmail@com");
//        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("thong@gmail@com");
//        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09123456123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

//    @Test
//    public void registerWithIncorrectConfirmEmail(){
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("tran thai thong");
//        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("thaithong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("thong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09123456123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

//    @Test
//    public void registerWithPasswordLessThan6(){
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("tran thai thong");
//        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("thaithong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("thaithong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("12345");
//        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("12345");
//        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09123456123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

//    @Test
//    public void registerWithIncorrectConfirmPassword(){
//        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
//        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("tran thai thong");
//        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("thaithong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("thaithong@gmail.com");
//        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("12345g");
//        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09123456123");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//    }

    @Test
    public void registerWithIncorrectPhoneNumber(){
        driver.get("https://alada.vn/tai-khoan/dang-ky.html");
        driver.findElement(By.xpath("//input[@id='txtFirstname']")).sendKeys("tran thai thong");
        driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("thaithong@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtCEmail']")).sendKeys("thaithong@gmail.com");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtCPassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='txtPhone']")).sendKeys("09123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @AfterTest
    public void quit() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

}