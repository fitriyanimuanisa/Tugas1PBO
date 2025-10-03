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
