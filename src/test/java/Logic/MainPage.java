package Logic;

import MyAssert.MyAssert;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;




import pages.Mainpage;


import java.util.Set;

import static pages.Mainpage.ruzhu;

public class MainPage extends seleniumdriver {


    //首页+新闻
    public static void news() {
        //点击下载按钮二维码打开
        com.fengzhaung.actions.clik(Mainpage.xiazai);
        //前往下一页
        com.fengzhaung.actions.clik(Mainpage.xiala);
        //点击优能栈logo返回到首页

        com.fengzhaung.actions.clik(Mainpage.logo);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //进入新闻页面
        com.fengzhaung.actions.clik(Mainpage.xiala);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //进入新闻详情页面
        com.fengzhaung.actions.clik(Mainpage.xiangqing);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //获取当前页面句柄
        String h1 = driver.getWindowHandle();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //获取所有页面句柄
        Set<String> handles = driver.getWindowHandles();
        //循环句柄
        for (String handle : handles) {
            if (handle.equals(h1)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                com.fengzhaung.actions.clik(Mainpage.down);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                com.fengzhaung.actions.clik(Mainpage.up);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //关闭新闻详情页
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seleniumdriver.close();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //切换到原来的句柄
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().window(h1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //前往下一页（平台价值）
        com.fengzhaung.actions.clik(Mainpage.xiala);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //平台价值
    public static void PlatformValue() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.right);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.right);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.right);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.left);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.left);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.left);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.pingtai);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //前往下一页(用户类型)
        com.fengzhaung.actions.clik(Mainpage.xiala);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//用户类型

    public static void userType() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        com.fengzhaung.actions.clik(Mainpage.yezhu);
        String h1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String handle : handles1) {
            if (h1.equals(handle)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String text1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals(text1, "找施工找产品");
                //关闭当前页面
                seleniumdriver.close();


            }

        }
        driver.switchTo().window(h1);
        com.fengzhaung.actions.clik(Mainpage.fuwushang);
        Set<String> handles2 = driver.getWindowHandles();
        for (String handle : handles2) {
            if (h1.equals(handle)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String text2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals(text2, "工程案例展示");
                //关闭当前页面
                seleniumdriver.close();


            }

        }
        driver.switchTo().window(h1);
        com.fengzhaung.actions.clik(Mainpage.gongying);
        Set<String> handles3 = driver.getWindowHandles();
        for (String handle : handles3) {
            if (h1.equals(handle)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String text3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals(text3, "产品案例展示");
                //关闭当前页面
                seleniumdriver.close();


            }

        }
        driver.switchTo().window(h1);
        //前往下一页(场景)
        com.fengzhaung.actions.clik(Mainpage.xiala);

    }

    //场景
    public static void Scene() {

        com.fengzhaung.actions.clik(Mainpage.bangonglou);
        //前往下一页(技术特点)
        com.fengzhaung.actions.clik(Mainpage.xiala);
    }

    //技术特点
    public static void technical() {
        com.fengzhaung.actions.clik(Mainpage.next);
        com.fengzhaung.actions.clik(Mainpage.next);
        com.fengzhaung.actions.clik(Mainpage.prev);
        com.fengzhaung.actions.clik(Mainpage.prev);
        com.fengzhaung.actions.clik(Mainpage.tedian);
        Set<String> handles4 = driver.getWindowHandles();
        String h1 = driver.getWindowHandle();
        for (String handles : handles4) {
            if (handles.equals(h1)) {
                continue;
            } else {
                driver.switchTo().window(handles);
                String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/h1")).getText();
                MyAssert.assertEquals(text, "人工智能：便捷的综合能源订单");
                //关闭当前页面
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //前往下一页(全球市场布局)
        com.fengzhaung.actions.clik(Mainpage.xiala);
        //前往下一页(社会责任)
        com.fengzhaung.actions.clik(Mainpage.xiala);

    }


    //社会责任
    public static void SocialValue() {
        com.fengzhaung.actions.clik(Mainpage.nexts);
        com.fengzhaung.actions.clik(Mainpage.prevs);
        com.fengzhaung.actions.clik(Mainpage.zeren);
        String h1 = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (handle.equals(h1)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[1]/h1")).getText();
                MyAssert.assertEquals(text, "对国家");
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //前往下一页(底页)
        com.fengzhaung.actions.clik(Mainpage.xiala);
        //返回到顶部
        //   com.fengzhaung.actions.clik(Mainpage.logo);

    }



    public static void dibu() throws InterruptedException {
        Thread.sleep(2000);
        com.fengzhaung.actions.clik(Mainpage.lianxi);


        String h1 = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (handle.equals(h1)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/p[1]")).getText();
                MyAssert.assertEquals(text, "联系我们：0571-28284217");
                seleniumdriver.close();
            }
        }

        driver.switchTo().window(h1);
        //点击进入会员平台
        com.fengzhaung.actions.clik(Mainpage.shop);
        Set<String> handles1 = driver.getWindowHandles();
        for (String handle : handles1) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                //校验登录按钮是否存在
                Thread.sleep(1000);
                String text1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[2]/form/button/span")).getText();
                MyAssert.assertEquals(text1, "登录");
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //点击进入入驻平台页面
        com.fengzhaung.actions.clik(ruzhu);
        Set<String> handles2 = driver.getWindowHandles();
        for (String handle : handles2) {
            if (handle.equals(h1)) {
                continue;
            } else {
                driver.switchTo().window(handle);
                String ruzhu = driver.getWindowHandle();
                String text2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div/button")).getText();
                MyAssert.assertEquals(text2, "立即开通");
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div/button")).click();
                driver.findElement(By.linkText("账号密码登录")).click();
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div/form/input[1]")).sendKeys("15968823223");
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div/form/input[2]")).sendKeys("lmm123456");
                //点击登录按钮
        com.fengzhaung.actions.clik(Mainpage.login);
                Thread.sleep(1000);
                //勾选协议
                com.fengzhaung.actions.clik(Mainpage.xieyi);
                //选择19800套餐
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div[1]/div[2]/ul/li[3]")).click();
                //选择微信支付
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div[1]/div[3]/div[1]")).click();
                Thread.sleep(1000);
                //点击确认支付
                //  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div[2]/button")).click();
                //driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[5]/button[2]")).click();
                //点击更换账号
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/a")).click();
                Thread.sleep(1000);
                //点击注册
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div/div[2]/div[3]/div/div[2]/a[2]")).click();
                Set<String> handles3 = driver.getWindowHandles();
                for (String han : handles3) {
                    if (han.equals(h1)) {
                        continue;
                    } else if (han.equals(ruzhu)) {
                        seleniumdriver.close();
                        continue;
                    } else {
                        driver.switchTo().window(han);
                        String text4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div[2]/div/h2")).getText();
                        MyAssert.assertEquals(text4, "欢迎注册优能栈平台");
                    }
                }
                seleniumdriver.close();

            }

        }
        driver.switchTo().window(h1);
        //点击招募合伙人
        com.fengzhaung.actions.clik(Mainpage.zhaomu);
        Set<String> handles4 = driver.getWindowHandles();
        for (String handle : handles4) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                //点击城市合伙人选项卡
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div/div[2]/div/p")).click();
                Thread.sleep(2000);
                //获取标题文本
                String title1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div[2]/div/h2")).getText();
                MyAssert.assertEquals(title1, "招募“城市合伙人”");
//点击客户合伙人
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[1]/div/div[3]/div/p")).click();
                Thread.sleep(1000);
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //点击今日头条
        com.fengzhaung.actions.clik(Mainpage.toutiao);
        Set<String> handles5 = driver.getWindowHandles();
        for (String handle : handles5) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //点击百度新闻
        com.fengzhaung.actions.clik(Mainpage.baiduNews);
        Set<String> handles6 = driver.getWindowHandles();
        for (String handle : handles6) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //点击搜狐新闻
        com.fengzhaung.actions.clik(Mainpage.souhuNews);
        Set<String> handles7 = driver.getWindowHandles();
        for (String handle : handles7) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
        //点击公司介绍
        com.fengzhaung.actions.clik(Mainpage.jieshao);
        Set<String> handles8 = driver.getWindowHandles();
        for (String handle : handles8) {
            if (handle.equals(h1)) {
                continue;
            } else {
                Thread.sleep(2000);
                driver.switchTo().window(handle);
                seleniumdriver.close();
            }
        }
        driver.switchTo().window(h1);
    }
}