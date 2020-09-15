/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo;

/**
 *
 * @author HP
 */
public class Keramik {
    /* membuat atribut */
    int panjang;
    int lebar;
    int luas;
    int isikeramik;
    int harga;
    
    /* membuat methods */
    void totalKeramik() {
        int jumlahKeramik;
        jumlahKeramik = this.luas / (this.panjang * this.lebar);
        System.out.println("jumlah keramik: " + jumlahKeramik + "buah");
    }
    
    void boxTotal() {
        int jumlahBox;
        jumlahBox = (this.luas / (this.panjang*this.lebar)) / this.isikeramik;
        System.out.println("keseluruhan box yang dibutuhkan: " + jumlahBox);
    }
    
    void hitungHarga() {
        int hargaTotal;
        hargaTotal = ((this.luas / (this.panjang*this.lebar))/this.isikeramik) * this.harga;
        System.out.println("total harga yang harus dibayar: " + hargaTotal);
    }
}
