import java.util.Scanner;

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
        str=scanner.nextLine(); 
        int T=scanner.nextInt();
        int cnt=0;
        for(int i=0;i<N;i++){
            if(intArray[i]==T){
                cnt++;
            }
        }
        System.out.println(cnt);
        scanner.close();
    }    
}