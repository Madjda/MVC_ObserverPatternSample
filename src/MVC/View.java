package MVC;
import java.time.chrono.ChronoZonedDateTime;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

public class View  implements ChangedValueListener
{
private Label label;
private Button bouton;
private Scene scene;
public View(Stage primaryStage)
{
Group root = new Group();
primaryStage.setTitle("Observer Pattern for a label ");
primaryStage.setMinWidth(400);
primaryStage.setMinHeight(200);
scene=new Scene(root);
//ajouter un label
label=new Label("0");
label.setLayoutX(180);
label.setLayoutY(50);
//ajouter un bouton
bouton = new Button("Incrémenter");
bouton.setLayoutX(150);
bouton.setLayoutY(90);
root.getChildren().add(label);
root.getChildren().add(bouton);
primaryStage.setScene(scene);
primaryStage.show();
}

public Button getButton() 
{
return bouton;
}

public void setText(String text)
{
	label.setText(text);
	
}
public int getValue()
{
 return Integer.parseInt(label.getText())  ;	
}

@Override
public void volumeChanged(ChangedValueEvent event) {
	label.setText(Integer.toString(event.getNewValue())) ;
	
}

}