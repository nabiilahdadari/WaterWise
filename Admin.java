import java.util.ArrayList;
import java.util.List;
/**
 * Kelas untuk admin
 * @author Kelompok 2
 */

// Class untuk admin
public class Admin extends User {
  // Atribut tambahan untuk admin
  private String role;
  private List<Konsultasi> konsultasi; // ArrayList atau List untuk menyimpan objek konsultasi

  // Konstruktor untuk admin
  public Admin(String username, String password, String role) {
    super(username, password); // Memanggil konstruktor dari class User
    this.role = role;
    this.konsultasi = new ArrayList<>(); // Inisialisasi ArrayList untuk konsultasi
  }

  // Method untuk melihat daftar konsultasi
  public void viewKonsultasi() {
    System.out.println("Daftar Konsultasi Anda:");
    for (Konsultasi konsultasi : this.konsultasi) {
      System.out.println("- Dengan user " + konsultasi.getUser().getUsername());
    }
  }
   public void replyToKonsultasi(User user, Konsultasi konsultasi, String message) {
    // Pastikan konsultasi melibatkan admin yang sedang masuk (yaitu objek admin ini)
    if (konsultasi.getAdmin() != this) {
      System.out.println("Anda tidak dapat membalas pesan pada konsultasi ini.");
      return;
    }

    // Pastikan konsultasi melibatkan user yang dimaksud (sesuai parameter)
    if (konsultasi.getUser() != user) {
      System.out.println("Konsultasi ini tidak melibatkan user yang dimaksud.");
      return;
    }

    // Menambahkan pesan dari admin ke konsultasi
    konsultasi.addMessageFromAdmin(message);
    System.out.println("Pesan dari admin telah dikirim.");
  }
   
  public void viewPengaduan(List<Pengaduan> pengaduanList) {
    System.out.println("Daftar Pengaduan:");
    for (Pengaduan pengaduan : pengaduanList) {
      System.out.println("Nama: " + pengaduan.getNama());
      System.out.println("Subjek: " + pengaduan.getSubjek());
      System.out.println("Status: " + (pengaduan.getStatus() ? "Sudah diproses" : "Belum diproses"));
      System.out.println("------------");
    }
  }
  
  // Method untuk mendapatkan role
  public String getRole() {
    return this.role;
  }

  // Method untuk mengubah role
  public void setRole(String role) {
    this.role = role;
  }
  
  // Method untuk melihat informasi tentang objek user
  public void viewUser(User user) {
    // Menampilkan informasi tentang objek user, seperti username, password, dan status login
    System.out.println("Informasi tentang user:");
    System.out.println("Username: " + user.getUsername());
    System.out.println("Password: " + user.getPassword());
    System.out.println("Status login: " + (user.getIsLoggedIn() ? "Sudah login" : "Belum login"));
  }

  // Method untuk mengubah status login menjadi false dan role menjadi null
  @Override
  public void logout() {
    // Memanggil method logout dari class User untuk mengubah status login menjadi false
    super.logout();
    // Mengubah role menjadi null
    this.role = null;
    System.out.println("Anda berhasil logout sebagai admin");
  }
}