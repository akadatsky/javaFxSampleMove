package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Circle extends AbstractShape {

    public Circle(GraphicsContext gc) {
        super(gc);
    }

    public void move() {
        x += speed;
    }

    public void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, y, 50, 50);
    }

}
