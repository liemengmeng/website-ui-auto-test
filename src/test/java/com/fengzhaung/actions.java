package com.fengzhaung;

import org.openqa.selenium.By;
/*
二次封装selenium方法
 */
public class actions {
    //二次封装点击
    public static void clik(By by) {
        //点击的同时还会智能等待
        dengdai.findElement(by).click();

        }
    //二次封装输入方法
    public static void senkeys(By by,String text){
        dengdai.findElement(by).sendKeys("text");
    }
//获取文本内容
    public static String getText(By by){
        String text=dengdai.findElement(by).getText();
        return text;
    }

}
