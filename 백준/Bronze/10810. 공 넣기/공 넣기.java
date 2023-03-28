import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//바구니 개수
        int M=scanner.nextInt();//공 넣는 횟수
    
        //str=scanner.nextLine(); 
        int intArray[]=new int[N];//바구니
        for(int q=0;q<M;q++){
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            int k=scanner.nextInt();
            for(int p=i;p<j+1;p++){
                intArray[p-1]=k;
            }
        }

        for(int r=0;r<N;r++){
        
            System.out.println(intArray[r]);
        }
        
        
        
        scanner.close();
    }    
}