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

        System.out.println(names.size());

        System.out.println(names.get(2));

        System.out.println("---");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }

        System.out.println("---");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i+1 + ". " + names.get(i));
        }
        System.out.println(names.remove(1));

        System.out.println("---");

        for (int j = names.size()-1; j >= 0 ; j--) {
            System.out.println(names.get(j));
        }
        System.out.println("---");
        names.clear();
        System.out.println(names.isEmpty());
    }
}
