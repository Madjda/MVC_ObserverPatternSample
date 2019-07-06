package MVC;

import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application {
public static void main(String[] args) {
launch(args); }
@Override
public void start(Stage primaryStage)
{
View view = new View(primaryStage) ;
Stage  secondStage = new Stage();
Model model = new Model(0);
ViewSpinner  viewSpinner = new ViewSpinner(secondStage);
Controller controller=new Controller(model,viewSpinner,view);
controller.control();
}
}