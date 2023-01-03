public class LoopDonguProje {
    // Proje
    // "Hello World!" yazimiz mevcut
    // Bu yazi icerisindeki 'o' lari 0 ile degistir

    public static void main(String[] args) {

        String hello = "Hello World!";
        int stringUzunlugu = hello.length();
        int index = 0;
        String yeniString = "";


        while (index < stringUzunlugu){
            char bulunanKarakter = hello.charAt(index);
            if (bulunanKarakter == 'o'){
                yeniString = yeniString + 0;
            } else {
                yeniString = yeniString + bulunanKarakter;
            }
            index++;
        }
        System.out.println(yeniString);

    }
}
