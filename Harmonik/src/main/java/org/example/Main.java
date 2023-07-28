package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int deger;
        double sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        deger = input.nextInt();

        for(double i=1; i<=deger; i++){
            sum += (1/i);
        }

        System.out.println("Girilen değerin harmonik serisi: " + sum);
    }
}