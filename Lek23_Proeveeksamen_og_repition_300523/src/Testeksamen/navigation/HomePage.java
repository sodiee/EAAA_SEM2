package Testeksamen.navigation;

import java.util.ArrayList;

public class HomePage
extends NavigationComponent {
    private NavigationComponent root;
    private ArrayList<NavigationComponent> children;
    public HomePage(NavigationComponent root)
    {
        this.root = root;
        children = new ArrayList<>();
    }

    public void addChildren(NavigationComponent navigationComponent) {
        children.add(navigationComponent);
    }

    public ArrayList<NavigationComponent> getChildren() {
        return children;
    }
    public void print()
    {
        root.print();
    }

    @Override
    public String toString() {
        return "HomePage{" +
                "root=" + root +
                ", children=" + children +
                '}';
    }
}
