package Testeksamen.navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private NavigationComponent root;
    private String name;

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    public void addChildren(NavigationComponent navigationComponent) {
         super.addChild(navigationComponent);
    }

    public ArrayList<NavigationComponent> getChildren() {
        return super.getChildren();
    }

    @Override
    public String toString() {
        return "NavigationMenu{" +
                "name='" + name + '\'' +
                '}';
    }
}
