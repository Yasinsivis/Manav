package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double armut=2.14,elma=3.67,Domates=1.11,muz=0.95,Patlıcan=5.0;
        int a,e,d,m,p;

        Scanner inp=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo :");
        a=inp.nextInt();
        System.out.println("Elma Kaç Kilo :");
        e=inp.nextInt();
        System.out.println("Domates Kaç Kilo :");
        d=inp.nextInt();
        System.out.println("Muz Kaç Kilo :");
        m=inp.nextInt();
        System.out.println("Patlıcan Kaç Kilo :");
        p=inp.nextInt();

        double ToplamTutar=(a*armut)+(e*elma)+(d*Domates)+(m*muz)+(p*Patlıcan);
        System.out.println("Toplam Tutar :" +  ToplamTutar);
    }
}
