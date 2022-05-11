import java.util.Scanner;
public class MinMax {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz:");
        int sayac=input.nextInt();
        int min=0;
        int max=0;
        int n;

        for(int i=1;i<=sayac;i++){
            System.out.print(i+". sayiyi giriniz:");
            n= input.nextInt();
            if(i==1){
                min=n;
                max=n;
            }else if(n>=max){
                max=n;
            }else if(n<=min){
                min=n;
            }
        }
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }
}
