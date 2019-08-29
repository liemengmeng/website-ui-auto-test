package pages;

import org.openqa.selenium.By;

public class Mainpage {
    //主页新闻
    //下拉箭头
    public static By xiala=By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div");
    //点击下载客户端
    public static By xiazai=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div/div/div");
    //优能栈logo
    public static By logo=By.xpath("//*[@id=\"app\"]/div/div/div/header/div/div");
    //进入新闻详情(图片)
    public  static By xiangqing=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[2]/div");
    //新闻详情
    //新闻详情页上一篇
    public static By up=By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[2]/div[2]/button[1]");
    //新闻详情页下一篇
    public static By down=By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[2]/div[2]/button[2]");
    //平台价值向右
    public static By right =By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[3]/div/div/div[2]/div[4]");

    //平台价值向左
    public static By  left=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[3]/div/div/div[2]/div[3]");
    //点击（第一篇）
    public static By pingtai =By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[3]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/p");
//用户类型
    //用户类型第一篇（建筑业主）
public static By yezhu=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[4]/div/div/div[2]/ul/li[1]/a/div[1]");

    //用户类型第一篇（工程服务商）
    public static By fuwushang=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[4]/div/div/div[2]/ul/li[2]/a/p");
    //用户类型第一篇（产品供应商）
    public static By gongying=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[4]/div/div/div[2]/ul/li[3]/a/p");


    //场景
    //场景第一篇（办公楼）
    public static By bangonglou=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[5]/div/div/div[2]/div/ul/li[1]/div[1]/div[3]");


    //技术特点
    public static By  next=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[6]/div/div/div[2]/div[4]");
    public static By  prev=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[6]/div/div/div[2]/div[3]");
    //进入详情（人工智能）第二篇
    public static By  tedian=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[6]/div/div/div[2]/div[2]/div/div[2]/div/a/div");


    //社会责任
    //右滑
    public static By nexts=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[8]/div/div/div/div[2]/div/div/div[4]");
    //左滑
public static By prevs=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[8]/div/div/div/div[2]/div/div/div[3]");
//打开详情
    public static By zeren=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[8]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div/a/div/div");

    //页面底部
    //联系方式
    public static By lianxi=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[4]/div[2]/span/a/p");
    //联系我们页面-联系我们
    public static By getLianxi=By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/p[1]");

    //开放平台
    //商家后台
    public static By shop=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/span[1]/p");
    //入驻平台
    public static By ruzhu=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/span[2]/a/p");
    public static By login =By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div/form/button");
    public static By xieyi =By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div/div[3]/div/a[1]");
    //招募合伙人
    public static By zhaomu=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[3]/div[2]/span[3]/a/p");

//新闻及媒体
    //今日头条
public static By toutiao=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/span[1]/p");
//百度新闻
public static By baiduNews=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/span[2]/p");
//搜狐新闻
    public static By souhuNews=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[2]/div[2]/span[3]/p");


    //关于优能栈
    //公司介绍
    public static By jieshao=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[8]/div/div/div/div[3]/div/div/div[1]/div[1]/div[2]/span[1]/a/p");

        }
