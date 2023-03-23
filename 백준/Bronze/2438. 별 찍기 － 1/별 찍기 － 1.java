import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        //int list[]=new int[T];
        //str=scanner.nextLine();        
        //scanner.close();
        String str="*";
        for(int i=1;i<=N;i++){
            String repeated=str.repeat(i);
            System.out.println(repeated);
        }

    }    
}