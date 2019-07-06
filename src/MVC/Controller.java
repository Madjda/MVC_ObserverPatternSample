package MVC;
import javafx.event.*;
public class Controller {
private Model model;
private ViewSpinner viewSpinner;
private View view ;
public Controller(Model model, ViewSpinner viewSpinner , View view ){
this.model = model;
this.viewSpinner = viewSpinner ;
this.view = view;
addListenersToModel();
}
private void addListenersToModel() {
model.addVolumeListener(viewSpinner);
model.addVolumeListener(view);
}
public void control()
{
viewSpinner.getButton().setOnAction(new EventHandler<ActionEvent>() {	
  @Override
  public void handle(ActionEvent e)
    {
	traitClicMethod(); 
	}
}
);
view.getButton().setOnAction(new EventHandler<ActionEvent>() {	
	  @Override
	  public void handle(ActionEvent e)
	    {
		IncrementClick(); 
		}
	}
	);


}
private void traitClicMethod()
{
int valeur= (int) viewSpinner.getSpinner().getValue();
System.out.println(valeur);
model.setValue(valeur);
}
private void IncrementClick ()
{
int valeur = view.getValue() ;
valeur++;
model.setValue(valeur);
view.setText(Integer.toString(model.getValue()));
}

}