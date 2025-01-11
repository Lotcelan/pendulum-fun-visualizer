package models.physical_objects.pendulums.simple;

import models.physical_objects.pendulums.Pendulum;

import static settings.Settings.g;

public class SimplePendulum extends Pendulum {
    /**
     * Angle of the pendulum in radians.
     */
    private double angle;

    /**
     * Length of the pendulum in meters.
     */
    private double length;

    /**
     * Mass of the pendulum in kg.
     */
    private double mass;

    public SimplePendulum(double angle, double length, double mass) {
        super();
        setAngle(angle);
    }

    @Override
    public void update(int elapsedTime) {
        // using euler's method with simple pendulum equation

        double angularAcceleration = -g / length * Math.sin(angle);
        double angularVelocity = angularAcceleration * millisTimeToSeconds(elapsedTime);
        setAngle(angle + angularVelocity * millisTimeToSeconds(elapsedTime));
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
