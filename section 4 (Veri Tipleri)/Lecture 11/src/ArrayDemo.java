public class ArrayDemo {
    public static void main(String[] args) {
        String[] isimler = {"Ozan", "Ece", "Osman", "Deniz"};
        int[] sayilar = {5,4,46,303,5005};

        System.out.println(isimler[1]);
        System.out.println(sayilar[3]);

        System.out.println(isimler[3]);
        isimler[3] = "Onur";
        System.out.println(isimler[3]);

        String[] webUrl = {"www.sayfa1.com", "www.sayfa2.com"};
        System.out.println(webUrl[0]);

        int diziUzunlugu = isimler.length;
        System.out.println(diziUzunlugu);

        for (int i=0;i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }


    }
}
