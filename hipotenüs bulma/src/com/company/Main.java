package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int kenar1,kenar2;
        double hipotenus;

        Scanner inp=new Scanner(System.in);

        System.out.print("kenar 1:");
        kenar1= inp.nextInt();
        System.out.print("kenar 2:");
        kenar2= inp.nextInt();

        hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("hipotenüs:"+hipotenus);



    }
}
