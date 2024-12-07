package Praktikum12;

public class emas {
    public static void main(String[] args) {
        double investasiAwal = 1000000; 
        double tingkatKeuntungan = 0.117; 
        int tahun = 10; 

        // Hitung menggunakan fungsi iteratif
        double hasilIteratif = hitungInvestasiEmasIteratif(investasiAwal, tingkatKeuntungan, tahun);
        System.out.println("Hasil investasi menggunakan iterasi: Rp " + hasilIteratif);

        // Hitung menggunakan fungsi rekursif
        double hasilRekursif = hitungInvestasiEmasRekursif(investasiAwal, tingkatKeuntungan, tahun);
        System.out.println("Hasil investasi menggunakan rekursi: Rp " + hasilRekursif);
    }
    // Fungsi Iteratif
    public static double hitungInvestasiEmasIteratif(double investasiAwal, double tingkatKeuntungan, int tahun) {
        double hasil = investasiAwal;
        for (int i = 1; i <= tahun; i++) {
            hasil += hasil * tingkatKeuntungan;
        }
        return hasil;
    }

    // Fungsi Rekursif
    public static double hitungInvestasiEmasRekursif(double investasiAwal, double tingkatKeuntungan, int tahun) {
        if (tahun == 0) {
            return investasiAwal;
        }
        return hitungInvestasiEmasRekursif(investasiAwal * (1 + tingkatKeuntungan), tingkatKeuntungan, tahun - 1);
    }

   
}
