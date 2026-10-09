
import java.util.HashMap;

public class MainInventaris {

    public static void tampilkanInventaris(
            HashMap<String, Produk> mapInventaris) {

        int totalStok = 0;

        System.out.println("==========================================");
        System.out.println("       SISTEM INFORMASI INVENTARIS");
        System.out.println("==========================================");
        System.out.printf("%-10s %-20s %-10s%n",
                "Kode", "Nama Produk", "Stok");
        System.out.println("------------------------------------------");

    
        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);

            System.out.printf("%-10s %-20s %-10d%n",
                    p.getKodeProduk(),
                    p.getNama(),
                    p.getStok());

            totalStok += p.getStok();
        }

        System.out.println("------------------------------------------");
        System.out.println("Jumlah jenis produk : "
                + mapInventaris.size());
        System.out.println("Total seluruh stok  : " + totalStok);
        System.out.println("==========================================");
    }

    public static void main(String[] args) {

        HashMap<String, Produk> mapInventaris = new HashMap<>();


        mapInventaris.put("P001",
                new Produk("P001", "Laptop", 10));

        mapInventaris.put("P002",
                new Produk("P002", "Mouse", 25));

        mapInventaris.put("P003",
                new Produk("P003", "Keyboard", 15));

        mapInventaris.put("P004",
                new Produk("P004", "Monitor", 8));

        mapInventaris.put("P005",
                new Produk("P005", "Printer", 6));


        System.out.println("\nDAFTAR INVENTARIS AWAL");
        tampilkanInventaris(mapInventaris);

   
        System.out.println("\nPROSES UPDATE STOK");

        String kodeUpdate = "P002";

        if (mapInventaris.containsKey(kodeUpdate)) {
            Produk produkUpdate = mapInventaris.get(kodeUpdate);

            int stokLama = produkUpdate.getStok();
            produkUpdate.setStok(stokLama + 10);

            System.out.println("Produk berhasil diupdate: "
                    + produkUpdate.getNama());
            System.out.println("Stok sebelumnya : " + stokLama);
            System.out.println("Stok sekarang   : "
                    + produkUpdate.getStok());
        } else {
            System.out.println("Produk tidak ditemukan.");
        }

  
        System.out.println("\nDAFTAR SETELAH UPDATE");
        tampilkanInventaris(mapInventaris);

   
        System.out.println("\nPROSES HAPUS PRODUK");

        String kodeHapus = "P004";

        if (mapInventaris.containsKey(kodeHapus)) {
            Produk produkHapus = mapInventaris.remove(kodeHapus);

            System.out.println("Produk berhasil dihapus: "
                    + produkHapus.getNama());
        } else {
            System.out.println("Produk tidak ditemukan.");
        }

    
        System.out.println("\nDAFTAR INVENTARIS AKHIR");
        tampilkanInventaris(mapInventaris);
    }
}