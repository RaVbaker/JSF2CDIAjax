package com.example.domain;
                 
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class Osoba {
  private String imie;  
  private int pesel;      
  private int rokUr;    
  
                          
  @Length(min=2)
  public String getImie() { return imie; }  
  
  public void setImie(String newVal) { imie = newVal;}

  
                
  @Range(min=1900, max=2010)
  public int getRokUr() { return rokUr; }  
  
  public void setRokUr(int newVal) { rokUr = newVal;}

  
  
  public int getPesel() { return pesel; }  
  
  public void setPesel(int newVal) { pesel = newVal;} 
  
}
