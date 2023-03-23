import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int T=scanner.nextInt();
        int list[]=new int[100];
        int A;
        int B;
        //str=scanner.nextLine();        
        for(int i=0;i<100;i++){
            A=scanner.nextInt();
            B=scanner.nextInt();
            if((A==0)&&(B==0)){
                break;
            }
            list[i]=A+B;
            str=scanner.nextLine();
            
        }
        for(int i=0;i<100;i++){
            if(list[i]==0){
                break;
            }else{
                System.out.println(list[i]);
            }
            
        }
        
        
        scanner.close();
    }    
}
