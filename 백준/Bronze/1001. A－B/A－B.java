import java.util.Scanner;

public class Main {
    public static int minus(int A, int B){
        return A-B;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int s;
        s=minus(A,B);
        System.out.println(s);

        scanner.close();
    }
}