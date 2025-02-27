package com.adirasa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By loginMessage = By.cssSelector(".error-message-container h3");

    // Konstruktor untuk inisialisasi driver dan elemen
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        WebElement userInput = driver.findElement(usernameInputText);
        userInput.clear();
        userInput.sendKeys(username);
    }

    public void inputPassword(String password) {
        WebElement userInput = driver.findElement(passwordInputText);
        userInput.clear();
        userInput.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }

    // Ambil pesan error atau status login
    public String getLoginMessage() {
        try {
            return driver.findElement(loginMessage).getText();
        } catch (Exception e) {
            return "Login successful"; // Jika tidak ada error, anggap login berhasil
        }
    }
}
