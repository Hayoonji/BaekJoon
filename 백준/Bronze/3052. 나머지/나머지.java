import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        //int N=scanner.nextInt();//바구니 개수
        
        int intArray[]=new int[10];
        for(int i=0;i<10;i++){
            int n=scanner.nextInt();
            intArray[i]=n%42;
            str=scanner.nextLine(); 
        }
        
        
        int tmp=0;
        for(int i=0;i<10;i++){
            int cnt=0;
            for(int j=i+1;j<10;j++){
                if(intArray[i]==intArray[j]){
                    cnt++;
                }
            }
            if(cnt==0){
                tmp++;
            }
        }
        
        System.out.println(tmp);
        scanner.close();
    }    
}