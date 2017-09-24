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
