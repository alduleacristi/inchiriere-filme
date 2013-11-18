package view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Operator extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Operator.fxml"));
		
		Scene scene = new Scene(root);
	    
        stage.setTitle("Operator");
        stage.setScene(scene);
        stage.show();
		
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			
			@Override
			public void handle(WindowEvent arg0) {
				MainForm mainForm = new MainForm();
				mainForm.showForm();
				
			}
		});
	}
	
	public void showForm(){
		Stage stage = new Stage();
		try {
			start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
