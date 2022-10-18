/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad_semana06;

/**
 *
 * @author thepa
 */
public class ejercicio01{

   public static void main(String[] args) {   
    //llamada para obtener la suma de 5
    System.out.println(suma(4));
}
//método que devuelve la suma de los elementos desde n hasta 1
//ejemplo: n = 4 -> 4+3+2+1=10
public static int suma (int n)
{
    //caso base
    if(n==1)
        return 1;

    //llamada recursiva
    else
        return n+suma(n-1);
}   
}
