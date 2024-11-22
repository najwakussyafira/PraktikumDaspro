package Praktikum10;

import java.util.Scanner;

public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc14.nextInt();

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc14.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc14.nextInt();
            }
        }

        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa/ jumlahMataKuliah);
        }

        System.out.println("================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        sc14.close();
    }
    
}
