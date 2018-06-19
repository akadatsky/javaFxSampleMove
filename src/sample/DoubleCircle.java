package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class DoubleCircle extends Circle {

    public DoubleCircle(GraphicsContext gc, List<Shape> shapes) {
        super(gc);
    }

    @Override
    public void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, y, WIDTH, HEIGHT);

        gc.setFill(Color.GREEN);
        gc.fillOval(x + WIDTH, y, WIDTH, HEIGHT);
    }
}
