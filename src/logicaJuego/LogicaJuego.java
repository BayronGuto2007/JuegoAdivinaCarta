/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaJuego;

import java.util.Random;

/**
 *
 * @author balyg
 */
public class LogicaJuego {
    public int[] getCardNumbers()
    {
        int[] number = new int[16];
        int count = 0;
        
        while (count<16) {
            Random r  =  new Random();
            int na  = r.nextInt(8)+1; 
            int nvr= 0;
            
            
            for (int i = 0; i < 16; i++) {
                if (number[i]==na) {
                    nvr++;
                }
            }
            
            if (nvr<2){
                number[count] = na;
                count++;
            }
            
            
        }
        return number;
    } 
}
