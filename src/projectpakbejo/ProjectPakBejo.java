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
public class ProjectPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi -> proses membuat obyek */
        Keramik kA = new Keramik();
        kA.panjang = 30;
        kA.lebar = 30;
        kA.luas = 1000000;
        kA.isikeramik = 10;
        kA.harga = 54000
        kA.totalKeramik();
        kA.boxTotal();
        kA.hitungHarga();
        
        Keramik kB = new Keramik();
        kB.panjang = 40;
        kB.lebar = 40;
        kB.luas = 1000000;
        kB.isikeramik = 5;
        kB.harga = 65000;
        kB.totalKeramik();
        kB.boxTotal();
        kB.hitungHarga();
        
        Keramik kC = new Keramik();
        kC.panjang = 30;
        kC.lebar = 40;
        kC.luas = 1000000;
        kC.isikeramik = 8;
        kC.harga = 60000;
        kC.totalKeramik();
        kC.boxTotal();
        kC.hitungHarga();
                
                
                
    }
    
}
