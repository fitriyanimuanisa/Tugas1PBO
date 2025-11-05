package LatihanPertemuan7;

class Manajer extends Pegawai {
    protected double tunjangan;
    
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void hitungGaji() {
        double totalGaji = gajiPokok + tunjangan;
        System.out.println("Total gaji manajer: Rp " + totalGaji + 
                          " (Pokok: " + gajiPokok + ", Tunjangan: " + tunjangan + ")");
    }
    
    public void kelolaTim() {
        System.out.println(nama + " sedang mengelola tim");
    }
}




