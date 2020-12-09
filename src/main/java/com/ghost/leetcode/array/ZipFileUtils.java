package com.ghost.leetcode.array;



import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.util.List;

/**
 * @auther NorGhost
 * @date 2020/12/9 20:38
 * @description
 */
public class ZipFileUtils {



    public static ZipFile createZip(String path)  {
        return new ZipFile(path+".zip");
    }

    /**
     * 解压指定文件
     * @param path
     * @param targetPath
     */
    public static void unzip(String path,String targetPath) throws ZipException {
            ZipFile zipFile = new ZipFile(path);
            zipFile.extractAll(targetPath);
    }


}
