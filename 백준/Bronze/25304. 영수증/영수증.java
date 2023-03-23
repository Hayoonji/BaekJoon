import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        int X=scanner.nextInt(); //총금액
        int N=scanner.nextInt(); //물건 종류의 수
        int total=0;
        //int list[]=new int[T];
        for(int i=1;i<=N;i++){
            int a=scanner.nextInt(); //물건 가격
            int b=scanner.nextInt();//물건 개수
            total+=a*b;
            str=scanner.nextLine();
        }
        if(X==total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }    
}
