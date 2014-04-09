package cn.io;

import java.io.File;

public class FileTest4
{
    public static void main(String[] args) {
        File file = new File("/home/howard/workspace/Test/src/cn/io/test1.txt");
//        String[] names = file.list();
//        for(String str: names){
//            System.out.println(str);
//        }
        System.out.println(file.delete());
//        File[] files = file.listFiles();
//        
//        for (File f:files){
//            System.out.println(f.getName());
//            System.out.println(f.getParent());
//        }
    }
}
