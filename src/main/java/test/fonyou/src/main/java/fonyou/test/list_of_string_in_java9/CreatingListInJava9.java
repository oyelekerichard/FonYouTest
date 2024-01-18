package fonyou.test.list_of_string_in_java9;

import java.util.List;

public class CreatingListInJava9 {

    public static void main(String[] args)  {

//        initialize a string list which contains color names
        List<String> colours = List.of("Red", "Black", "Yellow", "Pink", "Orange");

//        print to the console the list of colours declared above
        colours.forEach(e -> System.out.println(e));
    }
}
