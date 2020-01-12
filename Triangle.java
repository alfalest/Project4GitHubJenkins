package Triangle;

import java.util.Scanner;
public class Triangle {
    public static void main (String[] args){
        double a,t,L;
        System.out.println("===Luas Segitiga===");
        Scanner Masukkan= new Scanner(System.in);
      
         System.out.print("Masukkan nilai a = ");
         a=Masukkan.nextDouble();
         System.out.print("Masukan nilai t = ");
         t= Masukkan.nextDouble();
        
         L=a*t/2;
         System.out.println("Luasnya ="+L);
        
         if(L>75)
            System.out.println("Segitiga yg Kamu hitung adalah segitiga yg besar!!!");
            else
            System.out.println("Segitiga yg Kamu hitung adalah Segitiga yg kecil!!!");
        }
      
    }
