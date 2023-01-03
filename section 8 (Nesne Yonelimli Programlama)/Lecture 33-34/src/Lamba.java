public class Lamba {
    public boolean durumu = false;
    private String konum;

    public Lamba(String odaKonumu) {
        konum = odaKonumu;
        System.out.println("odamizin konumu " + konum);
    }

    public void lambaDurumu() {
        if (durumu){
            System.out.println(konum + " Lamba acik!");
        }else {
            System.out.println(konum + " Lamba kapali!");
        }
    }
}
