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
public class GameProfiles {
    private PlayerProfile selectedProfile;
    private PlayerProfile highGameProfile;
    private ArrayList<PlayerProfile> profiles;

    /**
     * Instantiates a new GameProfile object where each item is a new, default
     * instance of that object.
     */
    public GameProfiles() {
        selectedProfile = new PlayerProfile();
        highGameProfile = new PlayerProfile();
        profiles = new ArrayList<PlayerProfile> ();
    }
    
    /**
     * @return the selectedProfile
     */
    public PlayerProfile getSelectedProfile() {
        return selectedProfile;
    }

    /**
     * @param selectedProfile the selectedProfile to set
     */
    public void setSelectedProfile(PlayerProfile selectedProfile) {
        this.selectedProfile = selectedProfile;
    }

    /**
     * @return the highGameProfile
     */
    public PlayerProfile getHighGameProfile() {
        return highGameProfile;
    }

    /**
     * @param highGameProfile the highGameProfile to set
     */
    public void setHighGameProfile(PlayerProfile highGameProfile) {
        this.highGameProfile = highGameProfile;
    }
    
    /**
     * Returns the number of items in the ArrayList profiles
     * @return the number of items in the ArrayList profiles
     */
    public int getNumPlayerProfiles() {
        return profiles.size();
    }
    
    /**
     * Returns the PlayerProfile at given index in ArrayList profiles
     * @param index the location of the PlayerProfile to be retrieved from profiles
     * @return the PlayerProfile at given index
     */
    public PlayerProfile getPlayerProfile(int index) {
        return profiles.get(index);
    }
    
    /**
     * Adds the given item to ArrayList profiles at the given index
     * @param index the location to place given PlayerProfile item
     * @param item the PlayerProfile to add to ArrayList profiles
     */
    public void setPlayerProfile(int index, PlayerProfile item) {
        profiles.set(index, item);
    }
    
    /**
     * Appends the given PlayerProfile item to the end of ArrayList profiles
     * @param item the PlayerProfile to add
     */
    public void addPlayerProfile(PlayerProfile item) {
        profiles.add(item);
    }
    
    /**
     * Removes and returns the PlayerProfile at the given index in ArrayList profiles
     * @param index the location of the PlayerProfile to remove
     * @return the PlayerProfile removed from the given index in the ArrayList profiles
     */
    public PlayerProfile deletePlayerProfile(int index) {
        return profiles.remove(index);
    }
    
    public String toString() {
        String outputString = "";
        
        for(int i = 0; i < profiles.size(); i++) {
            outputString += profiles.get(i).toString();
        }
        
        return outputString;
    }
}
