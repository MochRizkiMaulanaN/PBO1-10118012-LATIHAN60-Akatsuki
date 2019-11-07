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
public class Main60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        itachi itc =new itachi("Uchiha Itachi","Konohagakure","Sharingan");
        itc.display();
        System.out.println("");
        orochimaru oro =new orochimaru("Orochimaru","Konohagakure","Edotensei");
        oro.display();
        System.out.println("");
        sasori saso =new sasori("Sasori","Sunagakure","Pengendali Boneka");
        saso.display();
    }
    
}
