/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Tugas2 {
    public static void main(String[] args) {
     System.out.println("Nama: Sabina Okta Restati / XRPL 5 / 39");
        int n=5;
        int harga[]=new int[n];
        for(int i=0;i<n;i++){
            harga[i]=Integer.parseInt(JOptionPane.showInputDialog("Masukan harga barang ke-"+(i+1)));
        }
        JOptionPane.showMessageDialog(null,"Masukan Berat!");
        int berat[]=new int[n];
        for(int i=0;i<n;i++){
            berat[i]=Integer.parseInt(JOptionPane.showInputDialog("Masukan berat(kg) barang barang ke-"+(i+1)));
        }
        System.out.println("Barang A : Harga= Rp."+harga[0]+" Berat="+berat[0]+("Kg"));
        System.out.println("Barang B : Harga= Rp."+harga[1]+" Berat="+berat[1]+("Kg"));
        System.out.println("Barang C : Harga= Rp."+harga[2]+" Berat="+berat[2]+("Kg"));
        System.out.println("Barang D : Harga= Rp."+harga[3]+" Berat="+berat[3]+("Kg"));
        System.out.println("Barang E : Harga= Rp."+harga[4]+" Berat="+berat[4]+("Kg"));
        
        int mc;
        mc=Integer.parseInt(JOptionPane.showInputDialog("Masukan kapasitas Maksimal"));
        
        System.out.println("Bayaran yang maksimal: "+angkutan(mc, berat, harga, n));

    }
    public static int max(int a, int b){ 
        return (a > b)? a : b; 
    }
    static int angkutan(int W, int wt[], int val[], int n)
    {
        int i, w;
        int [][]K = new int[n+1][W+1];
 
	   // Menggunakan jeniis bottom up
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w)
                    K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                else
                    K[i][w] = K[i-1][w];
            }
        }
        return K[n][W];
    }
}

