package strategies.draw;

import models.Grid;
import models.physical_objects.pendulums.doubl.DoublePendulum;
import models.physical_objects.pendulums.simple.SimplePendulum;
import processing.core.PApplet;
import settings.Settings;

public class DoublePendulumPosNegDrawStrategy extends DrawStrategy {

    public DoublePendulumPosNegDrawStrategy(PApplet sketch) {
        super(sketch);
    }


    @Override
    public void draw(Grid grid) {
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                try {
                    DoublePendulum pendulum = (DoublePendulum) grid.getCell(i, j).getPhysicalObject();
                    if (pendulum.getAngle1() <=  Math.PI && pendulum.getAngle2() <=  Math.PI) {
                        sketch.fill((int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),0);
                    } else if (pendulum.getAngle1() >  Math.PI && pendulum.getAngle2() <=  Math.PI) {
                        sketch.fill(0,0,(int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI));
                    } else if (pendulum.getAngle1() >  Math.PI && pendulum.getAngle2() >  Math.PI) {
                        sketch.fill(0,(int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),0);
                    } else {
                        sketch.fill((int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),0,0);
                    }
                    sketch.rect(j * Settings.CELL_SIZE, i * Settings.CELL_SIZE, Settings.CELL_SIZE, Settings.CELL_SIZE);
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }
}
