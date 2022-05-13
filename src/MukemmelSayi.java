import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args){
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        number=input.nextInt();
        int total=0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        if(total==number){
            System.out.println(number+" Mukemmel Sayidir.");
        }else{
            System.out.println(number+" Mukemmel Sayi Degildir.");
        }
    }
}