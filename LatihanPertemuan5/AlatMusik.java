package LatihanPertemuan7;

class AlatMusik {
    protected String nama;
    protected String jenis;
    
    public AlatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void mainkan() {
        System.out.println(nama + " sedang dimainkan");
    }
    
    public void info() {
        System.out.println("Alat Musik: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}


