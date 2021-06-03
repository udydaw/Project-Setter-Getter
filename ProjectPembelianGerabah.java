/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpembeliangerabah;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ProjectPembelianGerabah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerabah toko = new Gerabah();
        toko.setAtasNama("Sherena Audy");
        toko.setJenisGerabah("Vas Bunga");
        toko.setJumlahGerabah(2);
        toko.setHargaGerabah (45000);
        toko.setTotalHarga(90000);
        
        System.out.println("       KEDIRI/E78  (021)9876545       ");
        System.out.println("======================================");
        System.out.println("         NGGRIYA GERABAH RAYA         ");
        System.out.println("======================================");
        System.out.println("");
        System.out.println("Nama Pembeli    : "+toko.getAtasNama());
        System.out.println("Jenis Gerabah   : "+toko.getJenisGerabah());
        System.out.println("Jumlah          : "+toko.getJumlahGerabah()+" buah");
        System.out.println("Harga           : Rp. "+toko.getHargaGerabah());
        System.out.println("Total Harga     : Rp. "+toko.getTotalHarga());
    } 
}
