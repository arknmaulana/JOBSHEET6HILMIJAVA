package Latihan;



import java.util.Scanner;
public class ContohScanner {
    public static void main(String[] args) {
        
String nama, alamat;
int usia, absen;

        Scanner keyboard = new Scanner(System.in);
  
        System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
        System.out.print("Nama Siswa: ");
        nama = keyboard.next();
        System.out.print("Alamat: ");
        alamat = keyboard.next();
        System.out.print("Absen: ");
        absen = keyboard.nextInt();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        
        System.out.println("^^^^^^^^^^^^^^^");
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Absen: " + absen);
        System.out.println("Usia: " + usia + " tahun");
        
    }
}