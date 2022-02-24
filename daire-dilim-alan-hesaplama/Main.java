import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14, a, dilim;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a = inp.nextDouble();

        dilim = (pi * (r*r) * a) / 360;
        System.out.print("Daire diliminin alanı : " +dilim);

    }
}

