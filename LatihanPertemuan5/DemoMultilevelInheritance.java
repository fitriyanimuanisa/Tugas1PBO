package LatihanPertemuan7;

public class DemoMultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("=== DEMO MULTILEVEL INHERITANCE ===");
        
        Direktur direktur = new Direktur("Budi Santoso", 20000000, 10000000, 15000000);
        
        // Menampilkan seluruh method dari class Direktur
        System.out.println("\n--- Method dari class Direktur ---");
        
        // Method dari Pegawai (superclass)
        direktur.infoPegawai();
        direktur.kerja();
        
        // Method dari Manajer (subclass)
        direktur.kelolaTim();
        
        // Method dari Direktur (current class)
        direktur.rapatDireksi();
        direktur.buatKeputusanStrategis();
        direktur.evaluasiKinerja();
        
        // Override method
        System.out.println("\n--- Perhitungan Gaji ---");
        direktur.hitungGaji();
    }
}
