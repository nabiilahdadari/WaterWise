import java.util.ArrayList;
import java.util.List;

/**
 * Kelas untuk user
 * @author Kelompok 2
 */

// Class untuk user
public class User {
  // Atribut untuk user
  private String username;
  private String password;
  private boolean isLoggedIn;
  private ArrayList<Konsultasi> konsultasi; // Array list yang menyimpan objek-objek konsultasi
  private ArrayList<Pengaduan> pengaduanList; // Array list yang menyimpan objek-objek pengaduan


 // Konstruktor untuk user
  public User(String username, String password) {
    this.username = username;
    this.password = password;
    this.isLoggedIn = false;
    this.konsultasi = new ArrayList<Konsultasi>();
    this.pengaduanList = new ArrayList<Pengaduan>();
  }


  // Method untuk mendapatkan username
  public String getUsername() {
    return this.username;
  }

  // Method untuk mendapatkan password
  public String getPassword() {
    return this.password;
  }

  // Method untuk mendapatkan status login
  public boolean getIsLoggedIn() {
    return this.isLoggedIn;
  }

  public void setUsername(String username) {
        this.username = username;
  }

  public void setPassword(String password) {
        this.password = password;
  }

  // Method untuk mengubah status login
  public void setIsLoggedIn(boolean isLoggedIn) {
    this.isLoggedIn = isLoggedIn;
  }

  // Method untuk memeriksa apakah input sama dengan password
  public boolean validatePassword(String input) {
    // Mengembalikan true jika input sama dengan password, false jika tidak
    return input.equals(this.password);
  }

  // Method untuk mengubah password jika oldPassword benar
  public void changePassword(String oldPassword, String newPassword) {
    // Jika oldPassword sama dengan password, maka mengubah password menjadi newPassword
    if (this.validatePassword(oldPassword)) {
      this.password = newPassword;
      System.out.println("Password berhasil diubah");
    } else {
      System.out.println("Password lama salah");
    }
  }

  // Method untuk mengubah status login menjadi true jika input sama dengan password
  public void login(String input) {
    // Jika input sama dengan password, maka mengubah isLoggedIn menjadi true
    if (this.validatePassword(input)) {
      this.isLoggedIn = true;
      System.out.println("Anda berhasil login");
    } else {
      System.out.println("Password salah");
    }
  }

  // Method untuk mengubah status login menjadi false
  public void logout() {
    // Mengubah isLoggedIn menjadi false
    this.isLoggedIn = false;
    System.out.println("Anda berhasil logout");
  }
  
  // Method untuk memulai konsultasi dengan admin
  public void startKonsultasi(Admin admin) {
    // Membuat objek konsultasi baru
    Konsultasi konsultasiBaru = new Konsultasi(this, admin);
    
    // Menambahkan konsultasi ke dalam list konsultasi
    konsultasi.add(konsultasiBaru);
    
    System.out.println("Konsultasi dengan admin " + admin.getUsername() + " telah dimulai.");
  }

  // Method untuk melihat daftar konsultasi
  public void viewKonsultasi() {
    System.out.println("Daftar Konsultasi Anda:");
    for (Konsultasi konsultasi : konsultasi) {
      System.out.println("- Dengan admin " + konsultasi.getAdmin().getUsername());
    }
  }
  // Method untuk membuat pengaduan
  public void createPengaduan(String nama, String email, String subjek, String isi) {
    // Membuat objek pengaduan baru
    Pengaduan pengaduanBaru = new Pengaduan(nama, email, subjek, isi);

    // Menambahkan pengaduan ke dalam list pengaduanList
    pengaduanList.add(pengaduanBaru);
    System.out.println("Pengaduan Anda telah disimpan.");
  }

  // Method untuk melihat daftar pengaduan
  public void viewPengaduan() {
    System.out.println("Daftar Pengaduan Anda:");
    for (Pengaduan pengaduan : pengaduanList) {
      System.out.println("Nama: " + pengaduan.getNama());
      System.out.println("Subjek: " + pengaduan.getSubjek());
      System.out.println("Status: " + (pengaduan.getStatus() ? "Sudah diproses" : "Belum diproses"));
      System.out.println("------------");
    }
  }
}



