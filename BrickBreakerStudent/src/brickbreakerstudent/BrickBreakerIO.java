/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.io.File;
import java.io.FileNotFoundException;
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
}
