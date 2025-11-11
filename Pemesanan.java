public class Pemesanan {
    
    private JasaLukis jasaLukis; // Referensi ke Class JasaLukis (untuk mengakses namaJasa)
    
    private String namaPelanggan;
    private String jenisBarang;
    private String desainLukisan;
    private double harga;
    
    // Constructor (menerima objek JasaLukis)
    public Pemesanan(JasaLukis jasaLukis, String namaPelanggan, String jenisBarang, String desainLukisan, double harga) {
        this.jasaLukis = jasaLukis; // Menyimpan referensi JasaLukis
        this.namaPelanggan = namaPelanggan;
        this.jenisBarang = jenisBarang;
        this.desainLukisan = desainLukisan;
        this.harga = harga;
    }
    
    // Method tampilkanDetailPemesanan()
    public void tampilkanDetailPemesanan() {
        // Mengakses atribut namaJasa melalui objek JasaLukis
        System.out.println("\n--- Detail Pesanan di " + jasaLukis.getNamaJasa() + " ---"); 
        System.out.println("Pelanggan    : " + namaPelanggan);
        System.out.println("Barang       : " + jenisBarang);
        System.out.println("Desain       : " + desainLukisan);
        System.out.println("Harga        : Rp" + String.format("%,.0f", harga));
        System.out.println("------------------------------------");
    }
    
    // Getter untuk harga
    public double getHarga() {
        return harga;
    }
}