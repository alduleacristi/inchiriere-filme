package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Pagination;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MainForm extends Application {
	private Pagination pagination;
	private MenuBar menuBar;
	private Menu menuLogin;
	TextField textField;
	Button search;
	MenuItem login;

	private int itemsPerPage() {
		return 5;
	}

	private VBox createPage(int pageIndex) {
		VBox box = new VBox(3);
		int page = pageIndex * itemsPerPage();
		for (int i = page; i < page + itemsPerPage(); i++) {
			VBox element = new VBox();
			Hyperlink link = new Hyperlink("Item " + (i + 1));
			link.setVisited(true);
			Label text = new Label("Search results\nfor " + link.getText());
			element.getChildren().addAll(link, text);
			box.getChildren().add(element);
		}
		return box;
	}

	@Override
	public void start(final Stage stage) throws Exception {
		stage.setTitle("Forma principala");
		Scene scene = new Scene(new VBox(), 800, 600);

		menuBar = new MenuBar();
		menuLogin = new Menu("Login");
		login = new MenuItem("Login");
		menuLogin.getItems().add(login);
		menuBar.getMenus().add(menuLogin);
		textField = new TextField();
		search = new Button("Search");

		pagination = new Pagination(10, 0);
		pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
		pagination.setPageFactory(new Callback<Integer, Node>() {
			@Override
			public Node call(Integer pageIndex) {
				return createPage(pageIndex);
			}
		});

		AnchorPane anchor = new AnchorPane();
		AnchorPane.setTopAnchor(pagination, 10.0);
		AnchorPane.setRightAnchor(pagination, 10.0);
		AnchorPane.setBottomAnchor(pagination, 10.0);
		AnchorPane.setLeftAnchor(pagination, 10.0);
		anchor.getChildren().addAll(pagination);
		pagination.setVisible(false);

		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		HBox.setMargin(textField, new Insets(50, 50, 50, 50));
		hbox.getChildren().addAll(textField, search);
		

		((VBox) scene.getRoot()).getChildren().addAll(menuBar, hbox, anchor);
		stage.setScene(scene);
		scene.getStylesheets().add("style/stylePagination.css");
		stage.show();

		search.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				pagination.setVisible(true);

			}
		});

		login.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				
		
				Login login = new Login();
				login.showForm();
				stage.close();
				
			}
		});
	}
	
	public void create(){
		launch();
	}

	public void showForm() {
		Stage stage = new Stage();
		try {
			start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
