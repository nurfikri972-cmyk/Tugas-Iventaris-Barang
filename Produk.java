
public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

   
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }

  
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

   
    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}