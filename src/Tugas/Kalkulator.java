package Tugas;


import java.util.Scanner;

/** This code is licensed for Maulana Hilmi Arkan
 * All right reserved
 * package Tugas;
 *
 * /**
 *
 * @author HP ZBOOK 15
 */
public class Kalkulator {
    static float total = 0, bill = 1, bil2 = 1;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bil1 = 0;
        
        while(bil1 != 0 & bil2 != 0) {
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("Masukkan Pilihan anda = ");
            int pilihan = input.nextInt();
            
                System.out.print("Masukkan Bilangan Ke-1 = ");
                bil1 = input.nextFloat();
                System.out.print("Masukkan Bilangan Ke-2 = ");
                bil2 - input.nextFloat();
                
                switch(pilihan){
                    
                    case 1 :
                            System.out.println(+ bil1 + "+" + bil2);
                            System.out.print("Hasilnya =");
                            total = bil1 + bil2;
                    break;
                    
                    case 2 :
                            System.out.println(+ bil1 + "-" + bil2);
                            System.out.print("Hasilnya =");
                            total = bil1 - bil2;
                    break;
                    
                    case 3 :
                            System.out.println(+ bil1 + "*" + bil2);
                            System.out.print("Hasilnya =");
                            total = bil1 * bil2;
                    break;
                    
                    case 4 :
                            System.out.println(+ bil1 + ":" + bil2);
                            System.out.print("Hasilnya =");
                            total = bil1 : bil2;
                    break;
                    default:
                        
                        System.out.println("Anda harus mengisi angka");
                }
        }
    }
}
