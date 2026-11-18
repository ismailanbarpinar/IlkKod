public class Kullanici {
    private String adSoyad;
    private String ogrenciNo;

    public Kullanici(String adSoyad, String ogrenciNo) {
        this.adSoyad = adSoyad;
        this.ogrenciNo = ogrenciNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void bilgiYazdir() {
        System.out.println("Kullanıcı: " + adSoyad + " (No: " + ogrenciNo + ")");
    }
}