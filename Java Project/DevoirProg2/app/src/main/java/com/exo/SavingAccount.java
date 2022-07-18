package com.exo;

public class SavingAccount extends Account {
  private double interest ;
  public SavingAccount (int idAccount, Customer owner, double interest){
    super (idAccount, owner);
    this.interest = interest;
  }
  
  public void addInterest(){
    
  }
  
  public String toString(){
    return "SavingAccount : \n idAccount = "+idAccount+" ,\nOwner is "+owner.getName()+" ,\ninterest = "+interest+" \n";
  }
}
