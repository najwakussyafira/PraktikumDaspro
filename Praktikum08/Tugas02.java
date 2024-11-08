package Praktikum08;

import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        String cabor, namaAtlet;
        int i = 1;
        int j = 1;

        System.out.println("=======Data Nama Atlet Porseni 2024=======");
        while (i <= 5) {
            System.out.println("Politeknik ke-" + i);
            for (j = 1; j <= 4; j++) {
                System.out.print("Cabang olahraga: ");
                cabor = sc14.nextLine();
                for (int k = 1; k <=5; k++) {
                    System.out.print(k+ ". ");
                    namaAtlet = sc14.nextLine();
                }
            }
            System.out.println();
            i++;
        }
        sc14.close();
        System.out.println("Coba commit baru");
    }
}
