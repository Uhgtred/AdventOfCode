import kotlin.Pair;

import java.util.Collections;
import java.util.List;

public class Main {
    List<Pair<Integer, Integer>>  creatSortedPairsList(List<Integer> list1, List<Integer> list2 ) {
        Collections.sort(list1);
        System.out.println(list1);
        return list1.stream().map(list1).toArray();
    }

    public static void main(String[] args) {

    }
}

List<Pair<Integer, Integer>> myList = Main().createSortedPairsList