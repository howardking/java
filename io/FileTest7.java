package cn.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest7
{
    public static void main(String[] args) {
        File file = new File("/home/howard/workspace/Test/src/cn/io/");
        String[] names = file.list(new FilenameFilter(){
           @Override
           public boolean accept(File dir, String name) {
               // TODO Auto-generated method stub
               if(name.endsWith(".txt")){
                   return true;
               }
               return false;
           }
            
        });
        
        for (String str: names){
            System.out.println(str);
        }
    }
}
