package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Login extends Application {
	
	private String nume;

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage.initOwner(null);
		stage.initModality(javafx.stage.Modality.WINDOW_MODAL);
        Scene scene = new Scene(root);
    
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
		
	}
	
	public String getNume() {
		return nume;
	}

	@FXML 
	protected void login(ActionEvent event) {
       System.out.println("Sa dat click.");
       nume = "Gigi";
       Node  source = (Node)  event.getSource(); 
       Stage stage  = (Stage) source.getScene().getWindow();
       
       Operator operator = new Operator();
       operator.showForm();
       
       stage.close();
    }
	
	public void showForm(){
		Stage stage = new Stage();
		//stage.initOwner(((Node) event.getSource()).getScene().getWindow());
		try {
			start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
