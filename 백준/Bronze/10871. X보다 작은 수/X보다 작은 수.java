import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //int list[]=new int[100];
        int N=scanner.nextInt();//정수 개수
        int X=scanner.nextInt(); //정수X
        str=scanner.nextLine(); 

        int intArray[]=new int[N];

        for(int i=0;i<N;i++){
            intArray[i]=scanner.nextInt();
        }
       
    
        for(int i=0;i<N;i++){
            if(intArray[i]<X){
                System.out.print(intArray[i]+" ");
                
            
            }
        }
        
    
        
        scanner.close();
    }    
}
