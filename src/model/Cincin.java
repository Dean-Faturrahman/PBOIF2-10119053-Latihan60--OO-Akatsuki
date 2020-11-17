/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class Cincin extends Desa{
    private String posCincin;
    private String warnaCincin;

    public Cincin(String nama, String jutsu, String partner, String desa, String posCincin, String warnaCincin) {
        super(desa, nama, jutsu, partner);
        this.posCincin = posCincin;
        this.warnaCincin = warnaCincin;
    }
   
    public String getPosCincin() {
        return posCincin;
    }

    public String getWarnaCincin() {
        return warnaCincin;
    }

    @Override
    public void displayCharacter() {
        super.displayCharacter(); 
        System.out.println("Posisi Cincin\t: Jari " + posCincin);
        System.out.println("Warna Cincin\t: " + warnaCincin);
        System.out.println("===================================");
    }
        
    
}
