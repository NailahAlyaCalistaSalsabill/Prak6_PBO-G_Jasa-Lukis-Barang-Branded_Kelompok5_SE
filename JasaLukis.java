// File: JasaLukis.java
// TUGAS ANGGOTA KE-1: CLASS UTAMA (DATA LAYANAN)

public class JasaLukis {
    
    private String namaJasa;
    private String alamat;
    private String[] daftarBarang;
    
    // Constructor
    public JasaLukis(String namaJasa, String alamat, String[] barang) {
        this.namaJasa = namaJasa;
        this.alamat = alamat;
        this.daftarBarang = barang;
    }
    
    // Method tampilkanInfoJasa()
    public void tampilkanInfoJasa() {
        System.out.println("===============================");
        System.out.println("=== INFO JASA LUKIS BRANDED ===");
        System.out.println("Nama Jasa : " + namaJasa);
        System.out.println("Alamat    : " + alamat);
        System.out.print("Daftar Barang yang dilukis: ");
        for (String item : daftarBarang) {
            System.out.print(item + " | ");
        }
        System.out.println("\n===============================");
    }
    
    // Getter yang dibutuhkan oleh Class Pemesanan
    public String getNamaJasa() {
        return namaJasa;
    }
}