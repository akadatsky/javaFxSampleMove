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
        for (int i = 0; i < 7; i++) {
            shapes.add(new Circle(gc, shapes));
            shapes.add(new DoubleCircle(gc, shapes));
            shapes.add(new Square(gc, shapes));
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
