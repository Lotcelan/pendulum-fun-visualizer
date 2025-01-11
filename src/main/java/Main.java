import models.Grid;
import models.PendulumGrid;
import processing.core.PApplet;

public class Main extends PApplet{

    private Grid grid;


    public void settings(){
        size(500, 500);
    }

    public void setup(){
        grid = new PendulumGrid(this, 10, 10);
    }

    public void draw(){
        background(255);
        grid.draw();
    }


    public static void main(String[] args){
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
