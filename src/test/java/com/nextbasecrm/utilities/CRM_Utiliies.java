package com.nextbasecrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utiliies {
    //this method will login with helpdesk1@cybertekschool.com user when it is called
    public static void crm_login(WebDriver driver){
        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@type='text']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");
        //USERNAME                       PASSWORD
        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser
 //4. Enter valid password
        WebElement inputpassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputpassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

    public static void crm_login(WebDriver driver, String username ,String password){
        //3. Enter valid username
        WebElement inputUsername= driver.findElement(By.xpath("//input[@type='text']"));
        inputUsername.sendKeys(username);
        //USERNAME                       PASSWORD
        //helpdesk1@cybertekschool.com  UserUser
        //Helpdesk2@cybertekschool.com  UserUser
        //4. Enter valid password
        WebElement inputpassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputpassword.sendKeys(password);
        //5. Click to `Log In` button
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }

}
