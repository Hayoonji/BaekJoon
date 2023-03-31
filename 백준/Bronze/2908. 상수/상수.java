import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //String str;
        //str=scanner.nextLine(); 
        int a=scanner.nextInt(); 
        int len=(int)(Math.log10(a)+1);
        double res=0;
        for(int i=0;i<len;i++){
            int c=a%10; //일의 자리
            res+=c*(Math.pow(10,len-i-1));
            a=a/10;
        }

        int b=scanner.nextInt();
        int len2=(int)(Math.log10(b)+1);
        double res2=0;
        for(int i=0;i<len2;i++){
            int d=b%10; //일의 자리
            res2+=d*(Math.pow(10,len2-i-1));
            b=b/10;
        }

        if((int)res>(int)res2){
            System.out.println((int)res);
        }else{
            System.out.println((int)res2);
        }
        
        scanner.close();
    }    
}