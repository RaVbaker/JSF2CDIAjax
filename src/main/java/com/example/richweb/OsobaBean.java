package com.example.richweb;

import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;        

import com.example.domain.Osoba;

@SessionScoped
@Named
class OsobaBean implements Serializable{
  
  
  private static final long serialVersionUID = 1L;
  
  private Osoba osoba = new Osoba();   
                             
  @Inject
  private OsobyBean osobyBean;
  
  public Osoba getOsoba() {
    return osoba;
  }              
  
  public void setOsoba(Osoba os) {
    this.osoba = os;
  }            
  
  public String dodajOsobe() {    
    Osoba o = new Osoba();
    o.setImie(osoba.getImie());
    o.setPesel(osoba.getPesel());
    o.setRokUr(osoba.getRokUr());
    
    osobyBean.getOsoby().add(o);
    return "osoby";       
    
    
  }
}