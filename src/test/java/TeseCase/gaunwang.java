package TeseCase;

import Logic.MainPage;
import com.fengzhaung.seleniumdriver;
import org.testng.annotations.Test;

public class gaunwang  extends seleniumdriver {
    @Test
    public static void show1() {

        MainPage.news();
    }

    @Test
    public static void show2() {
        MainPage.PlatformValue();

    }

    @Test
    public static void show3() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MainPage.userType();
    }

    @Test
    public static void show4() {
        MainPage.Scene();
    }

    @Test
    public static void show5() {
        MainPage.technical();

    }

    @Test
    public static void show6() {
        MainPage.SocialValue();
    }
}
