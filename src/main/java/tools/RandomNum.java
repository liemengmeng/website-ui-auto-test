package tools;
import log4j.LoggerControler;

import java.util.Random;

/*
随机数封装
 */
public class RandomNum {

        //生成N位数的一个随机数
        static LoggerControler log= LoggerControler.getLogger(RandomNum.class);
        public static String getNumRandom(int length){
                String num="";
                //random生成0-1的随机数，*10的多少次方后转为int类型，在转换为String类型
                num= String.valueOf((int)(Math.random()*Math.pow(10,length)));
         log.info("生成的随机数是"+length);
                return num;
        }
        //生成x到x的随机数

        public static  long getNumRandom(int min,int max){
                long num=0;
                Random random=new Random();
                //random,nextInt生成min-max的值包含min，但不包含max
            num=random.nextInt(max-min+1)+min;
            return num;
        }


        //生成随机数字和字母
        public static String getStringRandom(int length) {
                String val = "";
                Random random = new Random();
                for (int i = 0; i < length; i++) {
                        String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
                        if ("char".equals(charOrNum)) {
                                //65,97对应阿斯科码值
                                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                                //生成一个字母
                                val += (char) (random.nextInt(26) + temp);
                        } else if ("num".equals(charOrNum)) {
                                //生成0-9的数字
                                val += String.valueOf(random.nextInt(10));
                        }
                }
                return val;
        }
}


