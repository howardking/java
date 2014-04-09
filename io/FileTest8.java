package cn.io;

import java.io.File;
import java.io.IOException;

public class FileTest8
{
    public static void main(String[] args) throws IOException {
        File file = new File("/home/howard/workspace/Test/src/cn/io" + File.separator + "hello1.txt");
        file.createNewFile();
        System.out.println(File.separator);
    }
}
