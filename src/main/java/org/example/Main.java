package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        int year = scanner.nextInt();

        int mod = year % 12;

       String zodyak = switch (mod) {
           case 0 -> "Maymun";
           case 1 -> "Horoz";
           case 2 -> "Köpek";
           case 3 -> "Domuz";
           case 4 -> "Fare";
           case 5 -> "Öküz";
           case 6 -> "Kaplan";
           case 7 -> "Tavşan";
           case 8 -> "Ejderha";
           case 9 -> "Yılan";
           case 10 -> "At";
           case 11 -> "Koyun";
           default -> "Geçersiz";
       };

        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

    }
}