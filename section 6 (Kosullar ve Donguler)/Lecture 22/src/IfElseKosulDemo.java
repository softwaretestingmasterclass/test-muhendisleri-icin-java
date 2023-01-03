public class IfElseKosulDemo {
    public static void main(String[] args) {
        int saat = 1000;

        if (saat < 1200){
            System.out.println("Saat ogleden once");
            if (saat == 1000){
                System.out.println("Gunaydin! saat 10");
            }
        } else if (saat == 1200) {
            System.out.println("Saat ogle 1200");
        } else {
            System.out.println("Saat ogleden sonra");
        }
    }
}
