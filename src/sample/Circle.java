package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends AbstractShape {

    public Circle(GraphicsContext gc) {
        super(gc);
    }

    public void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, y, WIDTH, HEIGHT);
    }

}
