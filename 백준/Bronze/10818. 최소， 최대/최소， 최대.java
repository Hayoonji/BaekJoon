
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//정수 개수
    
        str=scanner.nextLine(); 

        int intArray[]=new int[N];
        for(int i=0;i<N;i++){
            intArray[i]=scanner.nextInt();
        }
        Arrays.sort(intArray);
        System.out.println(intArray[0]+" "+intArray[N-1]);
        scanner.close();
    }    
}