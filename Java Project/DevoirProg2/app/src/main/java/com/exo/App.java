package com.exo;

import com.exo.Employee;
import com.exo.OrderItem;

public class App {

  public static void main(String[] args) 
  {
   Employee emp1 = new Employee();
   Employee emp2 = new Employee(1, "Erik", "Hill", 2000);
   
   
   System.out.println(emp1.toString());
   System.out.println();
   System.out.println(emp2.toString()+"\n");
   
   // Ne fonctionne pas correctement :
   emp2.setSalary(emp2.raise(25));
   
   System.out.println(emp2.toString()+"\n\n");
   
   OrderItem line1 = new OrderItem(1, "Egg", 3, 500);
   OrderItem line2 = new OrderItem(2, "Apple", 5, 100);
   OrderItem line3 = new OrderItem(3, "Milk", 1, 1000);
   
   System.out.println(line1.toString());
   System.out.println(line2.toString());
   System.out.println(line3.toString());
   
   Customer cust1 = new Customer("Koto", "Rado", 0345555505, "rakoto@gmail.com", new Date() , "rado@e-mail.com");
        Account compt1 = new Account(1, cust1);

        Customer cust2 = new Customer("Toky", "Ando", 0345553305, "toky@gmail.com", new Date() , "ando@e-mail.com");
        Account compt2 = new Account(2, cust2);

        compt1.credit(500);
        System.out.println(compt1.toString());
        System.out.println(compt2.toString());
        System.out.println("After transfert : ");
        compt1.transferToAcount(compt2, 250);
        System.out.println(compt1.toString());
        System.out.println(compt2.toString());
    
  }
}
