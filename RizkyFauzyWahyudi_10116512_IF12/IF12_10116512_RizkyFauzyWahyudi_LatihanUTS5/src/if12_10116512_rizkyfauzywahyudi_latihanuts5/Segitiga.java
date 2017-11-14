/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116512_rizkyfauzywahyudi_latihanuts5;

/**
 *
 * @author gigabyte
 */
public class Segitiga extends BangunDatar{
    
    private int luas,keliling;
    private int sisiAb,sisiBc,sisiCa;
    private int alas,tinggi;
    
    public void segitiga(int sisiAb,int sisiBc,int sisiCa,int alas,int tinggi){
    this.sisiAb=sisiAb;
    this.sisiBc=sisiBc;
    this.sisiCa=sisiCa; 
    this.alas=alas;
    this.tinggi=tinggi;
    }
    public void hitungKeliling(){
    keliling=sisiAb+sisiBc+sisiCa;
    System.out.println("Keliing Segitiga        = "+keliling);
    }
    
    public void hitungLuas(){
    luas=alas*tinggi/2;
    System.out.println("luas Segitiga           = "+luas);
    }

        
}
