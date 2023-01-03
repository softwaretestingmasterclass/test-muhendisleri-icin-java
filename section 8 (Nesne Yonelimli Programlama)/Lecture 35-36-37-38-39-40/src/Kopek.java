public class Kopek extends Hayvan {

    public Kopek (String isim, String cins, int yas){
        super(isim,cins,yas);
    }

    @Override
    void sesCikar() {
        System.out.println("Hav Hav");
    }

    @Override
    public void uyku(){
        super.uyku();
        System.out.println("Kopek uyurken horluyor .... z....");
    }
}
