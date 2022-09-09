

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class MouseEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "Programming is fun");
    pane.getChildren().addAll(text);   

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 100);
    primaryStage.setTitle("MouseEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    
    //register mouse event in pane
    //mouse press, mouse release. mouse click
    pane.setOnMouseClicked(e->{
        double x = e.getX();
        double y = e.getY();
        System.out.println("You clicked at("+x+","+y+")");
        System.out.println(e.getClickCount());
        
        if(e.getButton() == MouseButton.PRIMARY){
            JOptionPane.showMessageDialog(null,"hello");
        }else if(e.getButton() == MouseButton.SECONDARY){
            System.exit(0);
        }
        
    });
    
    //mouse enter, mouse exit
    pane.setOnMouseEntered(e->{
        System.out.println("Moure Enter");
    });
    
    pane.setOnMouseExited(e->{
        System.out.println("Mouse Exit");
    });
    
    //mouse move, mouse drag
    //moving the text follow themouse movement
    pane.setOnMouseMoved(e->{
        double x = e.getX();
        double y = e.getY();
        //reassign/reset/reallocate the text followthe current mouse point
        text.setX(x);
        text.setY(y);
        //text.relocate(x,y);//click location
    });
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 

