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
public class igor {
    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 + small) {
            return false;
        }

        if (goal % 5 > small) {
            return false;
        }
        return true;
    }
  
}
