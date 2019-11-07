/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main60;

/**
 *
 * @author LENOVO
 */
public class Akatsuki {
    protected String nama;
    protected String asalNegara;
    protected String jurus;
    
    public Akatsuki(String nama,String asal,String jurus){
        this.nama=nama;
        asalNegara=asal;
        this.jurus=jurus;
    }
    
    public void display(){
        System.out.println("Nama Anggota        : "+nama);
        System.out.println("Berasal Dari Negara : "+asalNegara);
        System.out.println("Pengguna Jurus      : "+jurus);
    }
    
}
