package com.firstgame.app;

public class softwareRegistration 
{
  /* [ACCESSEUR]
    Getter : accéder à un attribut (lecture)
    Setter : modifiée un attribut 
  */
  private int expireYear;
  public int getExpireYear(){
    return this.expireYear;
  }
  public void setExpireYear(int expired){
    this.expireYear = expired ;
    //return ; <- pour qu'il ne return rien 
  }
 
  public softwareRegistration(int expired)
  {
    if(numOfRegistre > 0)
    {
      this.expireYear = expired;
      numOfRegistre-- ;
    System.out.println("It's valid for "+this.expireYear);
    System.out.println("Registre remaining "+ numOfRegistre);
    }
    else {
      System.out.println("Validation maximum reached ");
    }
  }
  
  //Variables de classe
  private static int numOfRegistre = 2;
  public static int getNumOfRegistre(){
    return numOfRegistre ;
  }
}
