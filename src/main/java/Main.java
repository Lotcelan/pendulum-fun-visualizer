import models.Grid;
import processing.core.PApplet;
import settings.Settings;
import strategies.draw.SimplePendulumMiddleSwitchDrawStrategy;
import strategies.fill.SimplePendulummFillStrategy;

public class Main extends PApplet {

    private Grid grid;
    private int lastUpdateTime;

    public void settings() {
        size(Settings.WIDTH, Settings.HEIGHT);
    }

    public void setup() {
        grid = new Grid(Settings.ROWS, Settings.COLS, new SimplePendulummFillStrategy(), new SimplePendulumMiddleSwitchDrawStrategy(this));
        lastUpdateTime = millis();
    }

    public void draw() {
        int currentTime = millis();
        int elapsedTime = currentTime - lastUpdateTime;
        lastUpdateTime = currentTime;

        background(255);
        grid.update(elapsedTime);
        grid.draw();

        // Afficher le temps écoulé dans la console
        println("Temps écoulé depuis la dernière mise à jour : " + elapsedTime + " ms");
    }

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        Main mySketch = new Main();
        PApplet.runSketch(processingArgs, mySketch);
    }
}