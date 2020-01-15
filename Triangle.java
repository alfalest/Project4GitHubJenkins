package Triangle;

import static Triangle.LuasKeliling.a;
import java.util.Scanner;
public class Triangle {
    static int aL, tL, aK, tK, sK, L, K, luas, keliling;

    public static void main (String[] args){
        //LUAS SEGITIGA
        System.out.println("===LUAS SEGITIGA===");
        Scanner Luas= new Scanner(System.in);
      
         System.out.print("Masukkan nilai a = ");
         aL=Luas.nextInt();
         System.out.print("Masukan nilai t = ");
         tL= Luas.nextInt();
        
         L=aL*tL/2;
         System.out.println("Luasnya ="+L);
        
         if(L>75)
            System.out.println("Segitiga yg Kamu hitung adalah segitiga yg besar!!!");
            else
            System.out.println("Segitiga yg Kamu hitung adalah Segitiga yg kecil!!!");
         
         
         //KELILING SEGITIGA
         System.out.println("===KELILING SEGITIGA===");
         Scanner Keliling = new Scanner(System.in);
      
         System.out.print("Masukkan nilai s = ");
         sK = Keliling.nextInt();
         System.out.print("Masukan nilai t = ");
         tK = Keliling.nextInt();
         System.out.print("Masukan nilai a = ");
         aK = Keliling.nextInt();
        
         K = sK+tK+aK;
         System.out.println("Kelilingnya ="+K);
         
   
        if(K>75)
            System.out.println("Segitiga yg Kamu hitung adalah segitiga yg besar!!!");
            else
            System.out.println("Segitiga yg Kamu hitung adalah Segitiga yg kecil!!!");
        }
      
    }