import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        str=scanner.nextLine();
        int C=scanner.nextInt();

        int time=A*60+B;
        
        time=time+C;
        int h=(time/60)%24;
        int m=time%60;
        System.out.println(h+" "+m);
        
        
        scanner.close();

    }
}
