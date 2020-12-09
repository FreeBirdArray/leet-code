package com.ghost.leetcode.array;



import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther NorGhost
 * @date 2020/12/9 21:00
 * @description
 */
public class Test {

    public static void main(String[] args) {
        try {
            String fileName = String.valueOf(System.currentTimeMillis());
            String filePath = "C:\\Users\\86187\\Desktop\\2.zip";
            String targetPath = "D:\\test\\"+fileName+"\\";
            //解压文件到指定文件夹
            ZipFileUtils.unzip(filePath,targetPath);
            //创建压缩文件
            ZipFile zip = ZipFileUtils.createZip(targetPath+fileName);
            File[] files =  new File(targetPath).listFiles();
            List<File> listFiles = new ArrayList<>();
            for (File listFile : files) {
                if (listFile.getAbsolutePath().endsWith(".mrc")) {
                    //将文件解密并转为txt文件

                    //将文件加到压缩包
                    //listFiles.add(new File());
                }
            }




            if (!CollectionUtils.isEmpty(listFiles)) {
                zip.addFiles(listFiles);
            }



            //删除文件
            FileUtils.deleteDir(new File(targetPath));


        } catch (ZipException e) {
            e.printStackTrace();
        }


    }
}
