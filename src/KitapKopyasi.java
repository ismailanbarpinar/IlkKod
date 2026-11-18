public class KitapKopyasi {
    private String kopyaId;
    private Kitap kitap;
    private boolean duruyorMu; // true ise rafta, false ise ödünçte

    public KitapKopyasi(String kopyaId, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.duruyorMu = true;
    }

    public String getKopyaId() {
        return kopyaId;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public boolean isDuruyorMu() {
        return duruyorMu;
    }

    public void setDuruyorMu(boolean duruyorMu) {
        this.duruyorMu = duruyorMu;
    }

    public void durumYazdir() {
        String durumStr = duruyorMu ? "Rafta Müsait" : "Ödünç Verildi";
        System.out.println("Kopya ID: " + kopyaId + " -> " + kitap.getKitapAdi() + " (" + durumStr + ")");
    }
}