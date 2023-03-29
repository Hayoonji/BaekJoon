import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        int N=scanner.nextInt();//개수
        String list[]=new String[N];

        //str=scanner.nextLine(); 
        for(int i=0; i<N; i++){
            str=scanner.next();
            int len=str.length();
            System.out.println(str.substring(0,1)+""+str.substring(len-1,len));
        }
        
        //System.out.println(str.length());
        

        scanner.close();
    }    
}