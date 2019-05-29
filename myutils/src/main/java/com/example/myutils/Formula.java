package com.example.myutils;

public class Formula {

    public static  int plus(int a,int b)
    {
        return a+b;
    }

    public static  int minus(int a,int b)
    {
        return a-b;
    }

    public static  int multiply(int a,int b)
    {
        return a*b;
    }

    public static float  divide(int a,int b)
    {
        if (b==0)
            throw  new IllegalArgumentException("Divide by Zero Error");
        else
            return a/b;
    }


}
