import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str="long ";
        
        int X=scanner.nextInt(); 
        int count=X/4;
        
        //int list[]=new int[T];
        //str=scanner.nextLine();
        String repeated=str.repeat(count);
        System.out.println(repeated+"int");
        
        scanner.close();
    }    
}