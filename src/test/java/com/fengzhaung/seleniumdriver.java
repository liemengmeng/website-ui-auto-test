package com.fengzhaung;

import log4j.LoggerControler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumdriver {
 public static  WebDriver driver;
    static final LoggerControler log = LoggerControler.getLogger( seleniumdriver.class);

    public  static void open(String name){
        if (name.equals("chrome")){
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            driver=new ChromeDriver();
driver.manage().window().maximize();

        }else{
log.error("浏览器输入有误");
        }
    }
    //关闭页面
    public static void close(){
        driver.close();
    }

    //关闭所有相关资源
    public static void closeAll(){
        driver.quit();
    }
}
