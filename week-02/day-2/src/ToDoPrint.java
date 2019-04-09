public class ToDoPrint {

    public static void main(String... args){
        StringBuilder toDoText = new StringBuilder(" - Buy milk\n");

        toDoText.insert(0, "My to do list: \n");

        toDoText.append(" - Download games\n");
        toDoText.append(" - Diablo");


// Add "My to to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
// Expected outpt:
// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
        System.out.println(toDoText);
    }
}
