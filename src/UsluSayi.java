import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args){
        int n,r;


        Scanner input=new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz:");
        n= input.nextInt();
        System.out.print("Us sayisini giriniz:");
        r= input.nextInt();

        int sonuc=1;

        for(int i=1;i<=r;i++){
            sonuc=sonuc*n;
        }
            System.out.println(sonuc);
    }
}
