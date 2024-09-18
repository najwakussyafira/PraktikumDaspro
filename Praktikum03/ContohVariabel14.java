package Praktikum03;

public class ContohVariabel14{
    public static void main(String[] args) {
        String hobi = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte umur = 19;
        double ipk = 3.24, tinggiBadan = 1.60;

        System.out.println(hobi);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umur, tinggiBadan));
        
    }
}

