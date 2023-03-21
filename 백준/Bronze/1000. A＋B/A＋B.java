import java.util.Scanner;

public class Main {
    public static int sum(int A, int B){
        return A+B;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int s;
        s=sum(A,B);
        System.out.println(s);

        scanner.close();
    }
}