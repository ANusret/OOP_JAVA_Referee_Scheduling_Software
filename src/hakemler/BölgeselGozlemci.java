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
public class BölgeselGozlemci extends Gozlemci implements Maca_git{
    
    BölgeselGozlemci(){
        
    }
    
    BölgeselGozlemci(String ad, String soyad){
        super.ad = ad;
        super.soyad = soyad;
        super.klasman = "Bolgesel";
    }

    @Override
    public void macaGit(String İl, String Stadyum) {
        System.out.println(klasman + " gözlemcisi " + ad + " " + soyad + ", " + İl + " ilinde " + Stadyum + "'unda görevlidir.");
    }
}
