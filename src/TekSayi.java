import java.util.Scanner;
public class TekSayi {
    public static void main(String[] args){
        int number;
        int total=0;

        Scanner input=new Scanner(System.in);

        do{
           System.out.print("Sayi Giriniz:");
           number= input.nextInt();
                if ((number%2==0) && (number%4==0)){
                    total+=number;
                }
        } while(number%2==0);
        System.out.println("Cift ve Dort'e Tam Bolunen Sayilerin Toplami:"+total);
    }
}
