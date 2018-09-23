package com.company;
import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new  Scanner(System.in);

        //С помощью цикла вычислите значение выражения 2^n
        int section=0;
        //систем аут(вывод на экран) списка задач
        System.out.println("Сделайте свой выбор(укажите номер задачи)");
        section=scn.nextInt();

        switch (section){
            case 1:
                method1();
                break;
            case 2:
                method2();

                default:
                    System.out.println("НЕверно указанное задание!!!");
                    break;
        }













        /*double n=0 ;
        double k=0;
        double q;
        double h;
        double d ;
        q= n*k ;
        h=n+k ;
        d=n-k ;
        n = scn.nextDouble();
         k = scn.nextDouble();
        System.out.println(q);
        System.out.println(h);
        System.out.println(d);*/
               /* double g = 9.8 ;
                double h =0 ;
                double t ;
                 h= scn.nextDouble();
                t = Math.sqrt(2*h/g) ;
        System.out.println(t);/*

               /* double c=20 ;
                double a = 10 ;
                int b ;
                 c= scn.nextDouble();
                  a= scn.nextDouble();
                b = Math.sqrt(c*c-a*a) ;
        System.out.println(b);*/
    }

    public static void method1(){
        Scanner scn = new  Scanner(System.in);
        double k  ;
        double n = 0 ;
        n = scn.nextDouble();
        for (int i = 1; i < 10; i++) {
            k = Math.pow(n, i);
            System.out.println(k);
        }
    }
    public static void method2(){
        Scanner scn = new  Scanner(System.in);
        double result =1 ;
        double n ;
        n = scn.nextDouble();
        for (int i = 1; i <=10; i ++){
            result *= i;

            System.out.println(result);}
    }
}
