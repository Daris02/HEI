package com.exo;

public class Account {
    private int idAccount;
    private Customer owner;
    private double balance;

    public Account(int idAccount, Customer owner){
        this.idAccount = idAccount;
        this.owner = owner;
        this.balance = 0;
    }

    //Getter & Setter
    /**
     * @return int return the idAccount
     */
    public int getIdAccount() {
        return idAccount;
    }

    /**
     * @param idAccount the idAccount to set
     */
    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    /**
     * @return Customer return the owner
     */
    public Customer getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    /**
     * @return double return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
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
