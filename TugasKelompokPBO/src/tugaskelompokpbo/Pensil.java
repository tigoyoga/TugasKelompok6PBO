/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaskelompokpbo;

/**
 *
 * @author LENOVO
 */
public class Pensil extends InformasiBarang {
    private String tipePensil;
    
    
    public Pensil(String nama, int harga, int stok, String tipePensil){
        super(nama, harga, stok);
        this.tipePensil = tipePensil;
    }
    
    public Pensil(String nama){
        super(nama);
    }
    
    public void setTipePensil(String tipePensil){
        this.tipePensil = tipePensil;
    }
    
    public String getTipePensil(){
        return this.tipePensil;
    }
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Tipe pensil : " + this.tipePensil + "\n" );
    }
}
