import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kilo;
        double sonuc,boy;
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();

        sonuc = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : "+ sonuc);

    }
}

