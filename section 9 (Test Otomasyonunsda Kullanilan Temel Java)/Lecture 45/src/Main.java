public class Main {
    public static void main(String[] args) {
        Araba ilkArabam = new Araba();
        ilkArabam.setModel("Volvo");
        System.out.println("Ilk arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);
        Araba.arabaFiyati = 450000;
        System.out.println("Ilk arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);

        Araba ikinciArabam = new Araba();
        ikinciArabam.setModel("BMW");
        System.out.println("Ikinci arabamin modeli " + ikinciArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);

        Araba ucuncuArabam = new Araba();
        ucuncuArabam.setModel("Opel");
        System.out.println("Ucuncu arabamin modeli " + ucuncuArabam.getModel() + " ve fiyati " + ucuncuArabam.arabaFiyati);

    }
}