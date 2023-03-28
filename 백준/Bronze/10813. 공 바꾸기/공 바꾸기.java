import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//바구니 개수
        int M=scanner.nextInt();//공 바꾸는 횟수
    
        int intArray[]=new int[N];//바구니
        for(int q=0;q<N;q++){
            intArray[q]=q+1;
        }
        str=scanner.nextLine(); 
        for(int q=0;q<M;q++){
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            
            int k=intArray[i-1];
            intArray[i-1]=intArray[j-1];
            intArray[j-1]=k;
        }

        for(int r=0;r<N;r++){
            System.out.print(intArray[r]+" ");
        }

        scanner.close();
    }    
}