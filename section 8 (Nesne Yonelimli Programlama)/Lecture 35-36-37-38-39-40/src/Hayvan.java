abstract class Hayvan {
    protected String isim;
    private String cins;
    private int yas;

    public Hayvan(String isim, String cins, int yas){
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
        return isim = yeniIsim;
    }

    abstract void sesCikar();
    public void uyku (){
        System.out.println("Hayvan uyuyor");
    }

}
