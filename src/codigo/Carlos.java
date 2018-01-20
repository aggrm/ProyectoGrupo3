/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author carlosabia
 */
public class Carlos {
    public void run(){
        roundSum(16, 17, 18);
        roundSum(12, 13, 14);
        roundSum(6, 4, 4);
}
    
    
    
    
    
    
    
    
    
   public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int num) {
    int single = num % 10;
    if(single >= 5){
    num += (10 - single);
    }
    else{
    num -= single;
    }
  return num;
} 
}
