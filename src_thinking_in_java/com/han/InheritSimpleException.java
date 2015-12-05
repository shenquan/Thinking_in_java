package com.han;

/**
 * Created by HSQ on 2015/12/5.
 */
class SimpleException extends Exception {
}

public class InheritSimpleException {
    public void f() throws SimpleException{
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    public static void main(String[] args){
        InheritSimpleException sed=new InheritSimpleException();
        try {
            sed.f();
            System.out.println("不输出");
        }catch (SimpleException e){
            System.out.println("Caught it!");
        }

    }
}
