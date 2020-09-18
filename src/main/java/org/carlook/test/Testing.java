package org.carlook.test;

import org.carlook.controller.UserControl;
import org.carlook.model.objects.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing{
    @Test
    public void testSeleniumJava() throws Exception {

        // Point to Path for chromedriver on your Computer
        String driverpath = "/Users/martinmuller/Downloads/chromedriver85";

        System.setProperty("webdriver.chrome.driver", driverpath);

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 4);

        driver.get("http://localhost:8080/Carlook_war_exploded");

        UserDTO userDTO = UserControl.getRndUser();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys(userDTO.getEmail());
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys(userDTO.getPassword());
        driver.findElement(By.className("loginButton")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("header_main_menuBox_headLabel")));
        driver.close();
    }

}
