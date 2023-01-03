public class SwitchCaseDemo {
    public static void main(String[] args) {
        int sayi = 1;

        switch (sayi) {
            case 1:
                System.out.println("Verilen sayi 1 e esittir");
                break;
            case 2:
                System.out.println("Verilen sayi 2 ye esittir");
                break;
            default:
                System.out.println("Sayi 1 e ya da 2 ye esit degildir");
        }

        int bulundugumuzAy = 15;

        switch (bulundugumuzAy) {
            case 1:
                System.out.println("Bulundugumuz ay OCAKtir");
                break;
            case 2:
                System.out.println("Bulundugumuz ay Subattir");
                break;
            case 3:
                System.out.println("Bulundugumuz ay Marttir");
                break;
            case 4:
                System.out.println("Bulundugumuz ay Nisandir");
                break;
            case 5:
                System.out.println("Bulundugumuz ay Mayistir");
                break;
            case 6:
                System.out.println("Bulundugumuz ay Hazirandir");
                break;
            case 7:
                System.out.println("Bulundugumuz ay Temmuzdur");
                break;
            case 8:
                System.out.println("Bulundugumuz ay Agustostur");
                break;
            case 9:
                System.out.println("Bulundugumuz ay Eyluldur");
                break;
            case 10:
                System.out.println("Bulundugumuz ay Ekimdir");
                break;
            case 11:
                System.out.println("Bulundugumuz ay Kasimdir");
                break;
            case 12:
                System.out.println("Bulundugumuz ay Araliktir");
                break;
            default:
                System.out.println("Yazilan deger dogru degil");
        }

        String browser = "Chrome";

        switch(browser) {
            case "Chrome":
                System.out.println("Chrome browserini baslat");
                // webdriver.startDriver.startChrome
                break;
            case "Firefox":
                System.out.println("Firefox browserini baslat");
                // webDriver.startDriver.startFirefox
                break;
            default:
                System.out.println("Tanimsiz bir browser");
        }


    }
}
