package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final GraphicsContext gc;
    List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;
        for (int i = 0; i < 20; i++) {
            shapes.add(new Circle(gc));
        }
    }

    public void move() {
        for (Shape shape : shapes) {
            shape.move();
        }
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
