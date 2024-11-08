package Praktikum08;

import java.util.Scanner;

public class RataNilai14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner (System.in);

    int nilaimhs;
    double totalNilai, rataNilai;
    int i = 1;

    while (i<=5) {
        totalNilai=0;
        System.out.println("Input Nilai Mahasiswa ke- " +i);
        for (int j = 1; j <= 5; j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilaimhs=sc14.nextInt();
            totalNilai+=nilaimhs;
            }
            rataNilai=totalNilai/5;
            System.out.println("Rata rata Nilai Mahasiswa ke- " + i + " adalah " + rataNilai);
            i++;
        }
            sc14.close();
        }
    
    
}
