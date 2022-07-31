package com.exo;

public class Account {
    protected int idAccount;
    protected Customer owner;
    protected double balance;

    public Account(int idAccount, Customer owner){
        this.idAccount = idAccount;
        this.owner = owner;
        this.balance = 0;
    }

    //Getter & Setter
    public int getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Method
    public double credit(double amount){
        double new_balance = balance + amount;
        return this.balance = new_balance ;
    }

    public double debit(double amount){
        double new_balance = balance - amount;
        return this.balance = new_balance ;
    }

    public void transferToAcount(Account target, double amount){
        if(amount > 0 ){
            target.credit(amount);
            double new_balance = balance - amount;
            this.balance = new_balance;
            System.out.println("Transfert effectuer");
        }else {
            System.out.println("Erreur de transfert");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Account : IdAccount is "+idAccount+",\nOwner is "+owner.getName()+
                ",\nBalance = "+balance+". \n";
    }
}
