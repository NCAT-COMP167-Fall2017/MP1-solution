/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

/**
 *
 * @author CCannon
 */
public class Level {
    /**
     * Numeric label of this level
     */
    private int levelNum;
    /**
     * Array containing the brick rows in this level
     */
    private BrickRow[] brickRows;
    private final int MAX_ROWS = 50;

    /**
     * Creates a default level that is labeled 0 with MAX_ROWS, 50, rows
     */
    public Level() {
        levelNum = 0;
        brickRows = new BrickRow[MAX_ROWS];
    }
    
    /**
     * Retrieves the given BrickRow at the provided index
     * @param index the index of the BrickRow in the Level
     * @return BrickRow identified by the index
     */
    public BrickRow getBrickRow(int index) {
        return brickRows[index];
    }
    
    /**
     * Sets the given BrickRow as the given index in brickRows
     * @param index the location to place the given BrickRow
     * @param bkRow the BrickRow to add
     */ 
    public void setBrickRow(int index, BrickRow bkRow) {
        brickRows[index] = bkRow;
    }
    
    /**
     * Creates a Level object from the given parameters
     * @param levelNum the numeric identifier for this level
     * @param numBrickRows the number of BrickRows present in this level
     */
    public Level(int levelNum, int numBrickRows) {
        this.levelNum = levelNum;
        brickRows = new BrickRow[numBrickRows];
    }
    
    /**
     * @return the levelNum
     */
    public int getLevelNum() {
        return levelNum;
    }

    /**
     * @param levelNum the levelNum to set
     */
    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }
}
