package LuasKeliling;

import java.util.Scanner;

/**
 *
 * @author ADDIN ADHILANI
 */
public class LuasKeliling {
 static int a;
 static int t;
 static int luas;
 static int keliling;
 
    public void info(){
    System.out.println("KELILING="+keliling);
    }
    
   public static void main (String[] args){
   Scanner masuk=new Scanner(System.in);
   LuasKeliling s=new LuasKeliling();
   System.out.println("MASUKKAN ALAS:");
   a=masuk.nextInt();
   System.out.println("MASUKKAN tinggi:");
   t=masuk.nextInt();
   keliling=3*a;
   s.info();
   }
    
}
