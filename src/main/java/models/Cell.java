package models;
import processing.core.PApplet;

public abstract  class Cell {
    private int i;
    private int j;
    private PApplet sketch;

    public Cell(PApplet sketch, int i, int j) {
        this.sketch = sketch;
        this.i = i;
        this.j = j;
    }

    public abstract void draw();

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public PApplet getSketch() {
        return sketch;
    }

}
