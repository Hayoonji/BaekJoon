import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        
        int N=scanner.nextInt();//개수
        String list[]=new String[N];
        str=scanner.nextLine(); 

        String a=scanner.next();//문자받기
        
        list=a.split("");

        int total=0;
        for(int i=0;i<N;i++){
            int res=Integer.parseInt(list[i]);
            total+=res;
        }
        System.out.println(total);
        scanner.close();
    }    
}