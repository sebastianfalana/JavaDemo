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

    public void print() {
        for (First firsts :
                firstList) {
            System.out.println(firsts.getFirstListValue());
        }

    }
}
