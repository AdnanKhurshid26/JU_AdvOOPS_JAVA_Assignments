package com.company;

class ShowNumber{
    public static void show(int a){
        System.out.println(a);
    }
    public static void show(double a){
        System.out.println(a);
    }
}

public class q6 {
    public static void main(String[] args) {
        
        short s = 10;
        double d = 12.2;

        ShowNumber.show(s);
        ShowNumber.show(d);
    }

   
}
