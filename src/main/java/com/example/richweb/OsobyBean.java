package com.example.richweb;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
      
@SessionScoped
@Named
public class OsobyBean implements Serializable {
  
  
      private static final long serialVersionUID = 1L;
  
       private List<Osoba> osoby = new ArrayList<Osoba>();
       
       public OsobyBean() {
         Osoba o1 = new Osoba();
         o1.setImie("Bolek");
         o1.setRokUr(1920);     
         o1.setPesel(1234567);
         osoby.add(o1);      
          
         Osoba o2 = new Osoba();
            o2.setImie("Lolek");
            o2.setRokUr(1925);     
            o2.setPesel(1234568);
         osoby.add(o2);
         
         Osoba o3 = new Osoba();
             o3.setImie("Tola");
             o3.setRokUr(1930);     
             o3.setPesel(9234568);
          osoby.add(o3);
         
         
       }                  
       
       
       public List<Osoba> getOsoby() {
         return osoby;
       }
       
}