import java.util.ArrayList;
import java.util.Scanner;

/**
 * main class
 * @author Kelompok 2
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat ArrayList untuk menyimpan objek user
        ArrayList<User> users = new ArrayList<User>();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Selamat datang di Aplikasi Water Wise!");
            System.out.println("1. Buat Akun User");
            System.out.println("2. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan username: ");
                    String username = scanner.next();
                    System.out.print("Masukkan password: ");
                    String password = scanner.next();

                    // Membuat objek User baru
                    User user = new User(username, password);

                    // Menambahkan objek User ke ArrayList
                    users.add(user);

                    System.out.println("Akun user berhasil dibuat!");
                    break;
                case 2:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi yang benar.");
            }
        }
    }
}
