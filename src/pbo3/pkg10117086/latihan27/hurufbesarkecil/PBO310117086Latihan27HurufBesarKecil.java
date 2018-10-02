/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 * NAMA                 : RD Muhammad Djulfikar BU
 * KELAS                : IF3
 * NIM                  : 10117086
 * DESKRIPSI PROGRAM    : program tentang huruf besar dan kecil
 */
public class PBO310117086Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        deklarasi variabel
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine -> untuk input lebih dari 1 kata
        
        hBesar = kalimat.toUpperCase(); //ke format Kapital
        hKecil = kalimat.toLowerCase(); //ke format kecil
        
//        menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);
        
    
    }
    
}
