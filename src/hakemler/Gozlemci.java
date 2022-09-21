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
public class Gozlemci extends MacDurumuGozlemci{
    protected String ad;
    protected String soyad;
    protected String klasman;
    protected boolean hakemDurum;
    Mac[] mac;
    
    Gozlemci(){
        
    }
    
    @Override
    void macNeolduGozlemci(int kacinciMac) {
        Mac macı = mac[kacinciMac];
        System.out.println(macı.evSahibi + " ve " + macı.deplasman + " arasında oynanan maçın skoru " + macı.skor + " ; yöneten hakemin puanı: " + macı.hakemPuani);
    }
    
    
}
