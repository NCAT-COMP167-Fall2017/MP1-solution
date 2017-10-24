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
        BrickRow row0 = new BrickRow(2, Color.AQUA, "10011010011010100110");
        BrickRow row1 = new BrickRow(3, Color.RED, "11001010010010110111");
        
        Level level = new Level(1, 2);
        
        row0.setColor(Color.GREEN);
        row1.setPointValue(10);
        
        level.setBrickRow(0, row0);
        level.setBrickRow(1, row1);
        level.setLevelNum(3);
        
        System.out.println(level.toString());
    }
}
