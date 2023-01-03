import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> isimlerListesi = new ArrayList<>();

        isimlerListesi.add("Ozan");
        isimlerListesi.add("Suzy");
        System.out.println(isimlerListesi);
        isimlerListesi.add("Tibet");
        isimlerListesi.add("Onur");
        System.out.println(isimlerListesi);
        System.out.println(isimlerListesi.get(0));
        isimlerListesi.set(1,"Hazal");
        System.out.println(isimlerListesi);
        String silinenIsim = isimlerListesi.remove(0);
        System.out.println(silinenIsim + " listemizden cikartilmistir.");
        System.out.println(isimlerListesi);
        isimlerListesi.add("Canberk");
        isimlerListesi.add("Sofia");
        isimlerListesi.add("Gulin");
        System.out.println(isimlerListesi);
        System.out.println("Listemizde olan element sayisi " + isimlerListesi.size() + " dir.");

        System.out.println("Listemizde ozan ismi " + isimlerListesi.contains("Ozan"));
        System.out.println("Listemizde Tibet ismi " + isimlerListesi.contains("Tibet"));

        System.out.println("Ismin liste numarasi " + isimlerListesi.indexOf("Canberk"));
        System.out.println(isimlerListesi.isEmpty());

        System.out.println("---------------------------");

        for (String isim:isimlerListesi){
            System.out.println(isim);
        }


    }
}
