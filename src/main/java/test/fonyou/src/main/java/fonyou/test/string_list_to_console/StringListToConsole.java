package fonyou.test.string_list_to_console;

import java.util.ArrayList;
import java.util.List;

public class StringListToConsole {

    public static void runFromHere()  {
//        Given the following list, write the content of it to the console. List<String> colours;

//        declare an empty list and initialize it as an arraylist
        List<String> colorList = new ArrayList<>();

//        Adding elements which are tyoes of colors in the List
        colorList.add("blue");
        colorList.add("red");
        colorList.add("white");
        colorList.add("black");
        colorList.add("pink");

//        Iterating the List element using for-each loop
        for (String color : colorList)
            System.out.println("THIS LIST CONTAINS THIS COLOURS :: " + color);
    }
}
