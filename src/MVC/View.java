package MVC;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class View  implements ChangedValueListener
{
private TextField input;
private Button bouton;
private Scene scene;
public View(Stage primaryStage)
{
Group root = new Group();
primaryStage.setTitle("Observer Pattern for a textFeild ");
primaryStage.setMinWidth(400);
primaryStage.setMinHeight(200);
scene=new Scene(root);
//ajouter un label
input=new TextField("0");
input.setLayoutX(40);
input.setLayoutY(75);
//ajouter un bouton
bouton = new Button("Valider");
bouton.setLayoutX(200);
bouton.setLayoutY(75);
root.getChildren().add(input);
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
	input.setText(text);
	
}
public int getValue()
{
 return Integer.parseInt(input.getText())  ;	
}

@Override
public void valueChanged(ChangedValueEvent event) {
	
	input.setText(Integer.toString(event.getNewValue())) ;
	
}

}