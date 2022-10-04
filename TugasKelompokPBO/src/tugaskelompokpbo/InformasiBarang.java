/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompokpbo;

/**
 *
 * @author LENOVO
 */
public class InformasiBarang {
    
    private String nama;
    private int harga;
    private double hargaBarang = (double) harga;
    private int stok;

    public InformasiBarang(String nama, int harga, int stok){
        this.nama = nama;
        this.hargaBarang = harga;
        this.stok = stok;
    }
    
    public InformasiBarang(String nama){
        this.nama = nama;
    }
    
    public void cetakInfo(){
        System.out.println("Nama barang : " + this.nama + "\nHarga barang : " + this.hargaBarang );
    }
    
    // Method Setter
    public void setNama( String nama )
    {
      this.nama = nama;
    }

    public void setHarga( int harga )
    {
      this.hargaBarang = harga;
    }

    public void setStok( int stok )
    {
      this.stok = stok;
    }

    // Method Getter
    public String getNama()
    {
      return this.nama;
    }

    public double getHarga()
    {
      return this.hargaBarang;
    }

    public int getStok()
    {
      return this.stok;
    }
    
}

