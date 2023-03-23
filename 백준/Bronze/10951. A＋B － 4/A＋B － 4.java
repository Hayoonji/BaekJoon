import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int T=scanner.nextInt();
        int list[]=new int[100];
        int A;
        int B;
        //str=scanner.nextLine(); 
        while(scanner.hasNext()){
            A=scanner.nextInt();
            B=scanner.nextInt();
            System.out.println(A+B);
        }       
        
        scanner.close();
    }    
}
