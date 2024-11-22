package Praktikum10;

import java.util.Scanner;

public class Tugas14 {
    public static void main(String[] args) {
        int[][] survey = new int[10][6]; 
        Scanner sc14 = new Scanner(System.in);

        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 6; j++) { 
            System.out.print("Masukkan nilai survei untuk Responden " + (i + 1) + ", Pertanyaan " + (j + 1) + ": ");
            survey[i][j] = sc14.nextInt();
         }
    }

        for (int i = 0; i < 10; i++) {
            int totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += survey[i][j];
            }
            double rataRataResponden = totalResponden / 6.0;
            System.out.println("Rata-rata Responden " + (i + 1) + ": " + rataRataResponden);
        }
        for (int j = 0; j < 6; j++) {
            int totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += survey[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / 10.0;
            System.out.println("Rata-rata Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }
        
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / 60.0;
        System.out.println("Rata-rata Keseluruhan: " + rataRataKeseluruhan);

        sc14.close();
        }
        
        }
