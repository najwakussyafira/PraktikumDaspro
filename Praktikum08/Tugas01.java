package Praktikum08;

import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.print("Masukkan nilai N (min. 3): ");
        int N = sc14.nextInt();

        if (N < 3){
            System.out.print("Nilai N harus minima 3");    
        } else {
            for ( int i=1; i<=N; i++) {
                for (int j=1; j<=N; j++) {
                    if (i==1||i==N||j==1||j==N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                sc14.close();
            }
        }
    }
    
}
