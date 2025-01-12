package strategies.fill;

import models.Grid;
import models.cells.DoublePendulumCell;
import models.cells.PendulumCell;
import models.physical_objects.pendulums.*;
import models.physical_objects.pendulums.doubl.DoublePendulum;
import models.physical_objects.pendulums.simple.SimplePendulum;

public class DoublePendulummFillStrategy extends FillStrategy {
    public void fill(Grid grid) {
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                grid.setCell(i, j, new DoublePendulumCell(i,j, new DoublePendulum(i* 2 * Math.PI / grid.getRows(), j * 2 * Math.PI / grid.getCols(), 1)));
            }
        }
    }
}
