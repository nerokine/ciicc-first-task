package chapter1;
import java.util.*;

public class javabasic {
    public static void main (String[] args) {
        System.out.println("hello world");
        Random r = new Random();
    // this is a single line comment

        /*
         *this
         is 
         a 
         multi line
         comment 
         */
    }
}

class Car {
    int year;
    String make;
    String model;
    String color;
}

class Basic2 {
    javabasic  jv;
    Car car1 = new Car();
    Car car2 = new Car();
}
