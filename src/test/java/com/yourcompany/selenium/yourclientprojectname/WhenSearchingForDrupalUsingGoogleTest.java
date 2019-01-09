//package com.yourcompany.selenium.yourclientprojectname;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
//
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;
//
//public class WhenSearchingForDrupalUsingGoogleTest {
////    private static WebDriver driver;
////
////    @BeforeClass
////    public static void setup() {
////        System.setProperty("webdriver.chrome.driver", "E:\\qa\\chromedriver_win32\\chromedriver.exe");
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////        driver.get("https://mail.ukr.net/desktop/login");
////    }
////    @Test
////    public void userLogin() {
////        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"id-1\"]"));
////        loginField.sendKeys("autotestorgua");
////        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"id-2\"]"));
////        passwordField.sendKeys("testpass");
////        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/main/form/button"));
////        loginButton.click();
////        WebElement profileUser = driver.findElement(By.cssSelector(".login-button__user"));
////        String mailUser = profileUser.getText();
////        Assert.assertEquals("autotestorgua@ukr.net", mailUser);
////    }
////    @AfterClass
////    public static void tearDown() {
////        WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
////        menuUser.click();
////        WebElement logoutButton = driver.findElement(By.id("login__logout"));
////        logoutButton.click();
////        driver.quit();
////    }
//
//    public static void main(String[] args) throws MalformedURLException {
//        // Создаем экземпляр WebDriver
//        // Следует отметить что скрипт работает с интерфейсом,
//        // а не с реализацией.
//
////        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
////        Map<String, Object> options = new HashMap<String, Object>();
////        ArrayList<String> args2 = new ArrayList<String>();
////        args2.add("enable-automation");
////        args2.add("test-type=browser");
////        args2.add("disable-plugins");
////        args2.add("disable-infobars");
////        args2.add("window-size=1920x1080");
////        options.addArguments("--no-sandbox");
////        options.addArguments("--disable-dev-shm-usage");
////        options.put("args", args2);
////
////        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
////
////        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.120:4444/wd/hub"), capabilities);
////        driver.manage().window().maximize();
//
////        DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
////        System.setProperty("webdriver.chrome.driver", "http://192.168.120:4444/wd/hub");
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("start-maximized"); // open Browser in maximized mode
////        options.addArguments("disable-infobars"); // disabling infobars
////        options.addArguments("--disable-extensions"); // disabling extensions
////        options.addArguments("--disable-gpu"); // applicable to windows os only
////        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
////        options.addArguments("--no-sandbox"); // Bypass OS security model
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//
//        Map<String, Object> baseState = new HashMap<String, Object>();
////        baseState.put("type", "NATIVE");
////        baseState.put("executable", APP);
////        baseState.put("locator", "//Window");
//
////        capabilities.setCapability("appdriver-basestate", baseState);
//
//        Map<String, Object> options = new HashMap<String, Object>();
////        options.put("closeOnQuit", true);
////
////        capabilities.setCapability("appdriver-options", options);
//
//
//
////        ChromeOptions options = new ChromeOptions();
////        options.addArguments("–no-sandbox");
////        options.addArguments("–disable-dev-shm-usage");
//        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.120:4444/wd/hub"), capabilities);
//        driver.get("https://google.com");
////        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////
////        driver.get("https://freebooksummary.com/");
////        driver.findElement(By.className("search_submit")).click();
////
////        new Actions(driver).moveToElement(driver.findElementByClassName("search__toggle")).click();
////        driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/form/div/input")).sendKeys("test");
////        driver.findElement(By.xpath("/html/body/div[3]/div/header/div[2]/form/div/input")).submit();
////
////        // Ожидаем увидеть: "Selenium - Google Search"
////        System.out.println("Page title is: " + driver.getTitle());
//
//        driver.get("https://freebooksummary.com/lord-of-the-flies-77-5719");
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/div/div[1]/article/section[1]/div[2]/div[2]/div[2]/a")).click();
//
////        WebDriverWait wait = new WebDriverWait(driver, 5);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"modal1\"]/div[2]/a")));
//
//        Assert.assertEquals("BECOME A MEMBER", driver.findElement(By.xpath("//*[@id=\"modal1\"]/div[2]/a")).getText());
//
//        System.out.println(driver.findElement(By.xpath("//*[@id=\"modal1\"]/div[2]/a")).getText());
//        // Закрываем браузер
//        driver.quit();
//    }
//
//    private static WebDriver createRemoteDriver(String url, DesiredCapabilities caps, Boolean checkForProxy,
//                                                Properties props) {
//        try {
//            if (isAppiumNative(url, caps.asMap())) {
//                if (isAndroidNative(caps.asMap())) {
//                    return new io.appium.java_client.android.AndroidDriver(new URL(url), caps);
//                } else if (isIOSNative(caps.asMap())) {
//                    return new io.appium.java_client.ios.IOSDriver(new URL(url), caps);
//                }
//            }
//            if (url == null) {
//                return new RemoteWebDriver(caps);
//            }
//            if (checkForProxy) {
//                return new RemoteWebDriver(RemoteProxy.getProxyExecutor(new URL(url), props), caps);
//            }
//            return new RemoteWebDriver(new URL(url), caps);
//        } catch (MalformedURLException ex) {
//            Logger.log(Level.SEVERE, ex.getMessage(), ex);
//        }
//        return null;
//    }
//
//
//    private static boolean isAppiumNative(String remoteUrl, Map props) {
//        return toLString(remoteUrl).matches(".*/wd/hub.*") && props != null
//                && props.containsKey("platformName") && toLString(props.get("platformName")).matches("android|ios")
//                && (!props.containsKey("browserName") || isNullOrEmpty(props.get("browserName")));
//    }
//
//    private static boolean isAndroidNative(Map props) {
//        return toLString(props.get("platformName")).matches("android");
//    }
//
//    private static boolean isIOSNative(Map props) {
//        return toLString(props.get("platformName")).matches("ios");
//    }
//
//}