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
public class Hakemler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KlasmanHakem kh = new KlasmanHakem("Ahmet", "Nusret");
        KlasmanGozlemci kg = new KlasmanGozlemci("Ali", "Karaköse");
        Mac m1 = new Mac("Ekmekspor", "Suspor", "2-1", kh, kg, 10);
        kh.mac = new Mac[2];
        kh.mac[0] = m1;
        kg.mac = new Mac[2];
        kg.mac[0] = m1;
        kh.macaGit("İstanbul", "Ekmekspor Stadyumu");
        kg.macaGit("İstanbul", "Ekmekspor Stadyum");
        System.out.println(m1.toString());
        kg.macNeolduGozlemci(0);
        kh.macaNeolduHakem(0, 5, 1);
        System.out.println("-----------İlk Hafta Bitti------------");
        Mac m2 = new Mac("Suspor", "Ekmekspor", "2-3", kh, kg, 9);
        kh.mac[1] = m2;
        kg.mac[1] = m2;
        kh.macaGit("Yalova", "Suspor Stadyumu");
        kg.macaGit("Yalova", "Suspor Stadyumu");
        System.out.println(m2.toString());
        kg.macNeolduGozlemci(1);
        kh.macaNeolduHakem(1, 2, 0);
        
        kh.puanHesap();
        kh.puanSorgula();
        
        
        
    }
    
}
