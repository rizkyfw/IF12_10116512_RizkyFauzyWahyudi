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
public class IF12_10116512_RizkyFauzyWahyudi_LatihanUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    JajarGenjang oJG = new JajarGenjang();
    oJG.jajarGenjang(50, 60, 70, 80, 100, 120);
    Segitiga oS = new Segitiga();
    oS.segitiga(50, 60, 70, 100, 120);
    oJG.hitungKeliling();
    oJG.hitungLuas();
    oS.hitungKeliling();
    oS.hitungLuas();
    
    System.out.println("\nNama    : RizkyFauzyWahyudi");
    System.out.println("Nim     : 10116512");
    }
}
