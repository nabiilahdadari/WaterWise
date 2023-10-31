/**
 * Kelas untuk konsultasi berbentuk chat
 * @author Kelompok 2
 */

import java.util.ArrayList;

// Class untuk konsultasi berbentuk chat
public class Konsultasi {
  // Atribut untuk konsultasi
  private User user; // Objek user yang melakukan konsultasi
  private Admin admin; // Objek admin yang melayani konsultasi
  private ArrayList<String> messages; // Array list yang menyimpan pesan-pesan antara user dan admin

  // Konstruktor untuk konsultasi
  public Konsultasi(User user, Admin admin) {
    this.user = user;
    this.admin = admin;
    this.messages = new ArrayList<String>(); // Membuat array list kosong untuk menyimpan pesan-pesan
  }

  // Method untuk mendapatkan user
  public User getUser() {
    return this.user;
  }

  // Method untuk mendapatkan admin
  public Admin getAdmin() {
    return this.admin;
  }

  // Method untuk mendapatkan messages
  public ArrayList<String> getMessages() {
    return this.messages;
  }

  // Method untuk menambahkan pesan dari user ke array list messages
  public void addMessageFromUser(String message) {
    // Menambahkan pesan dengan format "User: message"
    this.messages.add("User: " + message);
  }

  // Method untuk menambahkan pesan dari admin ke array list messages
  public void addMessageFromAdmin(String message) {
    // Menambahkan pesan dengan format "Admin: message"
    this.messages.add("Admin: " + message);
  }

  // Method untuk menampilkan semua pesan di array list messages
  public void displayMessages() {
    // Melakukan iterasi pada setiap elemen di array list messages
    for (String message : this.messages) {
      // Menampilkan elemen tersebut di layar
      System.out.println(message);
    }
  }
}