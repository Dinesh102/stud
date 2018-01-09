package com.kgfsl.model;

import java.util.ArrayList;

public class studarr{
    public static void main(String []args){
        ArrayList<String> arr = new ArrayList<String>();
       creat(arr);
       remov(arr,"din6esh");
       update(arr);
    }
    public static void creat( ArrayList<String> arr){
        arr.add("dinesh");
        arr.add("sandep");
        arr.add("kisore");
        arr.add("pravin");
        disp(arr);
    }
    public static void disp( ArrayList<String> arr){
        System.out.println(arr);
    }
    public static void remov( ArrayList<String> arr,String nam){
        int x=arr.indexOf(nam);
        if(x==-1){
            System.out.println("there is no such element");
        }else
        arr.remove(x);
        disp(arr);
    }
    public static void update( ArrayList<String> arr){
    
        arr.set(1,"meags");
        disp(arr);
    }

}