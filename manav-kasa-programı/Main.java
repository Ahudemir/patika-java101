import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, toplam, aKg, eKg, dKg, mKg, pKg;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? :");
        aKg = inp.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        eKg = inp.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        dKg = inp.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        mKg = inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        pKg = inp.nextDouble();

        toplam = (armut*aKg)+(elma*eKg)+(domates*dKg)+(muz*mKg)+(patlican*pKg);
        System.out.print("Toplam tutar :"+ toplam);
    }
}

