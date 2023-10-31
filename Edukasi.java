import java.util.ArrayList;

/**
 * Kelas untuk edukasi
 * @author Kelompok 2
 */

public class Edukasi {
  private String judul;
  private ArrayList<String> materi;

  public Edukasi(String judul) {
    this.judul = judul;
    this.materi = new ArrayList<String>();
  }

  public String getJudul() {
    return this.judul;
  }

  public ArrayList<String> getMateri() {
    return this.materi;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public void addMateri(String materi) {
    this.materi.add(materi);
  }
}

