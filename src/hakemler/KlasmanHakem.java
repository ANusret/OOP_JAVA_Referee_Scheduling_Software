/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hakemler;

/**
 *
 * @author NUSRET
 */
public class KlasmanHakem extends Hakem implements Maca_git{
    //protected Klasmanolmayili;
    KlasmanHakem(){
        
    }
    KlasmanHakem(String ad, String soyad){
        super.ad = ad;
        super.soyad = soyad;
        super.klasman = "Klasman";
    }

    @Override
    public void macaGit(String İl, String Stadyum) {
        System.out.println(klasman + " hakemi " + ad + " " + soyad + ", " + İl + " ilinde " + Stadyum + "'unda görevlidir.");
    }
    
    
    
    
}
