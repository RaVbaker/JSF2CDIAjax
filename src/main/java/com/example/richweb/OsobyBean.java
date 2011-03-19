package com.example.richweb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;        
import java.util.Random;

import com.example.domain.Osoba;
      
@SessionScoped
@Named
public class OsobyBean implements Serializable {
  
  
      private static final long serialVersionUID = 1L;
  
       private List<Osoba> osoby = new ArrayList<Osoba>();
       private Osoba wybranaOsoba;
       
       public Osoba getWybranaOsoba() {
         return wybranaOsoba;
       }                     
       
       public void setWybranaOsoba(Osoba nowa) {
         wybranaOsoba = nowa;
       }                     
         
       
       public OsobyBean() {
         Osoba o1 = new Osoba();
         o1.setImie("Bolek");
         o1.setRokUr(1920);     
         o1.setPesel(1235670000);
         osoby.add(o1);      
          
         Osoba o2 = new Osoba();
            o2.setImie("Lolek");
            o2.setRokUr(1925);     
            o2.setPesel(134568000);
         osoby.add(o2);
         
         Osoba o3 = new Osoba();
             o3.setImie("Tola");
             o3.setRokUr(1930);     
             o3.setPesel(1345681234);
          osoby.add(o3);
         
         
       }       
       
       public String getRandomFont() {
         String[] fonts = {"Tahoma", "Courier New", "Comic Sans MS", "Arial", "Webdings"};
         Random randomGen = new Random();
         return fonts[randomGen.nextInt(fonts.length)];
       }           
                
       public String usunWybranaOsobe() {
         osoby.remove(this.wybranaOsoba);
         this.wybranaOsoba=null;
         return null;
       }
       
       public List<Osoba> getOsoby() {
         return osoby;
       }
       
}