import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        //int N=scanner.nextInt();//정수 개수
    
        //str=scanner.nextLine(); 

        int intArray[]=new int[9];
        for(int i=0;i<9;i++){
            intArray[i]=scanner.nextInt();
            str=scanner.nextLine(); 
        }
        //최댓값 구하기
        int max=0;
        int number=0;
        for(int i=0;i<9;i++){
            if(intArray[i]>max){
                max=intArray[i];
                number=i;
            }
        }
        System.out.println(max);
        System.out.println(number+1);
        scanner.close();
    }    
}