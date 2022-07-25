import java.util.Scanner;
public class mukemmelSayiBulunuz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1,n2,sonuc;
        System.out.print("N1 Sayısını Giriniz: ");
        n1 = input.nextInt();


        int ebob=1,msayi=0;

        for (int i = 1; i <=n1;i++)  {
            if (n1%i ==0) {
                //System.out.println(i);
                ebob = i ;
                msayi +=ebob;
            }
        }
        sonuc = msayi/2;
        if (sonuc==n1) {
            System.out.println("Mükemmel Sayı "+sonuc);
        }else {
            System.out.println("Mükemmel Sayı Değildir. "+sonuc);
        }

    }
}

