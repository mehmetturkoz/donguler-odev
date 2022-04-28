import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {

        int k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        k = scan.nextInt();

        for (int i=0;i<=k;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}