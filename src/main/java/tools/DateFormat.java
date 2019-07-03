package tools;

import log4j.LoggerControler;

import java.text.SimpleDateFormat;
import java.util.Date;

import static log4j.LoggerControler.getLogger;
/*
日期类封装
时间戳生成:
System.currentTimeMillis();
 */


public   class  DateFormat {
        final static LoggerControler log= getLogger(tools.DateFormat.class);
        public static final String ZH_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
        public static final String ZN_DATE_FORMAT="yyyy年MM月dd日 HH:mm:ss";
        public static final String ZC_DATE_FORMAT="yyyy年MM月dd日";
        public static final String SHORT_DATE_FORMAT = "yy-MM-dd HH:mm";
        public static final String CHECK_LOG_FORMAT = "yyyyMMdd";
        public static final String REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";
        private static SimpleDateFormat simpleDateFormat;

        public static String format(String type){
            simpleDateFormat=new SimpleDateFormat();
            String s=simpleDateFormat.format(new Date());
            log.info("当前时间为："+s);
            return s;
        }
        public static String time(){
            long currtime= System.currentTimeMillis()/100;
            String randomNum=String.valueOf(currtime);
            log.info("11位的随机数为："+randomNum);
            return randomNum;
        }
    }

