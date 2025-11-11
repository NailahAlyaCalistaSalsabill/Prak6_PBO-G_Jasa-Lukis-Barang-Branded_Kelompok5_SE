// File: Simulasi.java
// TUGAS ANGGOTA KE-3: LOGIKA UTAMA DAN PERHITUNGAN

public class Simulasi {

    public static void main(String[] args) {
        
        // 1. Inisialisasi JasaLukis (Membuat objek dari Anggota 1)
        String[] barangTersedia = {"Sepatu", "Tas", "Jaket"};
        JasaLukis myJasa = new JasaLukis("Lukis Branded Keren", "Jl. Kreatif No. 10", barangTersedia);

        myJasa.tampilkanInfoJasa();

        // 2. Mensimulasikan 3 Pesanan Pelanggan (Membuat objek dari Anggota 3)
        
        // Pesanan 1
        Pemesanan pesanan1 = new Pemesanan(
            myJasa, // Mengirim objek JasaLukis
            "Nadine", 
            "Sepatu Converse", 
            "Desain Awan", 
            350000.0
        );
        pesanan1.tampilkanDetailPemesanan();
        
        // Pesanan 2
        Pemesanan pesanan2 = new Pemesanan(
            myJasa, // Mengirim objek JasaLukis
            "Andhika", 
            "Tas Kulit", 
            "Desain Bunga", 
            500000.0
        );
        pesanan2.tampilkanDetailPemesanan();
        
        // Pesanan 3
        Pemesanan pesanan3 = new Pemesanan(
            myJasa, // Mengirim objek JasaLukis
            "Nailah"
            "Jaket Deniem"
            "Desain Polos"
            250000.0
        );
        pesanan3.tampilkanDetailPemesanan();

        // 3. Logika Sederhana Menghitung Total Biaya
        double totalBiaya = pesanan1.getHarga() + pesanan2.getHarga() + pesanan3.getHarga();
        
        System.out.println("=== HASIL LOGIKA PENGHITUNGAN TOTAL BIAYA ===");
        System.out.println("Total Biaya dari 2 Pesanan: Rp" + String.format("%,.0f", totalBiaya));
        System.out.println("=============================================");
    }
}