package strategies.fill;

import models.Grid;
import models.cells.PendulumCell;
import models.physical_objects.pendulums.simple.SimplePendulum;

public class SimplePendulummFillStrategy extends FillStrategy {
    public void fill(Grid grid) {
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                grid.setCell(i, j, new PendulumCell(i,j, new SimplePendulum(i* Math.PI / grid.getRows(), 0.5, 1)));
            }
        }
    }
}
