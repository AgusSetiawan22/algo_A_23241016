import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan: ");
        int bilangan = scanner.nextInt();

        // Memeriksa apakah bilangan ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menutup scanner
        scanner.close();
    }
}
