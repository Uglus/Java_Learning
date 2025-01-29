package Lecture_27;

import Base.Lecture;

import java.util.ArrayList;
import java.util.List;

public class Lecture27 extends Lecture {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        print(list.isEmpty());
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        for(String element : list)
            print(element);

        list.remove("first");
        for(int i = 0;i<list.size();i++){
            print("i " + i + " item " + list.get(i));
        }


        print(list.contains("first"));

    }

}
