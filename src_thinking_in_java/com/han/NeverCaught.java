package com.han;

/**
 * Created by HSQ on 2015/12/5.
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f() kkkk");
    }
    static void g(){
        try {
            f();
        }catch (RuntimeException e){
            System.out.println("caught RuntimeException");
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        g();
    }
}
