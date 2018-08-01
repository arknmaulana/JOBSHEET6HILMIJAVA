package Latihan;

import java.io.*;
/** This code is licensed for Maulana Hilmi Arkan
 * All right reserved
 * package Produktif;
 *
 * /**
 *
 * @author HP ZBOOK 15
 */
public class Contoh_Persegi {
    
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
            String x = " ";
            int hitungLuas=0;
            System.out.println("---Luas Persegi---");
            System.out.print("Masukkan nilai sisi: ");
        
        try {
            x = data.readLine();
            int angka = Integer.parseInt(x);
            hitungLuas = angka * angka;
        } catch (Exception e) {
            System.out.println("Error");
        }
            System.out.println("Luas persegi dengan sisi " + x + " adalah " + hitungLuas);
    }
}
