/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

import java.util.Scanner;

public class Soal6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (1=Ya, 0=Tidak): ");
        int member = input.nextInt();

        System.out.print("Masukkan total belanja: Rp");
        double belanja = input.nextDouble();

        System.out.print("Masukkan uang pembayaran: Rp");
        double bayar = input.nextDouble();

        double diskon = 0;

        if (member == 1) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = belanja - diskon;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja: Rp" + belanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total yang Harus Dibayar: Rp" + totalBayar);

        if (bayar >= totalBayar) {
            System.out.println("Uang Pembayaran: Rp" + bayar);
            System.out.println("Kembalian: Rp" + (bayar - totalBayar));
        } else {
            System.out.println("Uang kurang: Rp" + (totalBayar - bayar));
        }
    }
}
