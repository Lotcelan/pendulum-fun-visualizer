package models;

import processing.core.PApplet;

public class PendulumCell extends Cell {
    public PendulumCell(PApplet sketch, int i, int j) {
        super(sketch, i, j);
    }

    public void draw() {
        // Draw a circle at the cell's position
        getSketch().ellipse(getJ() * 50 + 25, getI() * 50 + 25, 50, 50);
    }
}
