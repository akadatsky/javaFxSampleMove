package sample;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class AbstractShape implements Shape {

    protected final GraphicsContext gc;

    protected double x;
    protected double y;
    protected double speed;

    public AbstractShape(GraphicsContext gc) {
        this.gc = gc;
        Random random = new Random();
        speed = random.nextInt(10) + 1;

        x = random.nextInt(Config.WIDTH - 50);
        y = random.nextInt(Config.HEIGHT - 50);

    }
}
