package assignment5;

import javafx.application.Application;
import javafx.*;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {




    public static void main(String[] args) {
        launch(args);
    }

    //note: size of stage adjusts to fit size of scene
    @Override
    public void start(Stage stage) throws Exception {
        //i am writing a comment
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.DARKORCHID);

        Text text = new Text();
        text.setText("This is text on your screen");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font(30));
        text.setFill(Color.YELLOWGREEN);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(400);
        rectangle.setHeight(400);
        rectangle.setFill(Color.YELLOW);
        rectangle.setStrokeWidth(10);
        rectangle.setStroke(Color.RED);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                300d, 200d,
                400d, 350d,
                200d, 350d);
        triangle.setFill(Color.WHEAT);

        Circle circle = new Circle();
        circle.setCenterX(300);
        circle.setCenterY(285);
        circle.setRadius(30);
        circle.setFill(Color.ANTIQUEWHITE);

        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
