/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        double luas;

        System.out.println("=== MENU LUAS BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                luas = 0.5 * (atas + bawah) * t;
                System.out.println("Luas Trapesium = " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal pertama: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal kedua: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
