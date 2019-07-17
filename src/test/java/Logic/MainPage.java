package Logic;

import MyAssert.MyAssert;
import com.fengzhaung.seleniumdriver;
import org.openqa.selenium.By;
import pages.Mainpage;


import java.util.Set;

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
            Thread.sleep(1000);
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
                String text1=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals( text1,"找施工找产品");
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
                String text2=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals(text2,"工程案例展示");
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
                String text3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div[2]/div[2]/div/div[3]/h1")).getText();
                MyAssert.assertEquals(text3,"产品案例展示");
                //关闭当前页面
                seleniumdriver.close();


            }

        }
        driver.switchTo().window(h1);
        //前往下一页(场景)
        com.fengzhaung.actions.clik(Mainpage.xiala);

    }
    //场景
public static void Scene(){

        com.fengzhaung.actions.clik(Mainpage.bangonglou);
        //前往下一页(技术特点)
        com.fengzhaung.actions.clik(Mainpage.xiala);
}
//技术特点
    public static void technical(){
        com.fengzhaung.actions.clik(Mainpage.next);
        com.fengzhaung.actions.clik(Mainpage.next);
        com.fengzhaung.actions.clik(Mainpage.prev);
        com.fengzhaung.actions.clik(Mainpage.prev);
        com.fengzhaung.actions.clik(Mainpage.tedian);
        Set<String> handles4 = driver.getWindowHandles();
        String h1 = driver.getWindowHandle();
        for (String handles:handles4){
            if (handles.equals(h1)){
                continue;
            }else{
                driver.switchTo().window(handles);
                String text=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/h1")).getText();
                MyAssert.assertEquals(text,"人工智能：便捷的综合能源订单");
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
    public static void SocialValue(){
        com.fengzhaung.actions.clik(Mainpage.nexts);
        com.fengzhaung.actions.clik(Mainpage.prevs);
        com.fengzhaung.actions.clik(Mainpage.zeren);
        String h1=driver.getWindowHandle();
        Set<String> handles=driver.getWindowHandles();
        for (String handle:handles){
            if (handle.equals(h1)){
                continue;
            }else{
                driver.switchTo().window(handle);
                String text= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[1]/h1")).getText();
                MyAssert.assertEquals(text,"对国家");
                seleniumdriver.close();
            }
        }
driver.switchTo().window(h1);
        //前往下一页(底页)
        com.fengzhaung.actions.clik(Mainpage.xiala);
        //返回到顶部
        com.fengzhaung.actions.clik(Mainpage.logo);

    }


}