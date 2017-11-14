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
public class JajarGenjang extends BangunDatar{
    private int luas,keliling;
    private int sisiAb,sisiBc,sisiCd,sisiDa,alas,tinggi;
   
    public void jajarGenjang(int ab,int bc,int cd,int da,int alas,int tinggi){
    this.sisiAb=ab;
    this.sisiBc=bc;
    this.sisiCd=cd;
    this.sisiDa=da;
    this.alas=alas;
    this.tinggi=tinggi;

    }
    public void hitungKeliling(){
    keliling=2*alas+sisiAb+sisiBc+sisiCd+sisiDa;
    System.out.println("Keliling Jajar Genjang  = "+keliling);
    }
   
    public void hitungLuas(){
    luas=alas*tinggi;
    System.out.println("Luas Jajar Genjang      = "+luas);
    }
}
