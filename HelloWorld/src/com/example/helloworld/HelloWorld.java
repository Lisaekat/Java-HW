package com.example.helloworld;

public class HelloWorld<println> {
    public static void main(String[] args) {
//        int boss = name(5, 10, 3, 4);
//        boss = boss + 1;
//        boss += 1;
//        System.out.println(boss);
//        System.out.println(check(10,15));
//        tale(5);
//        tale(-5);
//        System.out.println(number(2));
//        System.out.println(number(-2));
//        hello( "Леся");
        System.out.println(year(2020));
        System.out.println(year(2019));
        System.out.println(year(2000));
        System.out.println(year(1900));

    }

    public static int name(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean check(int a, int b) {
        int sum=a+b;
        if (10<=sum && sum<=20){
            return true;
        } else {
            return false;
        }

    }
    public static void tale(int a) {

        if (a >= 0) {
            System.out.println("положительное число");
        }
        else {
            System.out.println("отрицательное число");
        }

    }
    public static boolean number(int a) {
        if (a<0) return true;
        else return false;
    }
    public static void hello(String name){
        System.out.println("Привет " + name);
    }
    public static boolean year(int a){
        if (a % 4 > 0) return false;
        if (a % 400==0)return true;
        if (a % 100==0)return false;
        return true;
    }
}
