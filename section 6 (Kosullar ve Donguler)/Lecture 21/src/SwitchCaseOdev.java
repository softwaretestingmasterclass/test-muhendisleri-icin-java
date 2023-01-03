public class SwitchCaseOdev {
    // Haftanin 7 gunu vardir
    // Her gun icin "Bugun gunlerden -verilen gun- " kosola yazdir
    public static void main(String[] args) {

        int haftaninGunu = 5;

        switch (haftaninGunu) {
            case 1 -> System.out.println("Bugun gunlerden Pazartesi");
            case 2 -> System.out.println("Bugun gunlerden Sali");
            case 3 -> System.out.println("Bugun gunlerden Carsamba");
            case 4 -> System.out.println("Bugun gunlerden Persembe");
            case 5 -> System.out.println("Bugun gunlerden Cuma");
            case 6 -> System.out.println("Bugun gunlerden Cumartesi");
            case 7 -> System.out.println("Bugun gunlerden Pazar");
        }
    }
}
