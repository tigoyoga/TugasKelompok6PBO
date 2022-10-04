/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompokpbo;

/**
 *
 * @author LENOVO
 */
public class Transaksi {
    
    public Transaksi(InformasiBarang barang)
    {

    System.out.println("Barang : " + barang.getNama() + ", Harga : " + barang.getHarga());

    int stokBaru = barang.getStok() - 1;

    barang.setStok(stokBaru);

  }
}
