import models.Grid;
import processing.core.PApplet;
import settings.Settings;
import strategies.draw.DoublePendulumPosNegDrawStrategy;
import strategies.draw.SimplePendulumMiddleSwitchDrawStrategy;
import strategies.draw.SimplePendulumRainbowDrawStrategy;
import strategies.fill.DoublePendulummFillStrategy;
import strategies.fill.SimplePendulummFillStrategy;

public class Main extends PApplet {

    private Grid grid;
    private int lastUpdateTime;


    public void settings() {
        size(Settings.WIDTH, Settings.HEIGHT);
    }

    public void setup() {
        frameRate(15);
        //grid = new Grid(Settings.ROWS, Settings.COLS, new SimplePendulummFillStrategy(), new SimplePendulumMiddleSwitchDrawStrategy(this));
        grid = new Grid(Settings.ROWS, Settings.COLS, new DoublePendulummFillStrategy(), new DoublePendulumPosNegDrawStrategy(this));
        lastUpdateTime = millis();
    }

    public void draw() {
        int currentTime = millis();
        int elapsedTime = currentTime - lastUpdateTime;
        lastUpdateTime = currentTime;

        background(255);
        grid.update(30);
        grid.draw();

        saveFrame("out/####.png");


        // Afficher le temps écoulé dans la console
        //println("Temps écoulé depuis la dernière mise à jour : " + elapsedTime + " ms");
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}