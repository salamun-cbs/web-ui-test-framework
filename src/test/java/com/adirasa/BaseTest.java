package com.adirasa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;

    protected void getDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless"); // aktifkan code unt dijalankan secara headless

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        // dipakai jika tampilan browser ingin dilihat/dijalankan normal, tapi dalam proses Pipeline,
        // kita tidak bisa menjalankan program secara normal, harus dijalankan secara headless.
        // berguna untuk implementasi di CI/CD
//        driver = WebDriverManager.chromedriver().create();
    }
}
