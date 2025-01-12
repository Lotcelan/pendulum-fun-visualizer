package strategies.draw;

import models.Grid;
import models.physical_objects.pendulums.simple.SimplePendulum;
import processing.core.PApplet;
import settings.Settings;

public class SimplePendulumRainbowDrawStrategy extends DrawStrategy {

    public SimplePendulumRainbowDrawStrategy(PApplet sketch) {
        super(sketch);
    }


    @Override
    public void draw(Grid grid) {
        for (int i = 0; i < grid.getRows(); i++) {
            for (int j = 0; j < grid.getCols(); j++) {
                try {
                    SimplePendulum pendulum = (SimplePendulum) grid.getCell(i, j).getPhysicalObject();

                    sketch.colorMode(PApplet.HSB, 360, 255, 255);
                    sketch.fill(pendulumToHue(pendulum), 255, 255);

                    sketch.rect(j * Settings.CELL_SIZE, i * Settings.CELL_SIZE, Settings.CELL_SIZE, Settings.CELL_SIZE);
                    // also write the angle in degrees in the cell
                    sketch.fill(0);
                    sketch.text((int) Math.toDegrees(pendulum.getAngle()), j * Settings.CELL_SIZE + 5, i * Settings.CELL_SIZE + 15);
                } catch (Exception e) {
                    continue;
                }
            }
        }
    }

    private float pendulumToHue(SimplePendulum pendulum) {
        return (float) (pendulum.getAngle() / (2 * Math.PI) * 360);
    }
}
