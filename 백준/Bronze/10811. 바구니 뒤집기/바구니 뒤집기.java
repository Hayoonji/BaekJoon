import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//바구니 개수
        int M=scanner.nextInt();//공 바꾸는 횟수
    
        int intArray[]=new int[N+1];//바구니
        for(int q=0;q<=N;q++){
            intArray[q]=q;//N번째 바구니에 N개 공 넣기
        }
        str=scanner.nextLine(); 
        for(int q=0;q<M;q++){
            int i=scanner.nextInt();
            int j=scanner.nextInt();
            
            while(i<j){
                int a=intArray[j];
                intArray[j]=intArray[i];
                intArray[i]=a;
                i++;
                j--;
            }
        }

        for(int r=1;r<=N;r++){
            System.out.print(intArray[r]+" ");
        }

        scanner.close();
    }    
}
