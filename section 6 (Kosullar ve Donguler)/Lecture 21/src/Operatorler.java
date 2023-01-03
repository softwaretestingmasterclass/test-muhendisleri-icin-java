public class Operatorler {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;

        double c = 55.12;

        // Aritmetik operatorler
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a+c);
        System.out.println("-----------------");
        // ++ , --
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(--b);
        System.out.println(--b);

        // Atama operatorler

        System.out.println("----------");

        int d = 50;
        d += 3;
        System.out.println(d);

        d-=2;
        System.out.println(d);

    }
}
