package cn.io;

import java.io.File;
import java.io.IOException;

public class FileTest1
{
    public static void main(String[] args) throws IOException {
        File file = new File("/home/howard/workspace/Test/src/cn/io/test.txt");
        File file1 = new File("/home/howard/workspace/Test/src/cn/io/", "test1.txt");
//        File file1 = new File("/home/howard/workspace/Test/src/cn/io/test1.txt");
//        File file2 = new File(File.pathSeparatorChar + "abc.txt");
        System.out.println(file.createNewFile());
        System.out.println(file1.createNewFile());
        System.out.println(File.pathSeparatorChar);
//        System.out.println(file2.createNewFile());
//        System.out.println(file.renameTo(file1));
//        System.out.println(file1.renameTo(file));
    }
}
