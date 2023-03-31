import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str;
        //str=scanner.nextLine(); 
        char Arr[][]={{'A','B','C'},
                        {'D','E','F'},
                        {'G','H','I'},
                        {'J','K','L'},
                        {'M','N','O'},
                        {'P','Q','R','S'},
                        {'T','U','V'},
                        {'W','X','Y','Z'}};

        int total=0;
        String[] S = scanner.next().split("");

        for(int k=0;k<S.length;k++){
            for(int i=0;i<Arr.length;i++){
                for(int j=0;j<Arr[i].length;j++){
                    String word=Character.toString(Arr[i][j]);
                    
                    if(S[k].equals(word)){
                        total+=(i+3);
                        
                    }
                }
            }
        }
        System.out.println(total);

        scanner.close();
    }    
}
