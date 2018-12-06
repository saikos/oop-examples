package org.afdemp.cb6.ex07;

import java.util.ArrayList;
import org.afdemp.cb6.ex03.geom.Point;

public class GenericsMotivatingExample {
    
    public static void main(String[] args) {
        //Create a list without using generics
        ArrayList list = new ArrayList();
        list.add("String");
        //We need to type-cast to get the value back in the proper type
        String s1 = (String) list.get(0);
        //And we can add whatever objects (of any types) we want to the list
        list.add(new Point(0, 0));        
        list.add(3);
        
        //With generics, we can create a list of Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("something");
        String s2 = strings.get(0);
    }
    
}
