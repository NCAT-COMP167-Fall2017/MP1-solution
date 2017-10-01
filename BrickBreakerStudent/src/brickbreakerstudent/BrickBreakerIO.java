/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;
import javafx.scene.paint.Color;

/**
 *
 * @author CCannon
 */
public class BrickBreakerIO {
    /**
     * Reads a config file for a BrickBreaker game and returns an array of levels for that game.
     * @param cFileName file containing the properly formatted data for a BrickBreaker game
     * @return array of Level objects each containing a number of BrickRows parsed from the config file
     */
    public static Level[] readConfigFile(String cFileName){
        Level[] levels;
        
        try {
            Scanner fileReader = new Scanner(new File(cFileName));
            int numLevels = Integer.parseInt(fileReader.nextLine());
            levels = new Level[numLevels];
            
            for(int i = 0; i < numLevels; i++){
                int levelNumber = Integer.parseInt(fileReader.nextLine());
                int numRows = Integer.parseInt(fileReader.nextLine());
                
                Level newLvl = new Level(levelNumber, numRows);
                
                for(int j = 0; j < numRows; j++){
                    int rowIndex = Integer.parseInt(fileReader.nextLine());
                    
                    String[] color = fileReader.nextLine().split("\\s+");
                    Color rowColor = new Color(Double.parseDouble(color[0])/255.0, Double.parseDouble(color[1])/255.0, Double.parseDouble(color[2])/255.0, 0.0);
                    int rowPointValue = Integer.parseInt(fileReader.nextLine());
                    String rowBrickMask = fileReader.nextLine();
                    
                    BrickRow newRow = new BrickRow(rowPointValue, rowColor, rowBrickMask);
                    
                    newLvl.setBrickRow(rowIndex, newRow);
                }
                
                levels[levelNumber] = newLvl;
            }
        } catch (FileNotFoundException ex) {
            levels = new Level[0];
            Logger.getLogger(BrickBreakerIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return levels;
    }
    
    /**
     * Reads a config file of PlayerProfiles and adds them to the statically provided Game Profile
     * @param gmProf a static GameProfiles object that will receive PlayerProfiles
     * @param pFileName the path to a player profile config file
     */
    public static void readProfiles(GameProfiles gmProf, String pFileName) {
        gmProf.setProfileFilename(pFileName);
        try {
            Scanner profileReader = new Scanner(new File(pFileName));
            
            while(profileReader.hasNext()) {
                PlayerProfile newPlayer = new PlayerProfile();
                
                newPlayer.setName(profileReader.nextLine());
                newPlayer.setNumGamesPlayed(Integer.parseInt(profileReader.nextLine()));
                newPlayer.setHighScore(Integer.parseInt(profileReader.nextLine()));
                
                int numSavedGames = Integer.parseInt(profileReader.nextLine());
                
                for(int i = 0; i < numSavedGames; i++) {
                    newPlayer.addSavedGame(profileReader.nextLine());
                }
                
                if(newPlayer.getHighScore() > gmProf.getHighGameProfile().getHighScore())
                    gmProf.setHighGameProfile(newPlayer);
                
                gmProf.addPlayerProfile(newPlayer);
            }
            
            gmProf.setSelectedProfile(gmProf.getPlayerProfile(0));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrickBreakerIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Writes the statically provided GameProfile object to a PlayerProfile config file
     * @param gmProf a static GameProfiles object to be saved to a file
     * @param pFileName the path to a player profile config file
     */
    public static void writeProfiles(GameProfiles gmProf, String pFileName) {
        gmProf.setProfileFilename(pFileName);
        try {
            PrintWriter profileWriter = new PrintWriter(new File(pFileName));
            
            for(int i = 0; i < gmProf.getNumPlayerProfiles(); i++) {
                profileWriter.println(gmProf.getPlayerProfile(i).toString());
            }
            
            profileWriter.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrickBreakerIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
