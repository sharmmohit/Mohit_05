import java.util.Scanner;

public class Prime {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Up to How many Numbers you want to print Prime Numbers");
        int num=sc.nextInt();
        
        
        for (int i = 2; i <= num; i++) {
            int cnt=0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    cnt=cnt+1;
                }
            }
            if (cnt==2){
                System.out.println(i + " "+ "Is an Prime Number");
            }
                
            

            
        }

    }


    
}
