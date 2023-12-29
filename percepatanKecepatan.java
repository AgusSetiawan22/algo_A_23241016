import java.util.Scanner;

public class percepatanKecepatan {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan perpindahan awal (m): ");
        double perpindahanAwal = scanner.nextDouble();

        System.out.print("Masukkan perpindahan akhir (m): ");
        double perpindahanAkhir = scanner.nextDouble();

        System.out.print("Masukkan waktu (s): ");
        double waktu = scanner.nextDouble();

        // Menghitung kecepatan
        double kecepatan = (perpindahanAkhir - perpindahanAwal) / waktu;

        // Menghitung percepatan
        double percepatan = (kecepatan - 0) / waktu; // karena percepatan awal dianggap nol

        // Menampilkan hasil
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println("Percepatan: " + percepatan + " m/s^2");

        // Menutup scanner
        scanner.close();
    }
}
