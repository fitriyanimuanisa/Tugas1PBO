package LatihanPertemuan7;

class RekeningTabungan extends AkunBank {
    private double bunga;
    
    public RekeningTabungan(String nomorAkun, double saldoAwal, String pemilik, double bunga) {
        super(nomorAkun, saldoAwal, pemilik);
        this.bunga = bunga;
    }
    
    public void tambahBunga() {
        double bungaBulanan = saldo * bunga / 100;
        updateSaldo(bungaBulanan); 
        System.out.println("Bunga ditambahkan: Rp " + bungaBulanan);
    }
 
    public void infoRekeningTabungan() {
        System.out.println("=== Info Rekening Tabungan ===");
        System.out.println("Pemilik: " + pemilik); 
        System.out.println("No. Akun: " + getNomorAkun()); 
        System.out.println("Saldo: Rp " + saldo); 
        System.out.println("Bunga: " + bunga + "%");

    }
    
    @Override
    public void infoAkun() {
        System.out.println("Rekening Tabungan - Pemilik: " + pemilik + 
                          ", Saldo: Rp " + saldo + ", Bunga: " + bunga + "%");
    }
}


