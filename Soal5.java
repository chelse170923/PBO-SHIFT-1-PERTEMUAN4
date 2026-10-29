/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total penjualan: Rp");
        double penjualan = input.nextDouble();

        double jasa;
        double komisi;

        if (penjualan <= 2000000) {
            jasa = 100000;
            komisi = penjualan * 0.10;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = penjualan * 0.15;
        } else {
            jasa = 300000;
            komisi = penjualan * 0.20;
        }

        double pendapatan = jasa + komisi;

        System.out.println("\n=== PENDAPATAN SALESMAN ===");
        System.out.println("Total Penjualan: Rp" + penjualan);
        System.out.println("Uang Jasa: Rp" + jasa);
        System.out.println("Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + pendapatan);
    }
}