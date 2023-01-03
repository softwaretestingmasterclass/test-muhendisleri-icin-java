public class OperatorlerOdev {

    // Iki adet integer, 85 ve 45
    // Konsola değişkenleri kullanarak iki ayri satirda sayilarin toplamini ve çarpımını yazdırın.
    // Örnek: 'Sayıların toplamı 130 dur'
    // Eğer sayıların çarpımı 3000 den büyük  ve 4000 den küçükse, konsola sayıların çarpım değerini yazınız.

    public static void main(String[] args) {

        int a = 85;
        int b = 45;

        int carpim = a*b;

        System.out.println("Sayilarin toplami " + a+b + " degerindedir.");
        System.out.println("Sayilarin carpimi " + carpim + " degerindedir.");

        if (carpim > 3000 && carpim < 4000){
            System.out.println("Carpim degeri " + carpim);
        }

    }

}
