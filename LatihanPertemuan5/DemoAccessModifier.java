package LatihanPertemuan7;

public class DemoAccessModifier {
    public static void main(String[] args) {
        System.out.println("=== DEMO PENGARUH ACCESS MODIFIER ===");
        
        RekeningTabungan tabungan = new RekeningTabungan("123456", 5000000, "Andi", 2.5);
        
        System.out.println("\n--- Akses dari luar class ---");
        System.out.println("Pemilik: " + tabungan.pemilik);
       
        tabungan.infoAkun();
        tabungan.setor(1000000);
      
        tabungan.tambahBunga();
        tabungan.infoRekeningTabungan();
        
        System.out.println("\n--- Demonstrasi akses terbatas ---");
        System.out.println("No. Akun melalui getter: " + tabungan.getNomorAkun());
    }
}
