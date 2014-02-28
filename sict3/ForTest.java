package cn.sict3;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest
{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");
        for(int i:arr){
            System.out.println(i);
        }
        
        String[] string = {"aa", "bb", "cc", "dd", "ee", "ff"};
        for(String str : string){
            System.out.println(str);
        }
        
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};
        
        for(int[] arr3 : arr2){
            for(int i : arr3){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
        
        
        System.out.println("---------------------");
        
        Collection<String> col = new ArrayList<String>();
        col.add("aa");
        col.add("two");
        col.add("Three");
        
        for (String str : col){
            System.out.println(str);
        }
    }   
}
