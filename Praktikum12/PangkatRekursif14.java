package Praktikum12;

public class PangkatRekursif14 {
    public static int pangkat(int base, int exponent) {
        System.out.println("Ekspansi: pangkat(" + base + ", " + exponent + ")");
        
        // Base case
        if (exponent == 0) {
            return 1; // Base case
        }

        // Recursive case
        int hasil = base * pangkat(base, exponent - 1); 
        System.out.println("Substitusi: pangkat(" + base + ", " + exponent + ") = " + hasil);
        return hasil;
    }

    public static void main(String[] args) {
        int base = 7;
        int exponent = 5;

        // Panggil fungsi rekursif untuk menghitung pangkat
        int hasil = pangkat(base, exponent);

        System.out.println("Hasil akhir: " + base + "^" + exponent + " = " + hasil);
    }
}