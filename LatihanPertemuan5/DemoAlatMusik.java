package LatihanPertemuan7;

public class DemoAlatMusik {
    public static void main(String[] args) {
        System.out.println("=== DEMO PEWARISAN ALAT MUSIK ===");
        
        AlatMusik alat1 = new AlatMusik("Piano", "Tekan");
        Gitar gitar1 = new Gitar("Gitar Akustik", 6);
        
        // Menampilkan perilaku class induk
        System.out.println("\n--- Class AlatMusik ---");
        alat1.info();
        alat1.mainkan();
        
        // Menampilkan perilaku subclass (perilaku berbeda)
        System.out.println("\n--- Class Gitar ---");
        gitar1.info();
        gitar1.mainkan(); // Method yang dioverride
        gitar1.setelSenar(); // Method tambahan di subclass
    }
}