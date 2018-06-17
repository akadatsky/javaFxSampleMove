package sample;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class AbstractShape implements Shape {

    protected final GraphicsContext gc;

    protected final int WIDTH = 30;
    protected final int HEIGHT = 30;

    protected double x;
    protected double y;
    protected double speed;

    public AbstractShape(GraphicsContext gc) {
        this.gc = gc;
        Random random = new Random();
        speed = random.nextInt(10) + 1;

        x = random.nextInt(Config.WIDTH - WIDTH);
        y = random.nextInt(Config.HEIGHT - HEIGHT);

    }
}
