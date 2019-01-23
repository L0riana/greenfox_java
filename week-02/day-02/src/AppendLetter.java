import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // The output should be: "kutya", "macska", "kacsa", "róka", "halacska"

        System.out.println(appendA(far));
    }
    public static String appendA(List<String> appendListWithA){
        for (int i = 0; i < appendListWithA.size(); i++) {
            appendListWithA.set(i, appendListWithA.get(i) + "a");
        }
        return appendListWithA.toString();
    }
}

