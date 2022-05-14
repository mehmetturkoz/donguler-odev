import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args){
        int basamak;
        Scanner input=new Scanner(System.in);
        System.out.print("Ucgen Basamak Sayisi Giriniz: ");
        basamak=input.nextInt();

        for(int i=basamak;i>0;i--){
            for(int j=1;j<=basamak-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
