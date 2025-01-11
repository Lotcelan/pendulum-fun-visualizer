package models.cells;

import models.physical_objects.PhysicalObject;

public abstract  class Cell {
    private int i;
    private int j;
    private PhysicalObject physicalObject;

    public Cell(int i, int j, PhysicalObject physicalObject) {
        this.i = i;
        this.j = j;
        this.physicalObject = physicalObject;
    }

    public PhysicalObject getPhysicalObject() {
        return physicalObject;
    }


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }



}
