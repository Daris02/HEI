package com.exo;

public class OrderItem 
{
  //Attributs with Getter & Setter
  private int id;
  public int getId(){ return this.id ; }
  public void setId(int Id){ this.id = Id ; }
  
  private String description ;
  public String getDescription(){ return this.description ; }
  public void setDescription(String Description){ this.description = Description ; }
  
  private int quantity;
  public int getQuantity(){ return this.quantity ; }
  public void setQuantity(int Quantity){ this.quantity = Quantity ; }
  
  private double unitPrice;
  public double getUnitPrice(){ return this.unitPrice ; }
  public void setUnitPrice(double UnitPrice){ this.unitPrice = UnitPrice ; }
  
  //Constructor 
  public OrderItem(int id, String description, int quantity, double unitPrice){
    this.id = id;
    this.description = description;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }
  
  //Method
  public double getTotal(){
    return  quantity * unitPrice;
  }
  
  public double totalLine(){
    return quantity * unitPrice;
  }
  
  @Override
  public String toString(){
    return "OrderItem : {\n" + 
            "id : " + id + 
            " ,\ndescription : " + description + " ,\nquantity : " + quantity + " ,\nunitPrice : " + unitPrice +"\n }; \n";
  }
}
