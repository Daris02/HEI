package com.exo;

import com.exo.Author;

public class Book 
{
  //Attributs with Getter & Setter
  private String titre;
  public String getTitre(){ return this.titre ; }
  public void setTitre(String Titre){ this.titre = Titre ; }
  
  private double prix;
  public double getPrix(){ return this.prix ; }
  public void setPrix(double Prix){ this.prix = Prix ; }
  
  private int quantity;
  public int getQuantity(){ return this.quantity ; }
  public void setQuantity(int Quantity){ this.quantity = Quantity ; }
  
  Author author;
  
  //Constructor : 
  public Book(String titre, double prix, int quantity, Author author){
    this.titre = titre;
    this.prix = prix;
    this.quantity = quantity;
    this.author = author;
  }
  
  //Method : 
  public String toString(){
    return "Book : "+titre+" a un prix de "+prix+" et à pour author "+author+". ";
  }
}

