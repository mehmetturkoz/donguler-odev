import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        int number1,number2;
        System.out.print("1.Sayiyi Giriniz:");
        number1= input.nextInt();
        System.out.print("2.Sayiyi Giriniz:");
        number2= input.nextInt();

        int min = (number1 < number2) ? number1:number2;
        int ebob=1;
        int i=1;

        while (i<=min){
            if(number1%i==0 && number2%i==0){
               ebob=i;
            }
            i++;
        }
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ (number1*number2)/ebob);

    }
}
