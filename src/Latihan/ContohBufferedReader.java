package Latihan;


/** This code is licensed for Maulana Hilmi Arkan
 * All right reserved
/**
 *
 * @author HP ZBOOK 15
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ContohBufferedReader {
    public static void main(String[] args) throws IOException {
        String nama;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek BufferedReaderM
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BufferredReader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
        
    }
}
