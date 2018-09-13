/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        String jenis[] = new String[] {"E", "B", "A", "D", "C"};
        int berat [] = new int[]{7,5,4,3,2};
        int bayaran [] = new int[] {10000, 7000, 5000, 3000, 2000};
        int harga;
        int total = 0;
        int jumlah;
        System.out.print("Masukkan berat: ");
        int beratMasukan = scanner.nextInt();
        
        for (int i=0;i<jenis.length;i++){
            if(beratMasukan >= berat[i]){
                jumlah = beratMasukan / berat[i];
                beratMasukan = beratMasukan%berat[i];
                harga = jumlah * bayaran[i];
                total += harga;
                System.out.println("Jenis "+jenis[i]+" Sebanyak "+jumlah);
                System.out.println("Bayaran: Rp "+harga);
            }
        }
        System.out.println("Total Bayaran : Rp"+total);
    }
}
