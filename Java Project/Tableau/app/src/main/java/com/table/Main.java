package com.table;

import java.util.Arrays;


public class Main 
{
  public static void printTab(int[] t)
  {
    for(int elem : t)
     System.out.print(elem+" ");
  }

  public static void main(String[] args) 
  {
    int[] tab = {1,2,3};
    
    //printTab(tab);
    
    //int[][] Tab = new int[2][3];
    int[][] Tab = {
      {1,2,3},
      {4,5,6}
    };
     
   System.out.println("\n");     
    for(int[] i : Tab)
     //printTab(i);
    
    System.out.println("\n"); 
    int[] arr = new int[5];
    Arrays.fill(arr, 8);
    
    printTab(arr);
  }
  
  
}
