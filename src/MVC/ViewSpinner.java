package MVC ;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;
public class ViewSpinner implements ChangedValueListener {
private Spinner<Integer> spinner;
private Button bouton;
private Scene scene;
public ViewSpinner(Stage primaryStage){
Group root = new Group();
primaryStage.setTitle("Observer Pattern for a spinner");
primaryStage.setMinWidth(400);
primaryStage.setMinHeight(200);
scene=new Scene(root);

/* Spinner */

spinner = new Spinner<Integer>(0,50,0);
spinner.setLayoutX(40);
spinner.setLayoutY(75);
spinner.setEditable(false);

/* Button */

bouton = new Button("Valider");
bouton.setLayoutX(200);
bouton.setLayoutY(75);
root.getChildren().add(bouton);
root.getChildren().add(spinner);
primaryStage.setScene(scene);
primaryStage.show();
}
public Spinner getSpinner(){
return spinner;
}
public Button getButton(){
return bouton;
}

/* Listener */

@Override
public void volumeChanged(ChangedValueEvent evt){
spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,1000,evt.getNewValue()));
}
}