public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kopya;
    private String alisTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kopya, String alisTarihi) {
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.alisTarihi = alisTarihi;
        // Ödünç verildiği için kopyanın durumunu güncelliyoruz
        this.kopya.setDuruyorMu(false);
    }

    public void oduncBilgisiYazdir() {
        System.out.println("--- Ödünç İşlem Detayı ---");
        System.out.println("Alan Kişi: " + kullanici.getAdSoyad());
        System.out.println("Alınan Kitap: " + kopya.getKitap().getKitapAdi() + " [Kopya No: " + kopya.getKopyaId() + "]");
        System.out.println("İşlem Tarihi: " + alisTarihi);
        System.out.println("-------------------------");
    }
}