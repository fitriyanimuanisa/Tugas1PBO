package LatihanPertemuan7;

class Pegawai {
    protected String nama;
    protected double gajiPokok;
    
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    public void kerja() {
        System.out.println(nama + " sedang bekerja");
    }
    
    public void hitungGaji() {
        System.out.println("Gaji pokok: Rp " + gajiPokok);
    }
    
    public void infoPegawai() {
        System.out.println("Nama: " + nama + ", Gaji Pokok: Rp " + gajiPokok);
    }
}


