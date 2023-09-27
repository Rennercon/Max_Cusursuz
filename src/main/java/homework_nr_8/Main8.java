package homework_nr_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<String> StringList = new ArrayList<>();
        StringList.add("Xenia");
        StringList.add("Oleg");
        StringList.add("Nicu");
        StringList.add("Mihail");
        StringList.add("Konstantin");
        StringList.add("Oleg");
        StringList.add("Mihail");


        System.out.println(showUniqueArguments(StringList));
        System.out.println(showToDoList());
        Dictionary();

    }
    public static String showUniqueArguments(ArrayList<String> StringList){
        HashSet<String> Unique = new HashSet<>();
        Unique.addAll(StringList);
        return String.valueOf(Unique);
    }
    public static String showToDoList(){
        ArrayList<String> Tasks = new ArrayList<>();
        Tasks.add("Make a method which show tasks of homework");
        Tasks.add("Get unique elements from Arraylist");
        Tasks.add("Make a dictionary");
        return String.valueOf(Tasks);
    }
    public static void Dictionary(){
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("mere", "apple");
        dictionary.put("salut", "hello");
        dictionary.put("bun", "good");
        dictionary.put("drum", "road");
        dictionary.put("sora", "sister");
        dictionary.put("minge", "ball");
        dictionary.put("copac", "tree");
        dictionary.put("pat", "bad");
        dictionary.put("fulger", "lightning");
        dictionary.put("soare", "Sun");
        System.out.println(dictionary);
        System.out.println(dictionary.get("mere"));
    }
}
