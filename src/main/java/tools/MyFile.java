package tools;

import log4j.LoggerControler;

import java.io.File;

import static log4j.LoggerControler.getLogger;

/*
文件处理类封装
 */
public class MyFile {
        final static LoggerControler log= getLogger(ExcelUtil.class);
        //判断文件是否存在
        public static boolean fileExist(String filePath){
            return new File(filePath).exists();
        }
        //先判断文件是否存在，没有就创建文件
        public static void createFile1(String filePath){
            if (!MyFile.fileExist(filePath)){
                File file=new File(filePath);
                file.mkdir();
                log.info("新文件创建成功");
            }
        }
        //删除目录以及目录下所有的文件和文件夹
        public static void deleteDirectory(String directoryPath){
            File file=new File(directoryPath);
            //文件是文件夹
            if(file.isDirectory()){
                File file1=null;
                //获取该目录下的子文件和文件夹
                String[] childsFile=file.list();
                for (String s:childsFile){
                    //检查foldPath是否是以“\”结尾
                    if (directoryPath.endsWith((File.separator))){
                        file1=new File(directoryPath+s);
                    }else {
                        file1=new File(directoryPath+File.separator+s);
                    }
                    //判定是否是文件
                    if(file1!=null&&file1.isFile()){
                        file1.delete();
                        file1.getAbsolutePath();
                    }else if(file1!=null&&file1.isDirectory()){   //是文件夹
                        deleteDirectory(file1.getAbsolutePath());
                    }
                }
                file.delete();
            }else if (file.isFile()){
                file.delete();
            }
        }
    }