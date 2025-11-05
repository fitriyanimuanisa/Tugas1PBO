package LatihanPertemuan7;

class Gitar extends AlatMusik {
    private final int jumlahSenar;
    
    public Gitar(String nama, int jumlahSenar) {
        super(nama, "Petik");
        this.jumlahSenar = jumlahSenar;
    }
    
    // Override method untuk menunjukkan perilaku berbeda
    @Override
    public void mainkan() {
        System.out.println(nama + " dengan " + jumlahSenar + " senar sedang dimainkan dengan cara dipetik");
    }
    
    public void setelSenar() {
        System.out.println("Menyetel " + jumlahSenar + " senar gitar");
    }
}
