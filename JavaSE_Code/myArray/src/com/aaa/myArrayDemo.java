package com.aaa;

import java.util.jar.JarOutputStream;
import java.util.Scanner;
import java.util.Random;

public class myArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random(10);

        int[] arr =new int[10];
        int x = sc.nextInt();
        int r = rc.nextInt();

        arr[0] = x;
        arr[1] = x;
        arr[2] = r;

        System.out.println(arr);
        System.out.println(r);
        for(int i =0;i <3;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
