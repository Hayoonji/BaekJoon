import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        //int N=scanner.nextInt();//개수
        //String list[]=new String[N];
        //str=scanner.nextLine(); 
        
        char c=scanner.next().charAt(0);
        System.out.println((int)c);

        scanner.close();
    }    
}
