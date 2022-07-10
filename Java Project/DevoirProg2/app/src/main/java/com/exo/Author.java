package com.exo;

public class Author 
{
  //Attributs with Getter & Setter :
  private String name;
  public String getName(){ return this.name ; }
  public void setName(String Name){ this.name = Name ; }
  
  private String email;
  public String getEmail(){ return this.email ;}
  public void setEmail(String Email){ this.email = Email ; }
  
  private char sexe;
  public char getSexe(){ return this.sexe ; }
  public void setSexe(char Sexe){ this.sexe = Sexe ; }
  
  //Constructor : 
  public Author(String name, String email, char sexe ){
    this.name = name;
    this.email = email;
    this.sexe = sexe;
  }
  
  //Method : 
  public String toString(){
    return "Author : "+name+"\nemail : "+email+", de sexe "+sexe+".";
  }
  
}
