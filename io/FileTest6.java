package cn.io;

import java.io.File;

public class FileTest6
{
    public static void main(String[] args) {
        File file = new File("/home/howard/workspace/Test/src/cn/io/");
        String[] names = file.list();
        for (String name:names){
            if(name.endsWith(".java")){
                System.out.println(name);
            }
        }
    }
}
