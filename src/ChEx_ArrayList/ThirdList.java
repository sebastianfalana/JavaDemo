package ChEx_ArrayList;

import java.util.List;

public class ThirdList {
    private List<First> firstList;

    public ThirdList(List<First> firstList) {
        this.firstList = firstList;
    }

    public List<First> getFirstList() {
        return firstList;
    }

    public void printFirst() {
        for (First firsts :
                firstList) {
            System.out.println("Zawartość firstList: " + firsts.getFirstListValue());
        }

    }
}
