public class VeriTipleriDemosu {
    public static void main(String[] args) {
        byte myByte = 50;
        short myShort = 25000;
        int myInt = 1500000000;
        long myLong = 1000000000000000000L;
        float myFloat = 56.44f;
        double myDouble = 56.55;
        char myChar = 'B';
        boolean myBoolean = true;

        int veriGenisletme = myByte;
        System.out.println(veriGenisletme);

        int veriDaraltma = (int) myDouble;
        System.out.println(veriDaraltma);

        int floatDaraltma = (int) myFloat;
        System.out.println(floatDaraltma);

    }
}
