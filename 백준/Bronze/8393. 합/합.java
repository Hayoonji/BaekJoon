import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        int T=scanner.nextInt();
        int total=0;
        //int list[]=new int[T];
        for(int i=1;i<=T;i++){
            total+=i;
        }
        System.out.println(total);
        scanner.close();
    }    
}