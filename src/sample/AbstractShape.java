package sample;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class AbstractShape implements Shape {

    protected final GraphicsContext gc;

    protected final int WIDTH = 30;
    protected final int HEIGHT = 30;

    protected double x;
    protected double y;
    protected double speedX;
    protected double speedY;

    public AbstractShape(GraphicsContext gc) {
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
}
