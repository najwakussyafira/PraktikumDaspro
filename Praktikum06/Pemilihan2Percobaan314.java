package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan314 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek Scanner untuk membaca input pengguna

        // Mendeklarasikan variabel untuk kategori, penghasilan, gaji bersih, dan pajak
        String kategori; 
        int penghasilan, gajiBersih; 
        double pajak = 0; 

        // Mengambil input dari pengguna
        System.out.println("Masukkan Kategori (pekerja/pebisnis): "); // Meminta kategori
        kategori = sc.nextLine(); // Membaca kategori yang dimasukkan oleh pengguna
        System.out.println("Masukkan Besarnya Penghasilan: "); // Meminta penghasilan
        penghasilan = sc.nextInt(); // Membaca penghasilan yang dimasukkan pengguna

        // Menghitung pajak berdasarkan kategori
        if (kategori.equalsIgnoreCase("pekerja")) { // Jika kategori adalah "pekerja"
            if (penghasilan <= 2000000) {
                pajak = 0.1; // 10% pajak
            } else if (penghasilan <= 3000000) {
                pajak = 0.15; // 15% pajak
            } else {
                pajak = 0.2; // 20% pajak
            }
        } else if (kategori.equalsIgnoreCase("pebisnis")) { // Jika kategori adalah "pebisnis"
            if (penghasilan <= 2500000) {
                pajak = 0.15; // 15% pajak
            } else if (penghasilan <= 3500000) {
                pajak = 0.2; // 20% pajak
            } else {
                pajak = 0.25; // 25% pajak
            }
        } else {
            System.out.println("Masukan Kategori Salah"); // Pesan kesalahan jika kategori tidak valid
            sc.close(); // Menutup scanner sebelum keluar
            return; // Keluar dari program jika kategori salah
        }

        // Menghitung gaji bersih
        gajiBersih = (int) (penghasilan - (pajak * penghasilan)); // Menghitung gaji bersih
        System.out.println("Penghasilan Bersih: " + gajiBersih); // Menampilkan penghasilan bersih

        sc.close(); // Menutup scanner
    }
}
