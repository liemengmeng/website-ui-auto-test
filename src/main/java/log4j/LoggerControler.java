package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
lig4j读取配置文件方法
 */

public class LoggerControler {
    private static Logger logger = null;
    private static LoggerControler logg = null;

    public static LoggerControler getLogger(Class<?> T) {
        if (logger == null) {
            //处理配置文件，实例化 Properties处理.Properties文件
            Properties props = new Properties();
            try {
                //获取log4j配置文件路径
                String path = System.getProperty("user.dir");
                String filepath = path + "/configs/log4j.properties";
                InputStream is = new FileInputStream(filepath);
                props.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
            PropertyConfigurator.configure(props);
            logger=  Logger.getLogger(String.valueOf(T));
            logg=new LoggerControler();
        }
        return logg;
    }
    /*
    重写logger方法
     */
    public static void debug(String msg) {
        logger.debug(msg);
    }
    public static void info(String msg){
        logger.info(msg);
    }
    public static void error(String msg) {
        logger.error(msg);
    }
    public static void warn(String msg) {
        logger.warn(msg); }
}
