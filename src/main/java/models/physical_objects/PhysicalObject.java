package models.physical_objects;

public abstract class PhysicalObject {
    public abstract void update(int elapsedTime);

    public double millisTimeToSeconds(int elapsedTime) {
        return elapsedTime / 1000.0;
    }
}
