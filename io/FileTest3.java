package cn.io;

import java.io.File;

public class FileTest3
{
    public static void main(String[] args) {
        File file = new File("/home/howard/workspace/Test/src/cn/io/");
        System.out.println(file.mkdirs());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        
    }
}
