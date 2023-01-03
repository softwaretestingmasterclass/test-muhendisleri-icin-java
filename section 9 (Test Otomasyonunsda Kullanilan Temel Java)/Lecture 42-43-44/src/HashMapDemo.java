import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> ogrenciNotu = new HashMap<>();
        ogrenciNotu.put("Ozan" , 100);
        ogrenciNotu.put("Tibet", 50);
        ogrenciNotu.put("Onur" , 90);

        System.out.println(ogrenciNotu);
        System.out.println("Ozanin ders notu: " + ogrenciNotu.get("Ozan"));
        System.out.println("Butun anahtar degerleri : " + ogrenciNotu.keySet());
        System.out.println("Butun degerler : " + ogrenciNotu.values());
        System.out.println("Butun girdi ciftleri : " + ogrenciNotu.entrySet());

        ogrenciNotu.replace("Ozan",30);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove("Ozan");
        System.out.println(ogrenciNotu);

    }
}
