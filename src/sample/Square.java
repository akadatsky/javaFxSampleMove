package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends AbstractShape {

    public Square(GraphicsContext gc) {
        super(gc);
    }

    @Override
    public void draw() {
        gc.setFill(Color.GREEN);
        gc.fillRect(x, y, WIDTH, HEIGHT);
    }
}
