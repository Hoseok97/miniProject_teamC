package exam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MenuMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
		
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		MenuController mctr = loader.getController();
		mctr.setRoot(root);
		
		ComboBox<String> cmbCnt1 = 
				(ComboBox<String>)root.lookup("#cmbCnt1");
		cmbCnt1.getItems().addAll("1 �κ�", "2 �κ�", "3 �κ�", "4 �κ�");
		
		ComboBox<String> cmbCnt2 = 
				(ComboBox<String>)root.lookup("#cmbCnt2");
		cmbCnt2.getItems().addAll("1 �κ�", "2 �κ�", "3 �κ�", "4 �κ�");
		
		ComboBox<String> cmbCnt3 = 
				(ComboBox<String>)root.lookup("#cmbCnt3");
		cmbCnt3.getItems().addAll("1 �κ�", "2 �κ�", "3 �κ�", "4 �κ�");
		
		ComboBox<String> cmbCnt4 = 
				(ComboBox<String>)root.lookup("#cmbCnt4");
		cmbCnt4.getItems().addAll("1 �κ�", "2 �κ�", "3 �κ�", "4 �κ�");
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("�ֹ�â");
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
