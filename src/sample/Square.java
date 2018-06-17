package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Square extends AbstractShape {

    public Square(GraphicsContext gc, List<Shape> shapes) {
        super(gc, shapes);
        color = Color.GREEN;
    }

    @Override
    public void draw() {
        super.draw();
        gc.fillRect(x, y, WIDTH, HEIGHT);
    }
}
