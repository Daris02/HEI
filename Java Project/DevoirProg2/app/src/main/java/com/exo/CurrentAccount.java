package com.exo;

import com.exo.Customer;


public class CurrentAccount extends Account {
  public CurrentAccount(int idAccount,Customer owner){
    super (idAccount, owner);
  }
  
  public String toString(){
    return "CurrentAccount : \n idAccount = "+idAccount+" ,\nOwner is "+owner.getName()+"\n";
  }
}
