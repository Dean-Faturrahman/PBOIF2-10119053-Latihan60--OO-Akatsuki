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
public class Akatsuki {
    protected String nama;
    protected String jutsu;
    protected String partner;

    public Akatsuki(String nama, String jutsu, String partner) {
        this.nama = nama;
        this.jutsu = jutsu;
        this.partner = partner;
    }
        
    public void displayCharacter(){
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Jutsu \t\t: " + jutsu);
        System.out.println("Partner \t: " + partner);
    }
}
