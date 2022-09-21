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
public class Hakem extends MacDurumu{
    protected String ad;
    protected String soyad;
    protected String klasman;
    Mac[] mac;
    private double toplamPuan = 0;
    protected double hakemPuan;
    
    Hakem(){
        
    }

    @Override
    void macaNeolduHakem(int kacinciMac, int sariKart, int kirmiziKart) {
        Mac macı = mac[kacinciMac];
        System.out.println(macı.evSahibi + " - " + macı.deplasman + " arasında oynanan maçta " + sariKart + " tane sarı kart, " + kirmiziKart + " kırmızı kart gösterilmiştir ve maç " + macı.skor + " skoru ile sonlanmıştır.");
    }
    
    double puanHesap(){
        for (int i = 0; i < mac.length; i++) {
            this.toplamPuan = this.toplamPuan + mac[i].hakemPuani;
        }
        this.hakemPuan = this.toplamPuan / mac.length;
        return hakemPuan;
    }
    
    void puanSorgula(){
        System.out.println(ad + " " + soyad + " isimli hakemin puanı: " + hakemPuan);
    }
}
