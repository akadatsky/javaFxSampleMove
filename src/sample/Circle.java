package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Circle extends AbstractShape {

    public Circle(GraphicsContext gc, List<Shape> shapes) {
        super(gc, shapes);
        color = Color.RED;
    }

    @Override
    public void draw() {
        super.draw();
        gc.fillOval(x, y, WIDTH, HEIGHT);
    }

}
