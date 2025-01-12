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

    private double initialAngle;

    /**
     * Current time in seconds elapsed since the beginning of the simulation.
     */
    private double t;

    public SimplePendulum(double angle, double length, double mass) {
        super();
        this.initialAngle = fixAngle(angle);
        setAngle(angle);
        this.length = length;
        this.mass = mass;
        this.t = 0.0;
    }

    @Override
    public void update(int elapsedTime) {
        t += millisTimeToSeconds(elapsedTime);
        setAngle(initialAngle * Math.cos(Math.sqrt(g / length) * t));
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
        this.angle = fixAngle(angle);
    }

    public double fixAngle(double angle) {
        while (angle < 0) {
            angle += 2 * Math.PI;
        }
        return angle % (2 * Math.PI);
    }
}
