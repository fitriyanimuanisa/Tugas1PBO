public class MakhlukHidup {

    private String nama;    // error syntax, string s nya besar      
    private String jenis;
    private double berat;  // atribut berat seharusnya private dan -1.0 dihilangakan karena sudah diinisialisasi di kontruktor (tindakan sia-sia)
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown"; 
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void Makhluk(String nama) { // bukan constructor, sebaiknya nama yang sama dengan classnya dihindari
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) { // penulisan makhlukHidup seharusnya MakhlukHidup
        this.nama = nama; // this.nama = jenis terbalik dengan line 25, seharusnya this.nama = nama 
        this.jenis = jenis; // this.jenis = nama terbalik dengan line 24, seharusnya this.jenis = jenis
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; // nama diubah menjadi other.nama, mengikuti yang ada di parameter
        this.jenis = other.jenis; 
        this.umur = other.umur; // this.umur diubah menjadi other.umur, mengikuti yang ada di parameter
        this.berat = other.berat;
    }


    public void setUmur(int umur) { // salah type data, seharusnya int untuk umur
        this.umur = umur; 
    }

    public void setNama(String nama) { 
        this.nama = nama; // terbalik, yang awalnya nama = this.nama seharusnya menjadi this.nama = nama, tidak error hanya kesalahan logika
    }

    public String getInfo() { // salah type data, seharusnya diganti string bukan int
        return "Nama=" + nama + ", Jenis=" + jenis  
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}
