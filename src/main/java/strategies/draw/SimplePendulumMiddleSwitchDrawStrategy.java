package strategies.draw;

import models.Grid;
import models.physical_objects.pendulums.simple.SimplePendulum;
import processing.core.PApplet;
import settings.Settings;

public class SimplePendulumMiddleSwitchDrawStrategy extends DrawStrategy {

    public SimplePendulumMiddleSwitchDrawStrategy(PApplet sketch) {
        super(sketch);
    }


    @Override
    public void draw(Grid grid) {
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                try {
                    SimplePendulum pendulum = (SimplePendulum) grid.getCell(i, j).getPhysicalObject();
                    if (pendulum.getAngle() >  Math.PI) {
                        sketch.fill(0);
                    } else {
                        sketch.fill(255);
                    }
                    sketch.rect(j * Settings.CELL_SIZE, i * Settings.CELL_SIZE, Settings.CELL_SIZE, Settings.CELL_SIZE);
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }
}
