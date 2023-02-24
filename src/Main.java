import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        int sayi=input.nextInt();
        int toplam=0;
        int sayac=0;

        for (int i=1;i<=sayi;i++){
            if (i%12==0){
                sayac+=1;
                toplam+=i;

            }
        }
        double ort=toplam/sayac;
        System.out.println("Ortalama:"+ort);
    }
}