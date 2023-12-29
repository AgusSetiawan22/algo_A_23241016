import java.util.Scanner;

public class Belajar {
    public static void main(String[] args) {
        // data member atau variabel
        int tot_belanja;

        //membuat objek scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Maskan Total Belanja");
        tot_belanja = input.nextInt();

        //membuat percabangan
        if (tot_belanja >= 50000) {
            System.out.println("Selama Datang Mouse");    
        } else {
            System.out.println("Tidak Dapat MOUSE");
        }
    }
}
