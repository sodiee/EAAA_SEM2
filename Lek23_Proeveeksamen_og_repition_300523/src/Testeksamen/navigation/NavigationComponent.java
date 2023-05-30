package Testeksamen.navigation;

import java.util.ArrayList;

public abstract class NavigationComponent {
    private ArrayList<NavigationComponent> children = new ArrayList<>();
    private String name;
    private String link;

    public void addChild(NavigationComponent navigationComponent) {
        if (navigationComponent != null) {
            children.add(navigationComponent);
        }
    }

    public ArrayList<NavigationComponent> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public void print() {
        System.out.println("Root: " + this);

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
            for (int j = 0; j < children.get(i).getChildren().size() ; j++) {
                System.out.println(children.get(i).getChildren().get(j));
            }
        }
    }
}
