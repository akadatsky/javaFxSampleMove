package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    public static final int WIDTH = 1200;
    public static final int HEIGHT = 700;
    private GraphicsContext gc;

    private int x = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        BorderPane group = new BorderPane();
        group.setCenter(canvas);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        gc = canvas.getGraphicsContext2D();
        createTimer();
    }

    private void createTimer() {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                clean();
                move();
                draw();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 300, 300);

    }

    private void clean() {
        gc.clearRect(0, 0, WIDTH, HEIGHT);
    }

    private void move() {
        x += 10;
    }

    private void draw() {
        gc.setFill(Color.RED);
        gc.fillOval(x, 10, 50, 50);
    }

}


