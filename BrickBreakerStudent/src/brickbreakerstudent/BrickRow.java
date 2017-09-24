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
