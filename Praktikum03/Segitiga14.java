package Praktikum03;
import java.util.Scanner;
public class Segitiga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukan alas");
        alas = sc.nextInt ();
        System.out.print("Masukan tinggi: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

        sc.close();


    }
    
}
