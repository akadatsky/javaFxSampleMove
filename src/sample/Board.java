package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final GraphicsContext gc;
    Circle shape;

    public Board(GraphicsContext gc) {
        this.gc = gc;
        shape = new Circle(gc);
    }

    public void moveLeft() {
        clean();
        shape.moveLeft();
        shape.draw();
    }

    public void moveRight() {
        clean();
        shape.moveRight();
        shape.draw();
    }

    private void clean() {
        gc.clearRect(0, 0, Config.WIDTH, Config.HEIGHT);
    }


}
