package biler;

import javafx.scene.paint.Color;

import java.awt.*;

public class Paint {

    private String name;
    private Color color;

    public Paint(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name;
    }
}