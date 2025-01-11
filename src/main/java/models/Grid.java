package models;
import models.cells.Cell;
import strategies.draw.DrawStrategy;
import strategies.fill.FillStrategy;

public class Grid {
    private FillStrategy fillStrategy;
    private DrawStrategy drawStrategy;

    private int rows;
    private int cols;
    private Cell[][] grid;

    public Grid(int rows, int cols, FillStrategy fillStrategy, DrawStrategy drawStrategy) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Cell[rows][cols];
        this.fillStrategy = fillStrategy;
        this.drawStrategy = drawStrategy;
        fillStrategy.fill(this);
    }

    public void draw() {
        drawStrategy.draw(this);
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

    public void update(int elapsedTime) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j].getPhysicalObject().update(elapsedTime);
            }
        }
    }

    public void setCell(int i, int j, Cell cell) {
        grid[i][j] = cell;
    }
}
