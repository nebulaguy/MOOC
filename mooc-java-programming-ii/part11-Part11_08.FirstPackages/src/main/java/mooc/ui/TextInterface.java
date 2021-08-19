package mooc.ui;

import mooc.ui.UserInterface;

public class TextInterface implements UserInterface {

    @Override
    public void update() {
        System.out.println("Updating UI");
    }

}
