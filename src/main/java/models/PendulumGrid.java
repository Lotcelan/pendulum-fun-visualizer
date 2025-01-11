package models;

import processing.core.PApplet;

public class PendulumGrid extends Grid {
    public PendulumGrid(PApplet sketch, int rows, int cols) {
        super(rows, cols);
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                setCell(i, j, new PendulumCell(sketch, i, j));
            }
        }
    }

    public void draw() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                getCell(i, j).draw();
            }
        }
    }

}
