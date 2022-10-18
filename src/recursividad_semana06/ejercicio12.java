/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_semana06;

/**
 *
 * @author thepa
 */
public class ejercicio12 {
    
 public static void main(String[] args) {
       //número a convertir
    int N=10;
    binario(N);
    System.out.println();
    System.out.println(binario2(N));
}
//solución1: método que imprime por pantalla n en binario
public static void binario(int n)
{
    if(n<2) System.out.print(n);
    else
    {
        binario(n/2);
        System.out.print(n%2);
    }
}
//solución2: método que devuelve el binario de n
public static int binario2(int n)
{
    if(n<2) return n;
    else
        return n%2+10*binario2(n/2);
    }  
}
