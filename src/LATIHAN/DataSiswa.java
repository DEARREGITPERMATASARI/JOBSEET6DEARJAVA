/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN;

/**
 *
 * @author Nita
 * 
 */import java.util.Scanner;
public class DataSiswa {
    public static void main(String[] args) {
        
        //deklarasi variabel
        String nama, alamat ;
        int usia, absen;
        
        //membuat Scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //tampilkan output ke user
        System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
        System.out.print(" NAMA SISWA: ");
        
        //menggunakan scanner dan menyimpan apa yang diketik di variabel
        nama = keyboard.next();
        
        //tampilkan output lagi
        System.out.print(" Alamat: ");
        
        //tampilkan output lagi
        alamat = keyboard.next();
        System.out.print (" Absen: ");
        
        //tampilkan output lagi
         usia = keyboard.nextInt();
        System.out.print ("Usia: ");
        
        //tampilkan output lagi
        absen = keyboard.nextInt();
        
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("-------------");
        System.out.println ("Nama Siswa: " +nama);
        System.out.println("Alamat: " +alamat);
        System.out.println("Absen: " +usia);
        System.out.println("Usia: " +absen + "Tahun");
        
     
        
        
        
        
        
        
        
        
    }
    
    
}
