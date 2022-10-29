import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");
        sayi = input.nextInt();

        if(sayi%4==0 || (sayi%100)==0){
            if (sayi%100==0){
                if(sayi%400==0){
                    System.out.println("Artık yıldır: "+sayi);
                    return;

                }
                else{
                    System.out.println("Artık yıl değildir: "+sayi);
                    return;
                }
            }
            System.out.println("Artık yıldır: "+sayi);
        }



    }
}
