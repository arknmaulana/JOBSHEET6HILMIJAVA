package Latihan;

import java.util.Scanner;
/** This code is licensed for Maulana Hilmi Arkan
 * All right reserved
 * /**
 *
 * @author HP ZBOOK 15
 */
public class Inputan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a:");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b:");
        b = masukan.nextInt();
        System.out.println();
        System.out.println("Nilai variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
