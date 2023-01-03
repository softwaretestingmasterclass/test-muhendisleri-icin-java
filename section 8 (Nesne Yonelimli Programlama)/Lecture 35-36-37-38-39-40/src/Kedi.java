public class Kedi extends Hayvan{

    public Kedi(String isim, String cins, int yas) {
        super(isim, cins, yas);
    }

    @Override
    void sesCikar() {
        System.out.println("Miyav miyav");
    }

    public void komut() {
        System.out.println( super.isim + " buraya gel");
    }
}
