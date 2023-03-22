import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        //str=scanner.nextLine();
        int C=scanner.nextInt();
        int max=0;
        int array[]={A,B,C};

        int total;
        if((A==B)&&(B==C)&&(A==C)){
            System.out.println(10000+A*1000);
        }else if((A!=B)&&(B!=C)&&(A!=C)){
            for(int i=0; i<array.length;i++){
                if(array[i]>max){
                    max=array[i];
                }
            }
            System.out.println(max*100);
        }else{
            if((A==B)&&(B!=C)&&(C!=A)){
                System.out.println(1000+A*100);
            }else if((A!=B)&&(B==C)&&(C!=A)){
                System.out.println(1000+B*100);
            }else if((A!=B)&&(B!=C)&&(C==A)){
                System.out.println(1000+C*100);
            }
        }
        scanner.close();
    }
}