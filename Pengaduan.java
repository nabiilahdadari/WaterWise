/**
 * Kelas untuk pengaduan berbentuk form
 * @author Kelompok 2
 */

// Class untuk pengaduan berbentuk form
public class Pengaduan {
    
  // Atribut untuk pengaduan
  private final String nama;
  private final String email;
  private final String subjek;
  private final String isi;
  private boolean status;

  // Konstruktor untuk pengaduan
  public Pengaduan(String nama, String email, String subjek, String isi) {
    this.nama = nama;
    this.email = email;
    this.subjek = subjek;
    this.isi = isi;
    this.status = false; // Status awal pengaduan adalah false (belum diproses)
  }

  // Method untuk mendapatkan nama
  public String getNama() {
    return this.nama;
  }

  // Method untuk mendapatkan email
  public String getEmail() {
    return this.email;
  }

  // Method untuk mendapatkan subjek
  public String getSubjek() {
    return this.subjek;
  }

  // Method untuk mendapatkan isi
  public String getIsi() {
    return this.isi;
  }

  // Method untuk mendapatkan status
  public boolean getStatus() {
    return this.status;
  }

  // Method untuk mengubah status
  public void setStatus(boolean status) {
    this.status = status;
  }
}