import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        String a=scanner.next();
        //int list[]=new int[100];
        str=scanner.nextLine(); 
        int T=scanner.nextInt();
        char A=a.charAt(T-1);

        System.out.println(A);
        scanner.close();
    }    
}