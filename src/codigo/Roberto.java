/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author xp
 */
public class Roberto {

    public int loneSum(int a, int b, int c) {
        int suma = 0;
        if (a == b) {
            suma = c;
        }
        if (a == c) {
            suma = b;
        }
        if (b == c) {
            suma = a;
        }
        if (a != b && a != c && b != c) { //todos los numeros son distintos 
            suma = a + b + c;
        }

        if (a == b && a == c && b == c) { //en el caso de que todos los numeros sean iguales
            suma = 0;
        }

        return suma;
    }

}
