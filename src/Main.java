import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> listOfNames=new ArrayList<>();
        listOfNames.add("Manasa");
        listOfNames.add("Anji");
        listOfNames.add("ManaAn");
        listOfNames.add("Chicago");
        System.out.println(listOfNames.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}