import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int a, b;
    double hipotenus;

    Scanner inp = new Scanner(System.in);

    System.out.print( "birinci kenar : ");
    a = inp.nextInt();

    System.out.print("ikinci kenar : ");
    b = inp.nextInt();

    hipotenus = Math.sqrt((a*a) + (b*b));
    System.out.print("hipotenüs :" + hipotenus);

    }
}

