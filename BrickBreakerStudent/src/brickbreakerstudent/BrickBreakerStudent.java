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
        GameProfiles game = new GameProfiles();
        
        Level[] gameLevels = BrickBreakerIO.readConfigFile(args[0]);
        BrickBreakerIO.readProfiles(game, args[1]);
        
        for(int i = 0; i < gameLevels.length; i++) {
            System.out.println(gameLevels[i].toString());
        }
        
        System.out.println(game.toString());
    }
}
