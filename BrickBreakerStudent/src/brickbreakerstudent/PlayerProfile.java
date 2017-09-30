/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.util.ArrayList;

/**
 *
 * @author CCannon
 */
public class PlayerProfile {
    
    private String name;
    private int numGamesPlayed;
    private int highScore;
    private ArrayList<String> savedGames;
    
    /**
     * Instantiates a PlayerProfile object where all fields are set to the java
     * default values.
     */
    public PlayerProfile() {
        name = "";
        numGamesPlayed = 0;
        highScore = 0;
        savedGames = new ArrayList<String> ();
    }
    
    /**
     * Instantiates a PlayerProfile object with the given name. All other fields
     * are set to java default values.
     * @param name 
     */
    public PlayerProfile(String name) {
        this();
        name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numGamesPlayed
     */
    public int getNumGamesPlayed() {
        return numGamesPlayed;
    }

    /**
     * @param numGamesPlayed the numGamesPlayed to set
     */
    public void setNumGamesPlayed(int numGamesPlayed) {
        this.numGamesPlayed = numGamesPlayed;
    }

    /**
     * @return the highScore
     */
    public int getHighScore() {
        return highScore;
    }

    /**
     * @param highScore the highScore to set
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
    
    /**
     * Returns the number of items in the ArrayList savedGames
     * @return the number of items in the ArrayList savedGames
     */
    public int getNumSavedGames() {
        return savedGames.size();
    }
    
    /**
     * Get the saved game file location at location index in ArrayList savedGames
     * @param index the location of the saved game in ArrayList savedGames
     * @return the String file path of the saved game at given index
     */
    public String getSavedGame(int index) {
        return savedGames.get(index);
    }
    
    /**
     * Store item at location index in the ArrayList savedGames
     * @param index location to store item in ArrayList savedGames
     * @param item String file path to be added to ArrayList savedGames
     */
    public void setSavedGame(int index, String item) {
        savedGames.set(index, item);
    }
    
    /**
     * Appends a String file path of a saved game to ArrayList savedGames
     * @param item String file path of a saved game to add
     */
    public void addSavedGame(String item) {
        savedGames.add(item);
    }
    
    /**
     * Removes and returns a String file path of a saved game located at given
     * index in ArrayList savedGames
     * @param index the location of String file path to return in ArrayList savedGames
     * @return The String file path of a saved game that has been removed from ArrayList savedGames
     */
    public String deleteSavedGame(int index) {
        return savedGames.remove(index);
    }
    
    /**
     * Returns a string representation of this PlayerProfile in the same format as the input file
     * @return string representation of this PlayerProfile
     */
    public String toString() {
        String outputString = name + System.lineSeparator() + numGamesPlayed + System.lineSeparator() + highScore + System.lineSeparator() + savedGames.size();
        
        for(int i = 0; i < savedGames.size(); i++) {
            outputString += System.lineSeparator() + savedGames.get(i);
        }
        
        return outputString;
    }
    
}
