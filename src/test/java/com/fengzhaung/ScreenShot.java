package com.fengzhaung;

import log4j.LoggerControler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.Test;
import tools.MyFile;

import java.io.File;
import java.io.IOException;



/**
 *封装截图方法必须要继承SeleniumDrivers
 */
public class ScreenShot  {
    static final LoggerControler log = LoggerControler.getLogger(ScreenShot.class);
    static String path = System.getProperties().getProperty("user.dir") + "/error/";
    static WebDriver driver=seleniumdriver.driver;
    /**
     * 错误截图，通过日期命名的截图
     **/

    public static void screenShots( ) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        MyFile myFile=new MyFile();
   //     String myPath=path+String.valueOf(DateFormat.format(DateFormat.REPORT_CSV_FORMAT));
        System.out.print( path);
        myFile.createFile1( path);
        try {
            //FileUtils.copyFile(file,new File("D:\\testing\\webdriver_demo\\"+DateFormat.format(DateFormat.CHECK_LOG_FORMAT)+".jpg"));
            String times= String.valueOf(System.currentTimeMillis());
         FileUtils.copyFile(file,new File(path+ "/" +times+".jpg"));
        // FileUtils.copyFile(file,new File(path + "/" +DateFormat.format(CHECK_LOG_FORMAT ) + ".jpg"));
        } catch (IOException e) {
            log.error("截图失败！！");
            e.printStackTrace();
        }
    }
    /**
     * 错误截图,通过传入name来给截图命名
     **/
    public static void screenShots1(String name,WebDriver driver) {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            MyFile myFile = new MyFile();
            String times= String.valueOf(System.currentTimeMillis());
            myFile.createFile1(path );
            log.info(times);
            FileUtils.copyFile(file,new File(path + times + "/" + name + ".jpg"));
        } catch (IOException e) {
            log.error("截图失败！！");
            e.printStackTrace();
        }
    }
}




