import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        int T=scanner.nextInt();
        int list[]=new int[T];
        for(int i=0;i<T;i++){
            int A=scanner.nextInt();
            int B=scanner.nextInt();
            list[i]=A+B;
            str=scanner.nextLine();
        }
        for(int i=0;i<T;i++){
            System.out.println(list[i]);
        }
        scanner.close();
    }    
}