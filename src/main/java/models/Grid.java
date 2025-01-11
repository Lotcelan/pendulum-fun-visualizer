package models;
import processing.core.PApplet;

public abstract class Grid {
    private int rows;
    private int cols;
    private Cell[][] grid;
    private PApplet sketch;

    public Grid(int rows, int cols) {
        this.sketch = sketch;
        this.rows = rows;
        this.cols = cols;
        this.grid = new Cell[rows][cols];
    }

    public void draw() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j].draw();
            }
        }
    }

    public Cell getCell(int i, int j) {
        return grid[i][j];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public PApplet getSketch() {
        return sketch;
    }

    public void setCell(int i, int j, Cell cell) {
        grid[i][j] = cell;
    }
}
