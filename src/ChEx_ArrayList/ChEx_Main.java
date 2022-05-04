package ChEx_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ChEx_Main {

    public static void main(String[] args) {

        //        List<String> actors = new ArrayList<>();
//        actors.add("AA");
//        actors.add("BB");
//        actors.add("CC");
//
//        List<Actor> actorsSecond = new ArrayList<>();
//        actorsSecond.add(new Actor("AA", "LA"));
//        actorsSecond.add(new Actor("BB", "LB"));
//        actorsSecond.add(new Actor("CC", "LC"));
//
//        for (String act :
//                actors) {
//            System.out.println(act);
//        }
//
//        for (Actor act2 :
//                actorsSecond) {
//            System.out.println(act2.getFirstName() + " " + act2.getLastName());
//        }

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
