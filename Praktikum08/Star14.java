package Praktikum08;

import java.util.Scanner;

public class Star14 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc14.nextInt();

        for (int i=1; i<=N; i++){
            System.out.print("*");
        }
     sc14.close();
    }
    
}
