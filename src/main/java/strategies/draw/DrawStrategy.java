package strategies.draw;

import models.Grid;
import processing.core.PApplet;

public abstract class DrawStrategy {
    protected PApplet sketch;

    public DrawStrategy(PApplet sketch) {
        this.sketch = sketch;
    }

    public abstract void draw(Grid grid);

}
