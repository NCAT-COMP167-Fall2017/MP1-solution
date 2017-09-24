package brickbreakerstudent;

import javafx.scene.paint.Color;

/**
 *
 * @author CCannon
 */
public class BrickRow {
    /*
     * pointValue holds the point value for the bricks on this row
     */
    private int pointValue;
    /*
     * color holds the color of bricks on this row
    */
    private Color color;
    /*
     * True or false for each brick. true = visible, false = not visible
    */
    private boolean[] brickmask;
    
    private final int NUM_BRICKS = 20;

    public BrickRow() {
        pointValue = 0;
        color = Color.ORANGE;
        brickmask = new boolean[NUM_BRICKS];
    }
    
    public BrickRow(int ptVal, Color clr, String bmask) {
        pointValue = ptVal;
        color = clr;
        brickmask = new boolean[NUM_BRICKS];
        
        char[] maskArray = bmask.toCharArray();
        
        if(maskArray.length != brickmask.length) {
            System.err.println("Input BrickMask does not meet BrickMask size requirements");
            System.exit(-1);
        }
        
        for(int i = 0; i < NUM_BRICKS; i++) {
            if(maskArray[i] == '0') {
                brickmask[i] = false;
            } else {
                brickmask[i] = true;
            }
        }
    }
    
    /**
     * @return the pointValue
     */
    public int getPointValue() {
        return pointValue;
    }

    /**
     * @param pointValue the pointValue to set
     */
    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
