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
public class Desa extends Akatsuki{
    private String desa;

    public Desa(String desa, String nama, String jutsu, String partner) {
        super(nama, jutsu, partner);
        this.desa = desa;
    }

    public String getDesa() {
        return desa;
    }

    @Override
    public void displayCharacter() {
        super.displayCharacter(); 
        System.out.println("Asal Desa \t: " + desa);
    }
    
    
}
