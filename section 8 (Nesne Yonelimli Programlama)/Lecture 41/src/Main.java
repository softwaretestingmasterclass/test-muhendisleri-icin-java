public class Main {
    public static void main(String[] args) {
        // 3 adet sınıf oluştur: Araba, Sedan, Hatchback
        // 3 sınıf arasındaki ilişkiyi tanımla
        // kasaTipi, model, kullanimKm, fiyat ve kapı değişkenlerini tanımla
        // arabayiSur methotu oluşturun. Bu metot ile arabanın km si verilen değer ile arttırılsın ve konsola bir yazı yazılsın
        // Tüm sınıflarda constractor olmalı ve değişkenlerin tamamı ya da bir kısmı constractorlarda tanımlanmalı
        // satısFiyati adında bir metot oluşturarak arabanın satış fiyatını belirleyin.
        // Ana sınıfta 2 farklı araç oluşturarak, bu araçları sürüp, fiyatlarını güncelleyin.

        Sedan sedanCoupe = new Sedan("Opel", 10000, 500000, 5);
        System.out.println("Aracimin modeli " + sedanCoupe.getModel() + " kullanim km " + sedanCoupe.getKullanimKm() + " fiyati " + sedanCoupe.getFiyat()
                + " ve kapi sayisi " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyati(495000);

        System.out.println("Aracimin modeli " + sedanCoupe.getModel() + " kullanim km " + sedanCoupe.getKullanimKm() + " fiyati " + sedanCoupe.getFiyat()
                + " ve kapi sayisi " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(10000);
        sedanCoupe.satisFiyati(450000);

        System.out.println("Aracimin modeli " + sedanCoupe.getModel() + " kullanim km " + sedanCoupe.getKullanimKm() + " fiyati " + sedanCoupe.getFiyat()
                + " ve kapi sayisi " + sedanCoupe.getKapi());

        Hatchback hatchbackVolvo = new Hatchback("Volvo", 0, 1000000, 5);
        hatchbackVolvo.arabayiSur(1000);
        hatchbackVolvo.satisFiyati(950000);

        System.out.println("Aracimin modeli " + hatchbackVolvo.getModel() + " kullanim km " + hatchbackVolvo.getKullanimKm() + " fiyati " + hatchbackVolvo.getFiyat()
                + " ve kapi sayisi " + hatchbackVolvo.getKapi());

        hatchbackVolvo.arabayiSur(500);
        hatchbackVolvo.satisFiyati(945000);

        System.out.println("Aracimin modeli " + hatchbackVolvo.getModel() + " kullanim km " + hatchbackVolvo.getKullanimKm() + " fiyati " + hatchbackVolvo.getFiyat()
                + " ve kapi sayisi " + hatchbackVolvo.getKapi());


    }
}