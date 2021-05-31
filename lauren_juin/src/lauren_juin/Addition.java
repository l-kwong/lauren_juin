/*
* Author : laurenkwong
* Date : May 31, 2021
* Description : Permet d'additioner deux nombre
*/

package lauren_juin;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Addition extends Application {
	
	@Override
	public void start(Stage primaryStage) 
	{
		Group group=new Group();
		Scene scene=new Scene(group,400,400);
		
		TextField txt=new TextField();
		txt.setLayoutX(120);
		txt.setLayoutY(60);
			
		txt.setOnAction((event) ->
		{
			System.out.println(txt.getText());
		}
			);
		
		TextField txt1=new TextField();
		txt1.setLayoutX(120);
		txt1.setLayoutY(100);
			
		txt1.setOnAction((event) ->
			{
				System.out.println(txt1.getText());
			}
				);
		
		Label label=new Label();
		label.setLayoutX(100);
		label.setLayoutY(140);
		
		label.setOnKeyPressed((event) ->
		{
			System.out.println(txt.getText());
		}
			);
		
		Label label1=new Label();
		label1.setLayoutX(100);
		label1.setLayoutY(140);
		
		label1.setOnKeyPressed((event) ->
		{
			System.out.println("+");
		}
			);
		
		Label label2=new Label();
		label2.setLayoutX(100);
		label2.setLayoutY(140);
		
		label2.setOnKeyPressed((event) ->
		{
			System.out.println(txt1.getText());
		}
			);
		
		Label label3=new Label();
		label3.setLayoutX(100);
		label3.setLayoutY(140);
		
		label3.setOnKeyPressed((event) ->
		{
			System.out.println("=");
		}
			);
	
		Label label4=new Label();
		label4.setLayoutX(100);
		label4.setLayoutY(140);
		
		label4.setOnKeyPressed((event) ->
		{
			System.out.println();
		}
			);
			
		group.getChildren().add(txt);
		group.getChildren().add(txt1);
		group.getChildren().add(label);
		group.getChildren().add(label1);
		group.getChildren().add(label2);
		group.getChildren().add(label3);
		group.getChildren().add(label4);
		
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	
	}

}
