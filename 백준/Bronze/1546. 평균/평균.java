import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//과목 개수
            
        int intArray[]=new int[N];//바구니
        
        str=scanner.nextLine(); 
        for(int q=0;q<N;q++){
            intArray[q]=scanner.nextInt();
        }
        float max=0;
        for(int q=0;q<N;q++){
            if(intArray[q]>max){
                max=intArray[q];
            }
        }
        float total=0;
        for(int q=0;q<N;q++){
            float result=(float)intArray[q];
            total+=(result/max)*100;
            
        }
        System.out.println(total/N);

        scanner.close();
    }    
}