package com.ghost.leetcode.array;

import java.io.File;

/**
 * @auther NorGhost
 * @date 2020/12/9 22:00
 * @description
 */
public class FileUtils {

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
          //递归删除目录中的子目录下
            for (int i=0; i<children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        // 目录此时为空，可以删除
        return dir.delete();
    }
}
