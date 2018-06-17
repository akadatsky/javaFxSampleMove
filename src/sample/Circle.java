package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Circle implements Shape {

    private final GraphicsContext gc;
    private double x = 0;
    private double y = 0;
    public int speed;

    public Circle(GraphicsContext gc, double y) {
        this.gc = gc;
        this.y = y;

        Random random = new Random();
        speed = random.nextInt(10) + 1;
    }

    public void move() {
        x += speed;
    }

    public void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, y, 50, 50);
    }

}
