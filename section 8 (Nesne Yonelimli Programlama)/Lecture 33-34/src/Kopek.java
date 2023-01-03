public class Kopek {
    private String isim;
    private String cins;
    private int yas;

    public Kopek(String isim, String cins, int yas){
        this.isim = isim;
        this.cins = cins;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public String getCins() {
        return cins;
    }

    public int getYas() {
        return yas;
    }

    public String setIsim(String yeniIsim) {
        return this.isim = yeniIsim;
    }

}
