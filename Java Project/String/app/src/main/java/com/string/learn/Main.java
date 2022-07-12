package com.string.learn;
import com.string.learn.Sout;
import java.util.StringTokenizer;
public class Main 
{
  public static void main(String[] args) 
  {
    
    String h = "hello";
    String v = "world";
    
    
    
   /* sout(h+"\n"+h.trim());
    sout();
    sout(v.replace("i", "e"));
    sout(h.substring(0,2));
    sout(h.compareTo(v));
    
    
    String s = "news/titre-news-7/id";
    StringTokenizer str = new StringTokenizer(s, "/", true);
    
    while (str.hasMoreTokens())
     sout(str.nextToken());
    */
    /*
    //StringBuilder (asynchro): mono-threading
    StringBuilder sBd = new StringBuilder();
    //sout(sBd.capacity());
    sBd.append("Hello");
    sBd.append(" Cell");
    sBd.insert(6, "Come ");
    sout(sBd);
    
    sout();
    
    //StringBuffer (synchro): multi-threading 
    //threads-safe
    StringBuffer sBf = new StringBuffer();
    //sout(sBf.capacity());
    sBf.append("Worl");
    sBf.append(" Hell");
    sBf.insert(5, "Desc ");
    sout(sBf);
    */
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void sout(String s){
    System.out.print(s);
  }
  public static void sout(String[] s){
   for (String i : s)
    System.out.print(s);
  }
  public static void sout(StringBuilder s){
    System.out.print(s);
  }
  public static void sout(StringBuilder[] s){
   for (StringBuilder i : s)
    System.out.print(s);
  }
  public static void sout(StringBuffer s){
    System.out.print(s);
  }
  public static void sout(StringBuffer[] s){
   for (StringBuffer i : s)
    System.out.print(s);
  }
  public static void sout(int s){
    System.out.print(s);
  }
  public static void sout(int[] s){
   for(int i : s)
    System.out.print(s);
  }
  public static void sout(double s){
    System.out.print(s);
  }
  public static void sout(double[] s){
   for (double i : s)
    System.out.print(s);
  }
  public static void sout(float s){
    System.out.print(s);
  }
  public static void sout(float[] s){
   for (float i : s)
    System.out.print(s);
  }
  public static void sout(char s){
    System.out.print(s);
  }
  public static void sout(char[] s){
   for (char i : s)
    System.out.print(s);
  }
  public static void sout(long s){
    System.out.print(s);
  }
  public static void sout(long[] s){
   for (long i : s)
    System.out.print(s);
  }
  public static void sout(boolean s){
    System.out.print(s);
  }
  public static void sout(boolean[] s){
   for (boolean i : s)
    System.out.print(s);
  }
  public static void sout(){
    System.out.println();
  }
  
}
