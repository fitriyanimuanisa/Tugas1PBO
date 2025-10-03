# 📘 Tugas 1 Pemrograman Berorientasi Object
### Meliputi materi :
1. **Class dan Object (Pertemuan 2)**
2. **Encapsulation (Pertemuan 3)**
3. **Constructor (Pertemuan 4)**

```
Nama : Fitriyani Muanisa
NIM : 32602400020
```


---

## 💻 Analisa Kode Berikut

### Kode `MakhlukHidup.java` dan `TestAccess.java` versi `ERROR`
><div style="color: blue">
><strong>Tugas:<br/>
>1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada MakhlukHidup.java dan TestAccess.java. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat pada tabel skor). Skor minimal LULUS = 60.
><br/>
>2. Tuliskan output dari TestAccess jika kode sudah diperbaiki
></strong>
</div>

```java

public class MakhlukHidup {

    private string nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public makhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = jenis;  
        this.jenis = nama; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = nama; 
        this.jenis = other.jenis; 
        this.umur = this.umur; 
        this.berat = other.berat;
    }


    public void setUmur(String umur) { 
        this.umur = umur;
    }

    public void setNama(String nama) {
        nama = this.nama; 
    }

    public int getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.nama = "Kucing";  
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.MakhlukHidup("Kuda"); 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(-10); 
        
        System.out.println(m3.getInfo());

        
    }
}
```


## Table Score
| No | Error | Materi terkait            | Skor |
|----|-------|---------------------------|------|
| 1  | ERR1  | Class & Object (syntax)   | 10   |
| 2  | ERR2  | Class & Object (type)     | 10   |
| 3  | ERR3  | Constructor/init          | 10   |
| 4  | ERR4  | Encapsulation / Setter    | 10   |
| 5  | ERR5  | Constructor (copy)        | 10   |
| 6  | ERR6  | Constructor (copy)        | 10   |
| 7  | ERR7  | Encapsulation / Setter    | 10   |
| 8  | ERR8  | Class & Object (type)     | 10   |
| 9  | ERR9  | Class & Object (type)     | 10   |
| 10 | ERR10 | Encapsulation / Validation| 10   |
**Total skor : 100**

## Petunjuk Pengerjaan

Temukan semua ERR#, jelaskan kenapa salah dalam bentuk table dengan kolom berikut, selanjutnya tulis kode perbaikannya.

| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 | MakhlukHidup | [contoh] variable `jumlah` salah penulisan akses `publik` | seharusnya `public jumlah = 10`|

2. Kompilasi dan jalankan setelah diperbaiki.
3. Upload kode pada **Github** repository anda dan **upload link nya ke dalam sinau** di topik **Tugas 1 PBO** disertai **file penjelasannya** dalam format word atau markdown

> Peringatan : Penggunaan AI tidak menjamin jawaban anda semuanya benar

---
## PENYELESAIAN
**Berikut daftar error yang ditemukan**
| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 |MakhlukHidup|Penulisan `string` pada atribut nama salah|Seharusnya `String` huruf S-nya kapital|
| 2 |MakhlukHidup|Atribut `publik double berat` diganti dan `-1.0` dihilangkan|Seharusnya diganti `private double berat` karena sudah diinisialisasi di constructor|
| 3 |MakhlukHidup|`public void MakhlukHidup(String nama)` pada penulisan `MakhlukHidup` salah|Seharusnya diganti dengan `Makhluk` Karena bukan constructor, sebaiknya nama yang sama dengan classnya dihindari|
| 4 |MakhlukHidup|Penulisan `makhlukHidup` salah (menggunakan huruf m kecil)|Seharusnya ditulis `MakhlukHidup`dengan menggunakan huruf kapital M|
| 5 |MakhlukHidup|`this.nama = jenis` penulisannya terbalik dengan `this.jenis = nama`|Seharusnya ditulis `this.nama = nama`|
| 6 |MakhlukHidup|`this.jenis = nama` penulisannya terbalik dengan `this.nama = jenis`|Seharusnya ditulis `this.jenis = jenis`|
| 7 |MakhlukHidup|Mengganti penggunaan `this.nama`|Seharusnya diganti menjadi `other.nama` mengikuti yang ada di parameter|
| 8 |MakhlukHidup|Mengganti penggunaan `this.umur`|Seharusnya diganti menjadi `other.umur` mengikuti yang ada di parameter|
| 9 |MakhlukHidup|Kesalahan type data pada `public void setUmur(String umur)`|Seharusnya `(String umur)` diganti dengan integer `(int umur)`|
| 10 |MakhlukHidup|Penulisan `nama = this.nama` terbalik|Seharusnya yang awalnya `nama = this.nama` diganti menjadi `this.nama = nama` jika dijalankan tidak error hanya saja itu kesalahan logika|
| 11 |MakhlukHidup|Kesalahan type data pada `public int getInfo()`|Seharusnya diganti `public String getInfo()`|
| 12 |TestAccess|`m.nama = "Kucing";` bersifat private|Seharusnya diganti `m.setNama("kucing");` karena nama bersifat private tidak bisa diakses langsung, jadi harus melewati method setter|
| 13 |TestAccess|Penulisan `MakhlukHidup` pada `m2.MakhlukHidup("Kuda");` salah|Mengikuti perubahan di no 3 pada tabel daftar error `MakhlukHidup` diubah menjadi `Makhluk`|
| 14 |TestAccess|Kesalahan nilai yang dimasukkan pada `m3.setUmur(-10);`|Seharusnya `m3.setUmur(10);` karena umur tidak boleh bernilai negatif|

**Perbaikan Source Code :**
```java
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
```

```java
public class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama("kucing");  // nama bersifat private, tidak bisa diakses langsung jadi harus lewat method setter
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.Makhluk("Kuda"); // mengikuti perubahan yang ada di line 16, MakhlukHidup diubah menjadi Makhluk
              
        System.out.println(m2.getInfo());
        
        m3.setUmur(10); // umur tidak boleh negatif
        
        System.out.println(m3.getInfo());

        
    }
}
```
**Output :**
```
Nama=kucing, Jenis=Unknown, Umur=15, Berat=10.0
Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0
Nama=Kuda, Jenis=Salah, Umur=12, Berat=170.0
Nama=Harimau, Jenis=Hewan, Umur=10, Berat=120.0
```