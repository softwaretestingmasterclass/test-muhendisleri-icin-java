public class VeriTipleriOdev {
    public static void main(String[] args) {

        // 3 adet değer içeren bir array oluşturun. Değerler: Java, Python, C
        // 1'den 5 e kadar seviye içeren bir array oluşturun
        // Bu verileri kullanarak konsola: Java, Python ve C yazılım dillerindeki seviyenizi yazdırın.

        String[] yazilimDilleri = {"Java", "Python", "C"};
        int[] yazilimDiliSeviyeleri = {1, 2, 3, 4, 5};

        System.out.println(yazilimDilleri[0] + " dilindeki seviyem " + yazilimDiliSeviyeleri[4]);
        System.out.println(yazilimDilleri[1] + " dilindeki seviyem " + yazilimDiliSeviyeleri[2]);
        System.out.println(yazilimDilleri[2] + " dilindeki seviyem " + yazilimDiliSeviyeleri[1]);

    }
}
