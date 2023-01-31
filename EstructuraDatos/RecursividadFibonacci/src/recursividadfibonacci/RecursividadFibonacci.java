/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividadfibonacci;
import javax.swing.*;

public class RecursividadFibonacci {

    public static void main(String[] args) {
        int limiteNumero, i;
        
        limiteNumero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite el limite de numeros de la serie de Fibonacci: "));
        
        for(i=0; i < limiteNumero; i++){
           JOptionPane.showMessageDialog(null,
                   "La secuencia de Fibonacci solicitada es: " +"\n" + fibonacci(i));
        }
    }
    
    public static int fibonacci(int limiteNumero){
        if ((limiteNumero == 0) || (limiteNumero == 1)){
            return limiteNumero;
        }
        else{
            return fibonacci(limiteNumero - 1) + fibonacci(limiteNumero - 2);
        }
    }
    
}
