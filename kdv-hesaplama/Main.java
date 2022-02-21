import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double netTutar, toplamTutar, kdvTutar, kdvOran;

        Scanner inp = new Scanner(System.in);

        System.out.print("Net tutar : ");
        netTutar = inp.nextDouble();

        //kdvOran = netTutar < 1000 ? 0.18 : 0.8;
        kdvOran = netTutar > 0 ? netTutar > 1000 ? 0.8 : 0.18 : 0;

        kdvTutar = netTutar * kdvOran;
        toplamTutar = kdvTutar+netTutar;

        System.out.println("KDVsiz fiyat :"+ netTutar);
        System.out.println("KDVli fiyat :"+toplamTutar);
        System.out.println("KDV tutarı :"+kdvTutar);




    }
}

