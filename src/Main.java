/*
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, n3, temp;
        Scanner yazici = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi girin: ");
        n1 = yazici.nextInt();
        System.out.println("Lutfen ikinci sayiyi girin: ");
        n2 = yazici.nextInt();
        System.out.println("Lutfen ucuncu sayiyi girin: ");
        n3 = yazici.nextInt();
        if (!(n1 == n2 || n1 == n3 || n2 == n3)) {
            if (n1 > n3) {
                temp = n1;
                n1 = n3;
                n3 = temp;
            }
            if (n1 > n2) {
                temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n2 > n3) {
                temp = n2;
                n2 = n3;
                n3 = temp;
            }

            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            System.out.println("n3: " + n3);


        }
        else System.out.println("Ayni olan sayilar iceriyor.");
    }
}
