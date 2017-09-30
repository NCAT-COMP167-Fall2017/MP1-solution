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
        
        PlayerProfile player1= new PlayerProfile("Chris");
        player1.setHighScore(26);
        player1.setNumGamesPlayed(52);
        player1.addSavedGame("game1.txt");
        player1.addSavedGame("game2.txt");
        
        PlayerProfile player2 = new PlayerProfile();
        player2.setName("Adam");
        player2.setHighScore(5);
        player2.setNumGamesPlayed(3);
        player2.addSavedGame("adamGame1.txt");
        
        GameProfiles game = new GameProfiles();
        game.addPlayerProfile(player1);
        game.addPlayerProfile(player2);
        game.setHighGameProfile(player1);
        game.setSelectedProfile(player2);
        
        System.out.println(game.toString());
    }
}
