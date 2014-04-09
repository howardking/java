package cn.io;

import java.io.File;
import java.io.IOException;

public class FileTest2
{
    public static void main(String[] args) {
        File file = new File("/home/howard/workspace/Test/src/cn/io/123");
        File file2 = new File(file, "Hello.txt");
        try {
//            file.createNewFile();
            file.mkdir();
            file2.createNewFile();
            System.out.println(file.isDirectory());
            System.out.println(file2.isFile());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
