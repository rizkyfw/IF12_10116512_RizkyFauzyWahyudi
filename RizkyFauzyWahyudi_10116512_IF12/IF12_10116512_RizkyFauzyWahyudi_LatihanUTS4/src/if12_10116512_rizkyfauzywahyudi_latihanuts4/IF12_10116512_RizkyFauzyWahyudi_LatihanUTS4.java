
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116512_rizkyfauzywahyudi_latihanuts4;

/**
 *
 * @author gigabyte
 */
public class IF12_10116512_RizkyFauzyWahyudi_LatihanUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ModelEmployee oMdlE = new ModelEmployee();
        ModelDesigner oMdlD = new ModelDesigner();
        ModelProgrammer oMdlP = new ModelProgrammer();
        ModelSystemAnalyst oMdlS = new ModelSystemAnalyst();
        oMdlD.bonusDesigner(50000);
        oMdlP.bonusProgrammer(60000);
        oMdlS.bonusSystemAnalyst(90000);
        
        System.out.println("\nNama    : Rizky Fauzy Wahyudi");
        System.out.println("Nim     : 10116512");
    }
    
}
