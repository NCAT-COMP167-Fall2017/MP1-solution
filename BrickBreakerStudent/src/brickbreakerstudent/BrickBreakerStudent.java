/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import javafx.scene.paint.Color;

/**
 *
 * @author CCannon
 */
public class BrickBreakerStudent {
    
    public static void main(String[] args) {
        Level[] levels = BrickBreakerIO.readConfigFile(args[0]);
        
        System.out.println(levels[0].toString());
    }
}
