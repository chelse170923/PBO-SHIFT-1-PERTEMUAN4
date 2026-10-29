/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;


import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NIK, nama;
        int golongan, anak;
        double gajiPokok = 0;
        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;
        double gajiBersih;

        System.out.print("Masukkan NIK: ");
        NIK = input.nextLine();

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Kode golongan (1-4): ");
        golongan = input.nextInt();

        System.out.print("Status menikah (1=Ya, 0=Tidak): ");
        int menikah = input.nextInt();

        System.out.print("Jumlah anak: ");
        anak = input.nextInt();

        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid");
                return;
        }

        if (menikah == 1) {
            tunjanganPasangan = gajiPokok * 0.10;
            tunjanganAnak = gajiPokok * 0.05 * anak;
        }

        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        System.out.println("\n=== DATA GAJI KARYAWAN ===");
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);
    }
}