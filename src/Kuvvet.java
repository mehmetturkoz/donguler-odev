import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args){
        int n;

        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        n = inp.nextInt();

        for (int i=1;i<n;i*=4){
            System.out.print(i+"-");

        }
        System.out.println(" ");

        for (int k=1;k<n;k*=5){
            System.out.print(k+"-");
        }
    }
}
