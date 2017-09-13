package com.wiley.autotest.selenium.elements.upgrade.v3.conditions.window;

import com.wiley.autotest.ExpectedConditions2;
import org.openqa.selenium.WebDriver;

import java.util.function.Function;

public class WindowByUrl extends WindowFinder {

    public WindowByUrl(String url){
        super(url);
    }

    @Override
    public Function<WebDriver, String> findAndSwitch() {
        waitForChrome();
        return ExpectedConditions2.appearingOfWindowByUrl(locatedBy());
    }
}
