package Praktikum07;

import java.util.Scanner;

public class TugasSiakadWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;
        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            if (sc.hasNextInt()) {
                nilai = sc.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                    continue;  // Kembali ke awal loop jika nilai tidak valid
                }

                // Klasifikasi nilai
                if (nilai > 80) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                    System.out.println("Bagus, pertahankan nilainya!"); // Pesan tambahan
                } else if (nilai > 73) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
                } else if (nilai > 65) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
                } else if (nilai > 60) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
                } else if (nilai > 50) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
                } else if (nilai > 39) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
                } else {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
                }

                i++; // Increment counter jika nilai valid
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.next(); // Clear invalid input
            }
        }

        sc.close();
    }
}

