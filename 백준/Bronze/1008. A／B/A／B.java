import java.util.Scanner;

public class Main {
    public static double div(double A, double B){
        return A/B;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        double A=scanner.nextDouble();
        double B=scanner.nextDouble();
        double s;

        s=div(A,B);
        System.out.println(s);

        scanner.close();
    }
}