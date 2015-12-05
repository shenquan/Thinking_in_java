package com.han;

/**
 * Created by HSQ on 2015/12/5.
 */
class ThreeException extends Exception {

}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            } catch (ThreeException e) {
                System.out.println("Caught ThreeException");
            } finally {

                if (count == 2) {
                    System.out.println("End while()");
                    break;
                }
                System.out.println("In finally clause");
            }
        }
    }
}
