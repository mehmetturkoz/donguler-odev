import java.util.Scanner;
public class Atm {
    public static void main(String[] args){
        String userName,password;
        int right=3;
        int bakiye=2000;
        int select;

        while(right>0){
            Scanner input=new Scanner(System.in);
            System.out.print("Lutfen Kullanici Adinizi Giriniz:");
            userName=input.nextLine();
            System.out.print("Lutfen Parolanizi Giriniz:");
            password=input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merahaba.Kodluyoruz Bankasina Hosgeldiniz.");
               do {
                   System.out.println("1.Para Cekme\n2.Para Yatirma\n3.Bakiye Sorgulama\n4.Cikis");
                   System.out.print("Lutfen yapmak istediginiz islemi seciniz:");
                   select = input.nextInt();

                   switch (select) {
                       case 1:
                           System.out.print("Cekmek istediginiz tutari giriniz:");
                           int miktar = input.nextInt();
                                if (miktar > bakiye) {
                                     System.out.println("Yetersiz Bakiye.");
                                 } else {
                                     bakiye -= miktar;
                                    }
                                break;
                       case 2:
                           System.out.print("Yatirmak istediginiz tutari giriniz:");
                           miktar = input.nextInt();
                           bakiye += miktar;
                           break;
                       case 3:
                           System.out.println("Bakiyeniz:" + bakiye);
                           break;

                   }
               }
                   while (select != 4) ;
                   System.out.println("Tekrar Gorusmek Uzere");
                   break;

            }else{
                right--;
                System.out.println("Yanlis parola veya sifre girdiniz.Tekrar Deneyiniz!!");
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur.Banka ile iletisime geciniz.");
                }else {
                    System.out.println("Kalan Hakkiniz:" + right);
                }
            }
        }
    }
}
