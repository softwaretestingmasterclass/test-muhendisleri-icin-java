public class MethodParametreDemo {
    public static void main(String[] args) {

        konsolCiktisi("Ozan");
        konsolCiktisi("Onur");
        System.out.println(toplamaIslemi(5,10));
        System.out.println(toplamaIslemi(100,456));
        sinavNotlari("Tibet", 100);
        sinavNotlari("Osman", 50);

        System.out.println("-------------");
        System.out.println(carpma(5,9));
        System.out.println(carpma(10,2));
        System.out.println(toplamaIslemi(50,100));
        System.out.println(toplamaIslemi(20,15,66));
        System.out.println(toplamaIslemi(8.0,4.5));


    }

    private static void konsolCiktisi(String isim){
        System.out.println("Merhaba Dunya!" + " ve merhaba " + isim);
    }

    private static int toplamaIslemi(int a, int b){
        return a+b;
    }

    private static int toplamaIslemi(int a, int b, int c){
        return a+b+c;
    }

    private static double toplamaIslemi(double a, double b){
        return a+b;
    }

    // Konsola kisinin adini ve sinav notunu yazdiran bir method olusturun
    // Method 2 adet parametre alsin, ad ve sinav notu

    private static void sinavNotlari(String ad, int not){
        System.out.println(ad + " isimli ogrencinin notu " + not);
    }

    private static int carpma(int a, int b){
        int carpmaSonucu = a*b;
        return carpmaSonucu;
    }

}
