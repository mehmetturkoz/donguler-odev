import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args){
        int n,r;

        Scanner input=new Scanner(System.in);
        System.out.print("kombinasyon icin n sayisini giriniz:");
        n= input.nextInt();
        System.out.print("kombinasyon icin n sayisini giriniz:");
        r= input.nextInt();

        int totaln=1;
        int totalr=1;
        int m=(n-r);
        int totalm=1;

        for(int i=1;i<=n;i++){
            totaln=totaln*i;
        }
        for(int j=1;j<=r;j++){
            totalr=totalr*j;
        }
        for(int k=1;k<=m;k++){
            totalm=totalm*k;
        }

        double kom=totaln/(totalr*totalm);
        System.out.println(kom);
    }
}
