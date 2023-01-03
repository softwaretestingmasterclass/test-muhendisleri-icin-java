public class Main {
    public static void main(String[] args) {
//        Insan ilkInsan = new Insan();
//        ilkInsan.konsolaYazdir();
//        ilkInsan.konsolaYazdir();

        Lamba salonLambasi = new Lamba("salon");
        salonLambasi.lambaDurumu();
        salonLambasi.durumu = true;
        salonLambasi.lambaDurumu();

        Lamba yatakLambasi = new Lamba("yatak odasi");
        yatakLambasi.lambaDurumu();
        yatakLambasi.durumu = true;
        yatakLambasi.lambaDurumu();
        yatakLambasi.durumu = false;
        yatakLambasi.lambaDurumu();

    }
}