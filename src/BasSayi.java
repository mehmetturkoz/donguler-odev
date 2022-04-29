import java.util.Scanner;
public class BasSayi {
    public static void main(String[] args){

        int number;

        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        number=inp.nextInt();

        int basValue;
        int result=0;

        while (number!=0){
            basValue=number%10;
            result+=basValue;
            number/=10;
        }
        System.out.println("Basamak Sayilari Toplami:"+result);
    }
}
