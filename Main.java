import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int a, byk = 0, kck = 0, b = 0, c = 0;
        out.println("Büyük küçük sayı bulma programına hoş geldiniz.");
        out.print("Kaç tane sayı gireceksini : ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            out.print(i + ".sayıyı giriniz : ");
            b = input.nextInt();
            if (b > 0) {
                if (b > byk) {
                    byk = b;
                }
            }
            if (b<0){
                if (b < kck) {
                    kck = b;
                }
            }
        }
        out.println("Girilen en büyük sayı : "+byk+"\nGirilen en küçük sayı : "+kck);

    }

}

