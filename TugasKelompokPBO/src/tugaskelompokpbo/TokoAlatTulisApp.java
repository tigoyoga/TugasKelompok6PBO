/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaskelompokpbo;

/**
 *
 * @author LENOVO
 */
public class TokoAlatTulisApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Pensil pensil1 = new Pensil("Faber Castell", 3000, 5, "2B");
        Pensil pensil2 = new Pensil("Joyko", 1500, 5, "3B");
        
        pensil1.cetakInfo();
        pensil2.cetakInfo();
        
        Bolpoin bolpoin1 = new Bolpoin("Kokoro", 6000, 7, "Hitam");
        Bolpoin bolpoin2 = new Bolpoin("Sarasa", 3000, 7, "Merah");
        
        bolpoin1.cetakInfo();
        bolpoin2.cetakInfo();
        
        Transaksi trs1 = new Transaksi(pensil1);
        Transaksi trs2 = new Transaksi(bolpoin1);
        
        
    }
    
}

