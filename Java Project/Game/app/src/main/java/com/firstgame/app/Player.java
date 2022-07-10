package com.firstgame.app;

public class Player 
{
  String name;
  int level;
  
  public Player()
  {
    this.name = "inconny";
    this.level = 1;
    System.out.println("Name : "+this.name+"\n level = "+this.level+"\n");
  }
  public Player(String name, int level)
  {
    this.name = name;
    this.level = level;
    System.out.println("Name : "+this.name+"\n level = "+this.level+"\n");
  }
  
  public void attack()
  {
    System.out.println(this.name+" attaque une cible");
  }
}
