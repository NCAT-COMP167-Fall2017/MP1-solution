package brickbreakerstudent;

import javafx.scene.paint.Color;

/**
 *
 * @author CCannon
 */
public class BrickRow {
    /**
     * pointValue holds the point value for the bricks on this row
     */
    private int pointValue;
    /**
     * color holds the color of bricks on this row
     */
    private Color color;
    /**
     * True or false for each brick. true = visible, false = not visible
     */
    private boolean[] brickmask;
    
    private final int NUM_BRICKS = 20;

    /**
     * Create a BrickRow with the NUM_BRICKS given, set to default point value of 0 and Orange color.
     */
    public BrickRow() {
        pointValue = 0;
        color = Color.ORANGE;
        brickmask = new boolean[NUM_BRICKS];
    }
    
    /**
     * Creates a Brick row with the given values
     * @param ptVal the point value of each visible brick in this row
     * @param clr the color of each brick in this row
     * @param bmask a string with exactly NUM_BRICKS characters, 20, with 0 for not visible bricks and 1 for visible bricks
     */
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
     * Return the brickmask value at the given index
     * @param index in brickmask array to retrieve the mask
     * @return the brickmask, true if the brick is shown, otherwise false
     */
    public boolean getBrickMaskValue(int index) {
        return brickmask[index];
    }
    
    /**
     * Set the brickmask to the given value at the given index
     * @param index the location at which to place the given value in the brickmas
     * @param value false for not visible and true for visible
     */
    public void setBrickMaskValue(int index, boolean value) {
        brickmask[index] = value;
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
