package biler;

public class Student implements IPencil {

    private String name;

    private IPencil pencil;

    public Student(String name, IPencil pencil) {
        pencil = pencil;
        this.name = name;
    }

    public void drawCar(Car car) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return name;
    }
}