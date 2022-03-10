package com.example.terraingenerationtest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class terrainGeneration extends Application {
    @Override
    public void start(Stage stage) {
        Path path = new Path();
        MoveTo moveTo = new MoveTo();
        int x = 0;
        int y = 0;
        for (int i = 0; i < 20; i++) {
            x = x + 10;
            int z = 0;
            z = z + 1;
            for (int j = 0; j < 1; j++) {
                if (z % 2 == 0) {
                    y = y + 10;
                } else {
                    y = y - 20;
                }
                LineTo line1 = new LineTo(x, y);
                path.getElements().add(moveTo);
                path.getElements().addAll(line1);
            }

        }
        Group root = new Group(path);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Drawing an arc through a path");
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();
    }
}
