package models.physical_objects.pendulums.simple;

import models.physical_objects.pendulums.Pendulum;

public class SimplePendulum extends Pendulum {
    /**
     * Angle of the pendulum in radians.
     */
    private double angle;

    public SimplePendulum(double angle) {
        super();
        setAngle(angle);
    }

    @Override
    public void update() {
        angle = (angle + 0.5) % (2 * Math.PI);
    }

    public double getAngle() {
        //System.out.println("SimplePendulum getAngle");
        return angle;
    }

    /**
     * Set the angle of the pendulum. Hypothesis : angle is in radians, and will be converted in the range [0, 2*PI]
     * @param angle
     */
    public void setAngle(double angle) {
        if (angle < 0) {
            this.angle = 2 * Math.PI + angle;
        } else {
            this.angle = angle % (2 * Math.PI);
        }
    }
}
