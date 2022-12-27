import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, toplam = 0, sayac = 0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                System.out.println( i );
                toplam+=i;
                sayac++;

            }
        }
        System.out.println("Sayıların Toplamı: "+toplam);
        ort = toplam / sayac;

        System.out.print("Ortalama: " + ort);


    }


}



