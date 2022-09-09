import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class SimpleHandleEvent extends Application{
     Button okbttn, cancelbttn;
     @Override
	public void start(Stage s) {
		HBox p = new HBox();
		okbttn = new Button("Ok");
		cancelbttn = new Button("Cancel");
		
		p.getChildren().addAll(okbttn, cancelbttn);
		
                //register the listener on ok buuton
                OKHandle ok = new OKHandle();
                okbttn.setOnAction(ok);
                
                //anonymuose (no class) inner class
                cancelbttn.setOnAction((ActionEvent o) -> {
                    JOptionPane.showMessageDialog(null, "hi");
                });
                //two writing method
//                CancelHandle Cancel = new CancelHandle();
//                cancelbttn.setOnAction(new CancelHandle());
                
		Scene scene = new Scene(p, 580, 100);
		s.setScene(scene);
		s.setTitle("Simple Handle Event");
		s.show();
	}
	public static void main(String[] args) {
        Application.launch(args);
    }
}//end class

//outer class/outside class
//listener class
class OKHandle implements EventHandler<ActionEvent>{//EventHandler = javafx library
    @Override
    public void handle(ActionEvent e){
        System.out.println(e.getSource());
        SimpleHandleEvent a = new SimpleHandleEvent();
        if(e.getSource().equals(a.okbttn)){
        System.out.println("This is Ok button");
    }else{
        System.out.println("This is Cancel button");
        }
}

class CancelHandle implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("This is Cancel button");
    }
}   
}
