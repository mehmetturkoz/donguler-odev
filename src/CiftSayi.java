import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {

        int k;
        int toplam=0;
        int tekrar=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {

            if (i % 4 == 0 && i % 3 == 0) {
                System.out.println(i);
                toplam+=i;
                tekrar++;
            }
        }
        System.out.println("Toplam:"+toplam);
        System.out.println("Ortalama: "+(toplam/tekrar));
    }
}
