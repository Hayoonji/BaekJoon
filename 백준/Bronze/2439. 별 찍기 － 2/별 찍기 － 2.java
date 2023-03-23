import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        //int list[]=new int[T];
        //str=scanner.nextLine();        
        //scanner.close();
        String str="*";
        String str2=" ";
        for(int i=1;i<=N;i++){
            String repeated=str.repeat(i);
            String repeated2=str2.repeat(N-i);
            System.out.println(repeated2+repeated);
        }

    }    
}