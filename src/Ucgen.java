import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args){
        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        n= input.nextInt();

        for(int i=1;i<=n;i++) {
            for (int j =1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;1<=i;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
