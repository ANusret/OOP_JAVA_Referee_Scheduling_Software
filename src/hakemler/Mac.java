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
final class Mac {
    
    protected String evSahibi;
    protected String deplasman;
    protected String skor;
    protected Hakem hakem;
    protected Gozlemci gozlemci;
    protected double hakemPuani;
    
    Mac(){
        
    }
    
    Mac(String evSahibi, String deplasman, String skor, Hakem hakem, Gozlemci gozlemci, double hakemPuani){
        this.evSahibi = evSahibi;
        this.deplasman = deplasman;
        this.skor = skor;
        this.hakem = hakem;
        this.gozlemci = gozlemci;
        this.hakemPuani = hakemPuani;
    }
    
    @Override
    public String toString(){
        String a = (hakem.ad + " " + hakem.soyad + " isimli " + hakem.klasman + " hakeminin yönettiği " + evSahibi + ", " + deplasman + " takımları arasında oynanan maç " + " " + skor + " sona erdi." );
        String b = (" Maç gözlemcisi " + gozlemci.ad + " " + gozlemci.soyad);
        return a + b;
    }
}
