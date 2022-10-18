/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad_semana06;

/**
 *
 * @author thepa
 */
public class ejercicio06 {
    
 public static void main(String[] args) {
        int base=2;
    int exp=4;
    System.out.println(base+" elevado a "+exp+" = "+poten(base, exp));
}
//método que devuelve base elevado a exp
//ejemplo: base = 2 y exp = 4 -> 16
static int poten(int base, int exp)
{
    if(exp==0) return 1; // cualquier número elevado a cero es 1
    else if(exp==1) return base;
    else return base * poten(base,exp-1);
    }  
}
