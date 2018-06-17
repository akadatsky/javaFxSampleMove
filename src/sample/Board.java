package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Board {

    private final GraphicsContext gc;

    private int x = 0;

    public Board(GraphicsContext gc) {
        this.gc = gc;
    }

    public void move() {
        x += 10;
    }

    public void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, 10, 50, 50);
    }
}
