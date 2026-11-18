public class Main {
    public static void main(String[] args) {
        // 1. Kitap nesnesi oluşturma
        Kitap k1 = new Kitap("Suç ve Ceza", "Dostoyevski", "9759954471");
        
        // 2. Kitap kopyaları oluşturma (İlişki kuruldu)
        KitapKopyasi kopya1 = new KitapKopyasi("KOPYA-01", k1);
        KitapKopyasi kopya2 = new KitapKopyasi("KOPYA-02", k1);

        // 3. Kullanıcı oluşturma
        Kullanici u1 = new Kullanici("İsmail Anbarpınar", "20240101");

        // Başlangıç durumları
        System.out.println("=== KİTAPHANE SİSTEMİ BAŞLATILDI ===");
        u1.bilgiYazdir();
        k1.bilgiGoster();
        System.out.println();

        kopya1.durumYazdir();
        kopya2.durumYazdir();
        System.out.println();

        // 4. Ödünç kaydı oluşturma ve nesneleri birbirine bağlama (İlişki kurma)
        OduncKaydi islem1 = new OduncKaydi(u1, kopya1, "19.11.2026");
        islem1.oduncBilgisiYazdir();
        System.out.println();

        // Ödünç verildikten sonra kopyaların son durumu
        System.out.println("--- Güncel Raf Durumu ---");
        kopya1.durumYazdir();
        kopya2.durumYazdir();
    }
}