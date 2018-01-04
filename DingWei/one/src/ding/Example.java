package ding;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String pw=scanner.nextLine();
        char[] a=pw.toCharArray();
        for(int i=0;i<a.length;i++){
            a[i]=(char)(a[i]^5);
        }
        System.out.println("加密后:");
        System.out.println(new String(a));
    }
}
