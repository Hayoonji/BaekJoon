import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        while(scanner.hasNextLine()){//다음줄이 없을때까지 while문 반복
                String str2=scanner.nextLine();
                System.out.println(str2);
        }


        scanner.close();
    }    
}