package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Random;

public abstract class AbstractShape implements Shape {

    protected final GraphicsContext gc;

    protected final int WIDTH = 30;
    protected final int HEIGHT = 30;

    protected double x;
    protected double y;
    protected double speedX;
    protected double speedY;

    protected Color color;

    public AbstractShape(GraphicsContext gc, List<Shape> shapes) {
        this.gc = gc;
        Random random = new Random();

        speedX = random.nextInt(20) - 10;
        speedY = random.nextInt(20) - 10;

        x = random.nextInt(Config.WIDTH - WIDTH);
        y = random.nextInt(Config.HEIGHT - HEIGHT);
    }

    @Override
    public void move() {
        x += speedX;
        y += speedY;

        if (x + WIDTH >= Config.WIDTH) {
            speedX = -speedX;
        }
    }

    @Override
    public void draw() {
        gc.setFill(color);
    }
}
