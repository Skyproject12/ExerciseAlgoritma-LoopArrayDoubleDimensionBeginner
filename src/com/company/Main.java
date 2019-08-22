package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,  c;

        Scanner scan = new Scanner (System.in);
        System.out.println("nama : kadek sumendra ");
        System.out.println("nim : ");
        c= scan.nextInt();
        System.out.println("kelas : d3if 41 01 ");
        System.out.println("masukkan angka");
        a= scan.nextInt();
        System.out.println("masukkan angka");
        int b= scan.nextInt();
        for (int i = 0; i <=a-1; i++) {
            for (int j = b-1; j <=i ;j++ ) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        }
    }

