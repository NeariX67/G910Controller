package com.nearix.g910controller;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.net.*;
import com.logitech.gaming.*;

public class G910Controller extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		
		stage.setTitle("G910 LED Controller by NeariX");
		stage.setWidth(400);
		stage.setHeight(390);
		stage.setMinHeight(390);
		stage.setMinWidth(400);
		stage.setMaxHeight(800);
		stage.setMaxWidth(800);
		stage.getIcons().add(new Image(G910Controller.class.getResourceAsStream("gaming-icon.png")));		
		

		if(!LogiLED.LogiLedInit()) {
			LogiLED.LogiLedSetLighting(0, 0, 0);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Logitech Gaming Software not found!");
			alert.setContentText("Make sure your Logitech Gaming software is running!");
			alert.showAndWait();
			System.exit(0);
		}		
		
		Rectangle rect = new Rectangle(300,30,50,50);
		Rectangle rect2 = new Rectangle(300, 145, 50, 50);
		
		TextField tfRed = new TextField();
		TextField tfGreen = new TextField();
		TextField tfBlue = new TextField();
		TextField tfRed2 = new TextField();
		TextField tfGreen2 = new TextField();
		TextField tfBlue2 = new TextField();
		TextField tfKeys = new TextField();
		TextField tfMulti = new TextField();
		tfRed.setLayoutX(200);
		tfRed.setLayoutY(20);
		tfRed.setPrefSize(50, 20);
		tfRed.setText("0");
		tfGreen.setLayoutX(200);
		tfGreen.setLayoutY(45);
		tfGreen.setPrefSize(50, 20);
		tfGreen.setText("0");
		tfBlue.setLayoutX(200);
		tfBlue.setLayoutY(70);
		tfBlue.setPrefSize(50, 20);
		tfBlue.setText("0");
		tfRed2.setLayoutX(200);
		tfRed2.setLayoutY(135);
		tfRed2.setPrefSize(50, 20);
		tfRed2.setText("0");
		tfGreen2.setLayoutX(200);
		tfGreen2.setLayoutY(160);
		tfGreen2.setPrefSize(50, 20);
		tfGreen2.setText("0");
		tfBlue2.setLayoutX(200);
		tfBlue2.setLayoutY(185);
		tfBlue2.setPrefSize(50, 20);
		tfBlue2.setText("0");
		tfKeys.setLayoutX(30);
		tfKeys.setLayoutY(220);
		tfMulti.setLayoutX(30);
		tfMulti.setLayoutY(255);
		
		Slider SRed = new Slider(0,100,0);
		Slider SGreen = new Slider(0,100,0);
		Slider SBlue = new Slider(0,100,0);
		Slider SRed2 = new Slider(0,100,0);
		Slider SGreen2 = new Slider(0,100,0);
		Slider SBlue2 = new Slider(0,100,0);
	    SRed.setLayoutX(40);
	    SRed.setLayoutY(25);
	    SGreen.setLayoutX(40);
	    SGreen.setLayoutY(50);
	    SBlue.setLayoutX(40);
	    SBlue.setLayoutY(75);
	    SRed2.setLayoutX(40);
	    SRed2.setLayoutY(140);
	    SGreen2.setLayoutX(40);
	    SGreen2.setLayoutY(165);
	    SBlue2.setLayoutX(40);
	    SBlue2.setLayoutY(190);
	    
		Button close = new Button();
		Button stop = new Button();
		Button rdm = new Button();
		Button apply = new Button();
		Button apply2 = new Button();
		Button reset = new Button();
		Button help = new Button();
		Button test = new Button();
		stop.setText("Stop Effects");
		stop.setLayoutX((stage.getWidth() - 170));
		stop.setLayoutY((stage.getHeight() - 80));
		close.setText("Close");
		close.setLayoutX((stage.getWidth() - 80));
		close.setLayoutY((stage.getHeight() - 80));
		rdm.setText("Random LEDs");
		rdm.setLayoutX(50);
		rdm.setLayoutY((stage.getHeight() - 80));
		apply.setText("Apply");
		apply.setLayoutX(200);
		apply.setLayoutY(220);
		apply2.setText("Apply");
		apply2.setLayoutX(200);
		apply2.setLayoutY(255);
		reset.setText("Reset");
		reset.setLayoutX(stage.getWidth() - 230);
		reset.setLayoutY(stage.getHeight() - 80);
		help.setText("?");
		help.setLayoutX(20);
		help.setLayoutY(stage.getHeight() - 80);
		test.setText("Test");
		test.setLayoutX(20);
		test.setLayoutY(stage.getHeight() - 90);
		
		Label LRed = new Label();
		Label LGreen = new Label();
		Label LBlue = new Label();
		Label LRed2 = new Label();
		Label LGreen2 = new Label();
		Label LBlue2 = new Label();
		Label LRGB = new Label();
		Label LPRGB = new Label();
		LRed.setText("Red: ");
		LRed.setLayoutY(25);
		LRed.setLayoutX(5);
		LRed.setTextFill(Color.web("#FF0000"));
		LGreen.setText("Green: ");
		LGreen.setLayoutY(50);
		LGreen.setLayoutX(5);
		LGreen.setTextFill(Color.web("#00FF00"));
		LBlue.setText("Blue: ");
		LBlue.setTextFill(Color.web("#0000FF"));
		LBlue.setLayoutY(75);
		LBlue.setLayoutX(5);
		LRed2.setText("Red: ");
		LRed2.setLayoutY(140);
		LRed2.setLayoutX(5);
		LRed2.setTextFill(Color.web("#FF0000"));
		LGreen2.setText("Green: ");
		LGreen2.setLayoutY(165);
		LGreen2.setLayoutX(5);
		LGreen2.setTextFill(Color.web("#00FF00"));
		LBlue2.setText("Blue: ");
		LBlue2.setTextFill(Color.web("#0000FF"));
		LBlue2.setLayoutY(190);
		LBlue2.setLayoutX(5);
		LRGB.setText("Full-RGB Controller:");
		LRGB.setLayoutX(5);
		LPRGB.setText("Per key RGB Controller: ");
		LPRGB.setLayoutY(120);
		LPRGB.setLayoutX(5);
		
		Pane pane = new Pane();
		pane.getChildren().addAll(LRed,LGreen, LBlue, LRed2, help, reset, apply, apply2, tfMulti, LRGB, LPRGB, tfKeys, LGreen2, LBlue2, close, SRed, SBlue, rect2, SGreen, rect, tfRed, tfGreen, tfBlue, stop, rdm, SRed2, SGreen2, SBlue2, tfRed2, tfGreen2, tfBlue2);
		stage.setScene(new Scene(pane, 300, 400, Color.BLACK));
		stage.show();
		
		close.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
            	LogiLED.LogiLedShutdown();
            	System.exit(0);
            }
        });
		stop.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				LogiLED.LogiLedStopEffects();
			}
		});
		rdm.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event ) {
				for(int i = 0;i < 118;i++) {
					int key = LogiLedKeys.convertRandom(i);
			        int Red = (int)(Math.random() * 100);
			        int Green = (int)(Math.random() * 100);
		         	int Blue = (int)(Math.random() * 100);  
					LogiLED.LogiLedSetLightingForKeyWithScanCode(key, Red, Green, Blue);
				}
			}
		});
		apply.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				for(int i = 0;i < tfKeys.getText().length(); i++) {
					char keys = tfKeys.getText().charAt(i);
					int taste = LogiLedKeys.convertsingle(keys);
					LogiLED.LogiLedSetLightingForKeyWithScanCode(taste, (int) SRed2.getValue(), (int) SGreen2.getValue(), (int) SBlue2.getValue());
				}
			}
		});
		apply2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				String[] splitted = tfMulti.getText().split(",");
				for(int i = 0; i < splitted.length; i++) {
					int taste = LogiLedKeys.convertmulti(splitted[i]);
					LogiLED.LogiLedSetLightingForKeyWithScanCode(taste, (int) SRed2.getValue(),	(int) SGreen2.getValue(), (int) SBlue2.getValue());
					System.out.println(taste);
				}
			}
		});
		reset.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				SRed.setValue(0);
				SRed2.setValue(0);
				SGreen.setValue(0);
				SGreen2.setValue(0);
				SBlue.setValue(0);
				SBlue2.setValue(0);
				tfKeys.setText("");
				tfMulti.setText("");
				LogiLED.LogiLedSetLighting(0, 0, 0);
			}
		});
		help.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				openWebpage("https://hastebin.com/siricakeno.sql");
			}
		});
				
		SRed.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect.setFill(Color.rgb((int) (SRed.getValue() * 2.55), (int) (SGreen.getValue() * 2.55), (int) (SBlue.getValue() * 2.55)));
				tfRed.setText(String.valueOf((int) SRed.getValue()));
				LogiLED.LogiLedSetLighting((int) SRed.getValue(), (int) SGreen.getValue(), (int) SBlue.getValue());
	        }
	    });
		SGreen.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect.setFill(Color.rgb((int) (SRed.getValue() * 2.55), (int) (SGreen.getValue() * 2.55), (int) (SBlue.getValue() * 2.55)));
				tfGreen.setText(String.valueOf((int) SGreen.getValue()));
				LogiLED.LogiLedSetLighting((int) SRed.getValue(), (int) SGreen.getValue(), (int) SBlue.getValue());
	        }
	    });
		SBlue.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect.setFill(Color.rgb((int) (SRed.getValue() * 2.55), (int) (SGreen.getValue() * 2.55), (int) (SBlue.getValue() * 2.55)));
				tfBlue.setText(String.valueOf((int) SBlue.getValue()));
				LogiLED.LogiLedSetLighting((int) SRed.getValue(), (int) SGreen.getValue(), (int) SBlue.getValue());
	        }
	    });
		SRed2.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect2.setFill(Color.rgb((int) (SRed2.getValue() * 2.55), (int) (SGreen2.getValue() * 2.55), (int) (SBlue2.getValue() * 2.55)));
				tfRed2.setText(String.valueOf((int) SRed2.getValue()));
	        }
	    });
		SGreen2.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect2.setFill(Color.rgb((int) (SRed2.getValue() * 2.55), (int) (SGreen2.getValue() * 2.55), (int) (SBlue2.getValue() * 2.55)));
				tfGreen2.setText(String.valueOf((int) SGreen2.getValue()));
	        }
	    });
		SBlue2.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
				rect2.setFill(Color.rgb((int) (SRed2.getValue() * 2.55), (int) (SGreen2.getValue() * 2.55), (int) (SBlue2.getValue() * 2.55)));
				tfBlue2.setText(String.valueOf((int) SBlue2.getValue()));
	        }
	    });
		tfRed.textProperty().addListener((observable, oldValue, newValue) -> {
			SRed.setValue((double) Integer.parseInt(newValue));
		});
		tfGreen.textProperty().addListener((observable, oldValue, newValue) -> {
			SGreen.setValue((double) Integer.parseInt(newValue));
		});
		tfBlue.textProperty().addListener((observable, oldValue, newValue) -> {
			SBlue.setValue((double) Integer.parseInt(newValue));
		});
		tfRed2.textProperty().addListener((observable, oldValue, newValue) -> {
			SRed2.setValue((double) Integer.parseInt(newValue));
		});
		tfGreen2.textProperty().addListener((observable, oldValue, newValue) -> {
			SGreen2.setValue((double) Integer.parseInt(newValue));
		});
		tfBlue2.textProperty().addListener((observable, oldValue, newValue) -> {
			SBlue2.setValue((double) Integer.parseInt(newValue));
		});
		
		stage.widthProperty().addListener((obs, oldVal, newVal) -> {
			close.setLayoutX((stage.getWidth() - 80));
			stop.setLayoutX((stage.getWidth() - 170));
			reset.setLayoutX(stage.getWidth() - 230);
		});
		stage.heightProperty().addListener((obs, oldVal, newVal) -> {
			close.setLayoutY(stage.getHeight() - 80);
			stop.setLayoutY(stage.getHeight() - 80);
			rdm.setLayoutY(stage.getHeight() - 80);
			reset.setLayoutY(stage.getHeight() - 80);
			help.setLayoutY(stage.getHeight() - 80);
		});
		stage.setOnCloseRequest(event -> {
			LogiLED.LogiLedShutdown();
		});
	}
	public static void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
