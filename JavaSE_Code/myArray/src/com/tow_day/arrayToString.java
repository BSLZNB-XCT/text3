package com.tow_day;

public class arrayToString{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        String s = arrayToStringTest(arr);

        System.out.println("s:" +s);
    }

    public static String arrayToStringTest(int[] arr){
        String s = "";

        s += '[';
        for(int i =0;i < arr.length;i++){
            if(i == arr.length -1){
                s += arr[i];
            }else{
                s += arr[i];
                s += ", ";
            }
        }
        s += ']';
        return s;
    }
}
