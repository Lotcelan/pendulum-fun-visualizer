import models.Grid;
import processing.core.PApplet;
import strategies.draw.SimplePendulumPosNegDrawStrategy;
import strategies.fill.SimplePendulummFillStrategy;

public class Main extends PApplet{

    private Grid grid;


    public void settings(){
        size(500, 500);
    }

    public void setup(){
        grid = new Grid(10, 10, new SimplePendulummFillStrategy(), new SimplePendulumPosNegDrawStrategy(this));
    }

    public void draw(){
        background(255);
        grid.update();
        grid.draw();
    }




    public static void main(String[] args){
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
