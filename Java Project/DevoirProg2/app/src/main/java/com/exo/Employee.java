package com.exo;

public class Employee 
{
  //Attribute with Getter and Setter
  private static int id = 0;
  public int getId(){ return this.id; }
  public void setId(int Id){ this.id = Id; }
  
  private String lastName;
  public String getLastName(){return this.lastName; }
  public void setLastName(String LastName){ this.lastName = LastName; }
  
  private String firstName;
  public String getFirstName(){return this.firstName; }
  public void setFirstName(String FirstName){ this.firstName = FirstName; }
  
  private double salary;
  public double getSalary(){ return this.salary; }
  public void setSalary(double Salary){ this.salary = Salary; }
  
  //Constructor
  public Employee(String lastName, String firstName, double salary){
    id++;
    this.lastName = lastName;
    this.firstName = firstName;
    this.salary = salary;
  }
  
  public Employee(){
    id++;
    this.lastName = "inconnu";
    this.firstName = "inconnu";
    this.salary = 0;
  }
  
  //Method ** raise not fonctionnel **
  public double raise(int percent)
  {
    double divider = percent * 100;
    return (divider * 2) + salary;
  }
  
   public String toString()
   {
     return "Employee : \n" + "id : " + id + ",\nlastName : " + lastName + ", \nfirstName : " + firstName + ",\nsalary : " + salary +" Ar" ;
   }
  
}
