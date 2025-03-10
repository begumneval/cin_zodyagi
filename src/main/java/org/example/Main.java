package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan doğum yılını alan kod bloğu
        System.out.print("Doğum yılınızı giriniz: ");
        int year = scanner.nextInt();

        //Çin zodyağında hangi burca ait olduğunu bulmak için 12 ye bölümünden kalanı hesaplayan kod bloğu
        int mod = year % 12;

        //switch kullanarak hangi burca ait olduğunu bulan kod bloğu
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

        //Burcu yazdıran kod
        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

    }
}