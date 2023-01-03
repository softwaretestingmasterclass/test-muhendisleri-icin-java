public class LoopDonguDemo {
    public static void main(String[] args) {

        for (double i = 0; i < 10; i += 0.25) {
            System.out.println("Degiskenimizin degiri " + i);
        }

        System.out.println("---------------------");

        int sayfa = 5;
        for (int i = 1; i <= sayfa; i++) {
            System.out.println("sayfa sayisi " + i);
            if (i == 3) {
                System.out.println("Kosul saglandi " + i);
                break;
            }
        }

        System.out.println("---------------------");

        String[] isimler = {"Ozan", "Onur", "Hazal", "Tibet"};

        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Listedeki isimler " + isimler[i]);
        }

        System.out.println("--------------------");

        for (String isim:isimler){
            System.out.println("Gelismis dongu ile isimler " + isim);
        }

    }
}
