import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid1 {
    public static void main(String[] args) throws MalformedURLException   {

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.3.18:4444"), new ChromeOptions());

        driver.get("https://www.google.se/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
    }


}
