package LatihanPertemuan7;

class AkunBank {
    private String nomorAkun;        
    protected double saldo;         
    public String pemilik;           
    
    public AkunBank(String nomorAkun, double saldoAwal, String pemilik) {
        this.nomorAkun = nomorAkun;
        this.saldo = saldoAwal;
        this.pemilik = pemilik;
    }
    
    public String getNomorAkun() {
        return nomorAkun;
    }
 
    protected void updateSaldo(double jumlah) {
        this.saldo += jumlah;
    }
  
    public void setor(double jumlah) {
        if (jumlah > 0) {
            updateSaldo(jumlah);
            System.out.println("Setor berhasil: Rp " + jumlah);
        }
    }
 
    public void infoAkun() {
        System.out.println("Pemilik: " + pemilik + 
                          ", No. Akun: " + getNomorAkun() + 
                          ", Saldo: Rp " + saldo);
    }
}


