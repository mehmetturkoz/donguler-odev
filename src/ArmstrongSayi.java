import java.util.Scanner;
public class ArmstrongSayi {
    public static void main(String[] args){

        int number;

        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        number=input.nextInt();

        int basNumber=0;
        int tempNumber=number;
        int basValue;
        int result=0;
        int basPow;

        while (tempNumber != 0){
            tempNumber/=10;
            basNumber++;
        }

        tempNumber=number;

        while (tempNumber != 0){
            basValue=tempNumber%10;
            basPow=1;
            for(int i=1;i<=basNumber;i++){
                basPow*=basValue;
            }
            result+=basPow;
            tempNumber/=10;
        }

                if(result==number){
                    System.out.println(number+" sayisi bir armstrong sayidir.");
                }else{
                    System.out.println(number+" sayisi bir armstrong sayi degildir.");
                }
    }
}
