package MVC;
import javafx.event.*;
public class Controller {
private Model model;
private ViewSpinner viewSpinner;
private View view ;
public Controller(Model model, ViewSpinner viewSpinner , View view )

{
this.model = model;
this.viewSpinner = viewSpinner ;
this.view = view;
addListenersToModel();

}
private void addListenersToModel()
{
}
public void control()
{
	
viewSpinner.getButton().setOnAction(new EventHandler<ActionEvent>() {	
  @Override
  public void handle(ActionEvent e)
    {
	validerSpinnerClick(); 
	}
}
);
view.getButton().setOnAction(new EventHandler<ActionEvent>() {	
	  @Override
	  public void handle(ActionEvent e)
	    {
		validerTextFieldClick(); 
		}
	}
	);


}
private void validerSpinnerClick()
{
int valeur= (int) viewSpinner.getSpinner().getValue();
model.setValue(valeur);
}
private void validerTextFieldClick ()
{
int valeur = view.getValue() ;
model.setValue(valeur);
view.setText(Integer.toString(model.getValue()));
}

}