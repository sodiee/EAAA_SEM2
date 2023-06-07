package biler;

import javafx.scene.paint.Color;

import java.awt.*;

public class Car {

    private Color color;
    private int doors;
    private int wheels;

    public Car(Color color, int doors, int wheels) {
        this.color = color;
        this.doors = doors;
        this.wheels = wheels;
    }

    public Color getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getSize() {
        return "Big";
    }

    public boolean getStripes() {
        return true;
    }

    public String getBrand() {
        return "Volkswagen";
    }

    public int getWindows() {
        return getDoors();
    }
}
