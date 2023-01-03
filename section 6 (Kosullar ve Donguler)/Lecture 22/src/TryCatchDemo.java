public class TryCatchDemo {
    public static void main(String[] args) {

        int [] sayilir = {1,5,10,555,678};
        try{
            System.out.println(sayilir[33]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Hata sonrasi konsola yazdir");

    }
}
