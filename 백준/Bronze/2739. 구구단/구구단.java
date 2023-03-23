import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        int N=scanner.nextInt();
        //int B=scanner.nextInt();
        //str=scanner.nextLine();
        for(int i=1; i<10;i++){
            System.out.println(N+" "+"*"+" "+i+" "+"="+" "+N*i);
        }
        
        scanner.close();
    }    
}