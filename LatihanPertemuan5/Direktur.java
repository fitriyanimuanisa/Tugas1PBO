package LatihanPertemuan7;

class Direktur extends Manajer {
    private double bonus;
    
    public Direktur(String nama, double gajiPokok, double tunjangan, double bonus) {
        super(nama, gajiPokok, tunjangan);
        this.bonus = bonus;
    }
    
    @Override
    public void hitungGaji() {
        double totalGaji = gajiPokok + tunjangan + bonus;
        System.out.println("Total gaji direktur: Rp " + totalGaji + 
                          " (Pokok: " + gajiPokok + ", Tunjangan: " + tunjangan + 
                          ", Bonus: " + bonus + ")");
    }
    
    public void rapatDireksi() {
        System.out.println(nama + " sedang memimpin rapat direksi");
    }
    
    public void buatKeputusanStrategis() {
        System.out.println(nama + " membuat keputusan strategis perusahaan");
    }
    
    public void evaluasiKinerja() {
        System.out.println(nama + " mengevaluasi kinerja seluruh departemen");
    }
}

