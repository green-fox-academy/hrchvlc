package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> fuckingThing = new ArrayList<>();

    public void removeTrash(){
        for (Sharpie sharpie: getFuckingThing()) {
            if (sharpie.getInkAmount() == 0) {
                fuckingThing.remove(sharpie);
            } else {
                System.out.println("Everything is fucking beautiful.");
            }

        }
    }

    public List<Sharpie> getFuckingThing() {
        return fuckingThing;
    }
}
