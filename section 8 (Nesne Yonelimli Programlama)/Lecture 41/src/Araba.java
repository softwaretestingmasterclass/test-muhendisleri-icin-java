public class Araba {
    // kasaTipi, model, kullanimKm, fiyat ve kapı değişkenlerini tanımla
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private int fiyat;
    private int kapi;

    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi){
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public void arabayiSur(int surulenKm){
        this.kullanimKm += surulenKm;
        System.out.println("Arabanin yeni kilometresi " + this.kullanimKm);
    }

    public int satisFiyati(int yeniSatisFiyati){
        return this.fiyat = yeniSatisFiyati;
    }
}
