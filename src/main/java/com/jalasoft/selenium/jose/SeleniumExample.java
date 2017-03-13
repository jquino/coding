package com.jalasoft.selenium.jose;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.stream.Collectors;

/**
 * Created by Jose Rioja on 3/10/2017.
 */
public class SeleniumExample {
    private static final int INDEX = 3;

    /**
     * Is is the first tests with Selenium.
     */
    @Test
    public void testSelenium() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Open Chrome app

        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Jose");
        WebElement lastNameTextField = driver.findElement((By.name("lname")));
        System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTextField.isEnabled());

        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value = 'Bike']"));

        // select checkbox
        if (!bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
        }

        // clear checkbox
        if (bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
        }

        WebElement maleRadioButton = driver.findElement(By.cssSelector("input[value='male']"));
        maleRadioButton.click();

        Select selectBox = new Select(driver.findElement(By.xpath("//select")));
        selectBox.selectByValue("UK");
        selectBox.selectByVisibleText("Opel");
        selectBox.selectByIndex(INDEX);

        Select fromLB = new Select(driver.findElement(By.cssSelector("select[name = 'FromLB']")));
        Select toLB = new Select(driver.findElement(By.cssSelector("select[name = 'ToLB']")));
        WebElement addButton = driver.findElement(By.cssSelector("input[onclick = 'move(this.form.FromLB,"
                + "this.form.ToLB)']"));
//        WebElement removeButton = driver.findElement(By.cssSelector("input[onclick = 'move(this.form.ToLB,"
//                + "this.form.FromLB)']"));

        if (!toLB.getOptions().stream().map(option -> option.getAttribute("value")).collect(Collectors.toList())
                .contains("MEX")) {
            fromLB.selectByValue("MEX");
            addButton.click();
        }
    }
}
