package com.nextbasecrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Click_Verify_RadioButton {

    public static void clickAndVerifyRadioButton(WebDriver driver ,String nameAttrib, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttrib));
//loop through the List and select the matching one
        for (WebElement each : radioButtons) {
            String eachId= each.getAttribute("id");
            if(eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+" is selected : " + each.isSelected());
                break;
            }
        }
    }
}
