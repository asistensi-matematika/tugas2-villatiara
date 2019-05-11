/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author sunarto
 */
public class AproksimasiNo5_Villatiara {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan a = ");
        double a = input.nextDouble();
        System.out.print("Masukkan n = ");
        double n = input.nextDouble();
        System.out.print("Masukkan x = ");
        double x = input.nextDouble();
        double[] f = new double[10001];
        double es = 0.5*Math.pow(10, 2-n);
        f[0] = a / (1-a);
        double F=0;
        for (int i=1; 1<=10000;i++){
            f[i] = f[0]+((Math.pow(x-a,i))*(x)*(Math.pow(-1,i))/(Math.pow(1-x,i+1)));
            double ea = ((f[i]-f[i-1])/f[i])*100;
            if (Math.abs(ea)<(es)) {
                F += f[i];
                
            System.out.println("Nilai f(x) saat di x = " +x+ " adalah " +Math.floor(F*10000/10000));
            break;
            }
        }
         
}
}
