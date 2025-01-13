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

                    //[math.floor(127 + radius * math.cos(phi) * math.sin(theta)),
                    //                        math.floor(127 + radius * math.sin(phi) * math.sin(theta)),
                    //                        math.floor(127 + radius * math.cos(theta))]                try {
                try {
                     DoublePendulum pendulum = (DoublePendulum) grid.getCell(i, j).getPhysicalObject();
                    sketch.fill((int)(127 + 127 * Math.cos(pendulum.getAngle1()) * Math.sin(pendulum.getAngle2())),
                            (int)(127 + 127 * Math.sin(pendulum.getAngle1()) * Math.sin(pendulum.getAngle2())),
                            (int)(127 + 127 * Math.cos(pendulum.getAngle2())));

//                    if (pendulum.getAngle1() <=  Math.PI && pendulum.getAngle2() <=  Math.PI) {
                //
//                        sketch.fill((int)(100 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(0 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),100);
//                    } else if (pendulum.getAngle1() >  Math.PI && pendulum.getAngle2() <=  Math.PI) {
//                        sketch.fill(0,0,(int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI));
//                    } else if (pendulum.getAngle1() >  Math.PI && pendulum.getAngle2() >  Math.PI) {
//                        sketch.fill((int)(50 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(50 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(255 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI));
//                    } else {
//                        sketch.fill((int)(150 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(50 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI),(int)(75 *((pendulum.getAngle2() + pendulum.getAngle1()) % Math.PI) / Math.PI));
//                    }
                    sketch.rect(j * Settings.CELL_SIZE, i * Settings.CELL_SIZE, Settings.CELL_SIZE, Settings.CELL_SIZE);
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }
}
