package Praktikum12;

public class Pangkat14 {
    public static void main(String[] args) {
        System.out.println("Hasil Rekursif:");
        pangkat(2,5);
        System.out.println();

        System.out.println("Hasil Iteratif:");
        pangkatIterative(2, 5);
    }
    public static int pangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            if (y != 5) { 
                System.out.print(x + "x");
            }
            return x * pangkat(x, y - 1);
        }
    }
    public static void pangkatIterative(int x, int y) {
        int hasil = 1;
        for (int i = 1; i <= y; i++) {
            hasil *= x;
            if (i != y) {
                System.out.print(x + "x");
            } else {
                System.out.print(x);
            }
        }
        System.out.print("=" + hasil);
        }
        
    }

