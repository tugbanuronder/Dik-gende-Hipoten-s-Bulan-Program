import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        double a,b,c,u,alan;

        System.out.print("a kenar uzunlugunu giriniz:");
        a=input.nextFloat();
        System.out.print("b kenar uzunlugunu giriniz:");
        b=input.nextFloat();
        System.out.print("c kenar uzunlugunu giriniz:");
        c=input.nextFloat();

        u=(a+b+c)/2;

        alan= Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Ucgenin Alani:" + alan);



    }

}
