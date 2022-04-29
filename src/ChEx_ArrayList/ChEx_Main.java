package ChEx_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ChEx_Main {

    public static void main(String[] args) {

        List<First> listFirst1 = new ArrayList<>();
        listFirst1.add(new First("Jabłko"));
        listFirst1.add(new First("Gruszka"));

        List<First> listFirst2 = new ArrayList<>();
        listFirst2.add(new First("Porzeczka"));
        listFirst2.add(new First("Wiśnia"));
        listFirst2.add(new First("Malina"));
        listFirst2.add(new First("Jabłko"));

        List<ThirdList> listThird1 = new ArrayList<>();
        listThird1.add(new ThirdList(listFirst1));

        for (ThirdList thirdLists :
                listThird1) {
            thirdLists.print();
        }

//        for (First firsts :
//                listFirst1) {
//            firsts.print();
//        }

    }
}
