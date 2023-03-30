import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //String str;
        //str=scanner.nextLine(); 
        String str=scanner.nextLine(); 
        scanner.close();
        //String a[]=new String[N];
        StringTokenizer st=new StringTokenizer(str," ");

        System.out.println(st.countTokens());
        
    }    
}