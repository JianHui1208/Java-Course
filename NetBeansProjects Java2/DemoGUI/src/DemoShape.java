/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author William
 */
public class DemoShape extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        Text t1 = new Text(10, 10, "SUC");
        pane.getChildren().add(t1);
        
        Line line1 = new Line(10, 20, 60, 70);
        line1.setStroke(Color.GREEN);
        Line line2 = new Line(10, 70, 60, 20);
        line2.setStroke(Color.RED);
        pane.getChildren().addAll(line1,line2);
        
        Rectangle rec1 = new Rectangle(10, 80, 50, 50);
        Rectangle rec2 = new Rectangle(10, 190, 100, 100);
        rec2.setArcHeight(50);
        rec2.setArcWidth(50);
        pane.getChildren().addAll(rec1,rec2);
        
        Ellipse e1 = new Ellipse(130, 30, 50, 20);
        e1.setFill(null);//set as transparent inside color
        e1.setStroke(Color.BLACK);//line color
        pane.getChildren().addAll(e1);
        Scene scene = new Scene(pane, 300, 250);
        
        Arc a1 = new Arc(200, 200, 100, 100, 0, 30);
        Arc a2 = new Arc(200, 200, 100, 100, 90, 30);
        Arc a3 = new Arc(200, 200, 100, 100, 180, 30);
        Arc a4 = new Arc(200, 200, 100, 100, 270, 30);
        a1.setType(ArcType.ROUND);
        a2.setType(ArcType.ROUND);
        a3.setType(ArcType.ROUND);
        a4.setType(ArcType.ROUND);
        pane.getChildren().addAll(a1, a2, a3, a4);
        
        Polygon p = new Polygon();
        p.getPoints().add(250.0);//add coord x
        p.getPoints().add(20.0);//add coord y
        p.getPoints().add(250.0);
        p.getPoints().add(100.0);
        p.getPoints().add(300.0);
        p.getPoints().add(100.0);
        pane.getChildren().add(p);
        
        Polyline p1 = new Polyline();
        p1.getPoints().add(600.0);//add coord x
        p1.getPoints().add(90.0);//add coord y
        p1.getPoints().add(600.0);
        p1.getPoints().add(900.0);
        p1.getPoints().add(300.0);
        p1.getPoints().add(900.0);
        pane.getChildren().add(p1);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
