package com.tow_day;

import java.util.ArrayList;

public class ArrayListDemo02{
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

//        System.out.println(array.remove("world"));//true
//        System.out.println(array.remove("javaee"));//false
        //以索引删除不要越界
       // System.out.println(array.remove(1));
        //修改值的时候不要越界
        System.out.println(array.set(1,"javaee"));

        System.out.println(array.get(1));
        //System.out.println(array.get(3));

        System.out.println(array.size());
        System.out.println("array:" + array);

    }
}
