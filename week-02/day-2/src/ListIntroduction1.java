import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[]args){

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);

        names.add("William");

        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");

        System.out.println(names);
    }
}
