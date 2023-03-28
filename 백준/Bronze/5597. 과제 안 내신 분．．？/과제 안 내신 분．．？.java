import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        //int N=scanner.nextInt();//바구니 개수
        
    
        int intArray[]=new int[30];//바구니
        for(int i=0;i<30;i++){
            intArray[i]=0;
        }
        for(int i=0;i<28;i++){
            int n=scanner.nextInt();
            intArray[n-1]=n;
            str=scanner.nextLine(); 
        }
        for(int i=0;i<30;i++){
            if(intArray[i]==0){
                System.out.println(i+1);
            }
        }
        

        scanner.close();
    }    
}