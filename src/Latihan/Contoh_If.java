package Latihan;

import java.util.Scanner;
/** This code is licensed for Maulana Hilmi Arkan
 * All right reserved
 * package Produktif;
 *
 * /**
 *
 * @author HP ZBOOK 15
 */
public class Contoh_If {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print("Masukan nilai akhir PBO :");
        nilai = masukan.nextInt();
        if (nilai < 70)
            System.out.println("Siswa tidak lulus");
        if (nilai > 70)
            System.out.println("Siswa lulus");
    }
}
