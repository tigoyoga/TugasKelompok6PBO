/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompokpbo;

/**
 *
 * @author LENOVO
 */
public class Bolpoin extends InformasiBarang{
    private String warna;
    
    public Bolpoin(String nama, int harga, int stok, String warna){
        super(nama, harga, stok);
        this.warna = warna;
    }
    
    public Bolpoin(String nama){
        super(nama);
    }
    
    public void setWarnaBolpoin(String warna){
        this.warna = warna;
    }
    
    public String getWarnaBolpoin(){
        return this.warna;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Warna bolpoin : " + this.warna + "\n" );
    }
}
