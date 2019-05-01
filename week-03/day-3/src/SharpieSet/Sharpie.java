package SharpieSet;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }
    public void use(){
        inkAmount--;
    }
    public String countUsable(){
        if (inkAmount != 0) {
            return "usable";
        } else {
            return "not usable";
        }
    }

    public float getInkAmount() {
        return inkAmount;
    }
}
