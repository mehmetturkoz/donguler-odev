import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac basamakli fibonacci serisi yazdirmak istiyorsunuz:");
        n= input.nextInt();

        int first=0;
        int second=1;
        int total;

        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            total=first+second;
            first=second;
            second=total;
        }
    }
}
